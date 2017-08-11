package com.cvte.part.service;

import com.cvte.part.bean.Rule;
import com.cvte.part.bean.SpecificationDes;
import com.cvte.part.bean.SpecificationDesDetail;
import com.cvte.part.bean.SpecificationDesDetailExample;
import com.cvte.part.dao.RuleMapper;
import com.cvte.part.dao.SpecificationDesDetailMapper;
import com.cvte.part.dao.SpecificationDesMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class SpecificationService {

    @Autowired
    private RuleMapper ruleMapper;
    @Autowired
    private SpecificationDesMapper specificationDesMapper;
    @Autowired
    private SpecificationDesDetailMapper specificationDesDetailMapper;
    /**
     * 新增规则对应的规格描述
     * @param rule
     * @return List<SpecificationDes>
     */
    public void saveSpecificatonDes(SpecificationDes specificationDes, Rule rule){
        specificationDes.setRuleId(rule.getRuleId());
        specificationDesMapper.insert(specificationDes);
    }

    /**
     * 根据规则查询对应的规格描述列表
     * @param rule
     * @return List<SpecificationDes>
     */
    public List<SpecificationDes> getSpecificatonDesByRule(Rule rule){
     //   specificationDesMapper.selectByPrimaryKey()
        return null;
    }
    /**
     * 根据规则描述属性名称和属性值查询规格描述
     * @param propertyName,propertyValue
     * @return List<SpecificationDesDetail>
     */
    public List<SpecificationDesDetail> getSpecificatonDesByPropertyName(String propertyName,String propertyValue){
        SpecificationDesDetailExample specificationDesDetailExample = new SpecificationDesDetailExample();
        SpecificationDesDetailExample.Criteria criteria = specificationDesDetailExample.createCriteria();
        criteria.andPropertyNameEqualTo(propertyName);
        criteria.andPropertyValueEqualTo(propertyValue);
        List<SpecificationDesDetail> list=specificationDesDetailMapper.selectByExample(specificationDesDetailExample);
        return list;
    }
    /**
     * 根据规则Id 新建规格描述
     * @param ruleId
     * @return List<SpecificationDesDetail>
     */
    public String saveSpecicationByRuleId(String ruleId){
        String specId = UUID.randomUUID().toString().replace("-","");
        specificationDesMapper.insert(new SpecificationDes(specId,"sp"+ruleId.substring(0,5),ruleId));
        return specId;
    }

    /**
     * 保存规格描述详情
     * @param specificationDesDetail
     * @return List<SpecificationDesDetail>
     */
    public void saveSpecificationDetail(SpecificationDesDetail specificationDesDetail){
        specificationDesDetail.setSpecDesDetailId(UUID.randomUUID().toString().replace("-",""));
        specificationDesDetailMapper.insert(specificationDesDetail);
    }
}
