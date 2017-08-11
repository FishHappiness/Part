package com.cvte.part.service;

import com.cvte.part.bean.*;
import com.cvte.part.dao.PartClassMapper;
import com.cvte.part.dao.PartItemMapper;
import com.cvte.part.dao.PropertyMapper;
import com.cvte.part.dao.RuleMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class PartService {
    @Autowired
    private PartClassMapper partClassMapper;
    @Autowired
    private PartItemMapper partItemMapper;
    @Autowired
    private RuleMapper ruleMapper;
    @Autowired
    private PropertyMapper propertyMapper;

    /**
     * 根据分类名称获得规则描述
     * @param partClassName
     * @return List<String>
     */
    public List<String> getRuleDesByPartClassName(String partClassName){
        PartClass partClass = getPartClassByName(partClassName);
        String ruleId = partClass.getRuleId();
        PropertyExample propertyExample = new PropertyExample();
        PropertyExample.Criteria criteria = propertyExample.createCriteria();
        criteria.andRuleIdEqualTo(ruleId);
        List<Property> list = propertyMapper.selectByExample(propertyExample);
        ArrayList<String> ss = new ArrayList<String>(list.size());
        for(int i=0; i<list.size();i++){
            ss.add(list.get(i).getPropertyName());
        }
        return ss;
    }

    /**
     * 根据分类Id获得规则描述
     * @param partClassId
     * @return List<String>
     */
    public List<String> getRuleDesByPartClassId(String partClassId){
        PartClass partClass = getPartClassById(partClassId);
        String ruleId = partClass.getRuleId();
        PropertyExample propertyExample = new PropertyExample();
        PropertyExample.Criteria criteria = propertyExample.createCriteria();
        criteria.andRuleIdEqualTo(ruleId);
        List<Property> list = propertyMapper.selectByExample(propertyExample);
        ArrayList<String> ss = new ArrayList<String>(list.size());
        for(int i=0; i<list.size();i++){
            ss.add(list.get(i).getPropertyName());
        }
        return ss;
    }

    /**
     * 根据物料分类名称查询物料分类
     * @param partClassName
     * @return PartClass
     */
    public PartClass getPartClassByName(String partClassName){
        PartClassExample partClassExample = new PartClassExample();
        PartClassExample.Criteria criteria = partClassExample.createCriteria();
        criteria.andPartNameEqualTo(partClassName);
        List<PartClass> list = partClassMapper.selectByExample(partClassExample);
        return list.get(0);
    }
    /**
     * 根据物料分类Id查询物料分类
     * @param partClassId
     * @return PartClass
     */
    public PartClass getPartClassById(String partClassId){
        PartClassExample partClassExample = new PartClassExample();
        PartClassExample.Criteria criteria = partClassExample.createCriteria();
        criteria.andPartClassIdEqualTo(partClassId);
        List<PartClass> list = partClassMapper.selectByExample(partClassExample);
        return list.get(0);
    }
    /**
     * 根据物料Id查询物料分类Id
     * @param partItemId
     * @return PartItem
     */
    public PartItem getPartClassIdByPartItemId(String partItemId){
        return  partItemMapper.selectByPrimaryKey(partItemId);
    }


    /**
     * 分类新增规则
     * @param partClass,rule
     * @return Rule
     */
    public void saveRule(PartClass partClass,Rule rule){
        if(!isPartClassWithRuleByName(partClass.getPartName())){
            rule.setRuleId(UUID.randomUUID().toString().replace("-",""));
            ruleMapper.insert(rule);//注意要设置UUID
            String ruleId = rule.getRuleId();
            partClass.setRuleId(ruleId);//将ruleId绑定分类并保存
            PropertyExample propertyExample;
            propertyExample = new PropertyExample();
            PropertyExample.Criteria criteria = propertyExample.createCriteria();
            criteria.andPartClassIdEqualTo(partClass.getPartClassId());
            List<Property> list = propertyMapper.selectByExample(propertyExample);//先根据partclassId查询属性列表
            for(int i = 0; i<list.size();i++){//然后将ruleId绑定属性,同时绑定属性并保存
                list.get(i).setRuleId(ruleId);
                propertyMapper.updateByPrimaryKey(list.get(i));
            }
        }
    }
    /**
     * 获取当前分类下的规则
     * @param partclass
     * @return Rule
     */
    public Rule getPartClassWithRule(PartClass partclass){
        if(isPartClassWithRuleByName(partclass.getPartName())){
            Rule rule = ruleMapper.selectByPrimaryKey(partclass.getRuleId());
            return rule;
        }
        return null;
    }

    /**
     * 判断物料分类名称查询该类物料是否存在规则
     * @param partClassName
     * @return boolean
     */
    public boolean isPartClassWithRuleByName(String partClassName){
        //参数如果为空直接抛出异常
        PartClassExample partClassExample = new PartClassExample();
        PartClassExample.Criteria criteria = partClassExample.createCriteria();
        criteria.andPartNameEqualTo(partClassName);
        List<PartClass> list = partClassMapper.selectByExample(partClassExample);
        return (list.size() == 1 && list.get(0) != null) ? true : false;
    }
    /**
     * 根据规格描述Id查询物料
     * @param specDesId
     * @return List<PartItem>
     */
    public List<PartItem> getPartItem(String specDesId){
        PartItemExample partItemExample = new PartItemExample();
        PartItemExample.Criteria criteria = partItemExample.createCriteria();
        criteria.andSpecDesIdEqualTo(specDesId);
        List<PartItem> list = partItemMapper.selectByExample(partItemExample);
        return list;
    }
    /**
     * 查询非关联物料列表
     * @param
     * @return List<PartItem>
     */
    public List<PartItem> getPartItemWithoutSpec(){
        PartItemExample partItemExample = new PartItemExample();
        PartItemExample.Criteria criteria = partItemExample.createCriteria();
        criteria.andSpecDesIdIsNull();
        List<PartItem> list = partItemMapper.selectByExample(partItemExample);
        System.out.println(list);
        return list;
    }
    /**
     * 更新物料分类
     * @param newpartClass
     * @return void
     */
    public void updatePartClass(PartClass newpartClass){
        partClassMapper.updateByPrimaryKey(newpartClass);
    }
    /**
     * 更新物料
     * @param newpartItem
     * @return void
     */
    public void updatePartItem(PartItem newpartItem){
        partItemMapper.updateByPrimaryKey(newpartItem);
    }
}
