package com.cvte.part.service;

import com.cvte.part.bean.Property;
import com.cvte.part.bean.PropertyExample;
import com.cvte.part.dao.PropertyMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PropertyService {
    @Autowired
    private PropertyMapper propertyMapper;

    /**
     * 根据ruleId获取属性列表
     * @param ruleId
     * @return List<Property>
     */
    public List<Property> getPropertyListByRuleId(String ruleId){
        PropertyExample propertyExample = new PropertyExample();
        PropertyExample.Criteria criteria = propertyExample.createCriteria();
        criteria.andPartClassIdEqualTo(ruleId);
        List<Property> list = propertyMapper.selectByExample(propertyExample);
        return list;
    }
    /**
     * 根据ruleId获取属性列表
     * @param propertyName
     * @return Property
     */
    public Property getPropertyByName(String propertyName){
        PropertyExample propertyExample = new PropertyExample();
        PropertyExample.Criteria criteria = propertyExample.createCriteria();
        criteria.andPropertyNameEqualTo(propertyName);
        List<Property> list = propertyMapper.selectByExample(propertyExample);
        return list.get(0);
    }
    /**
     * 更新属性
     * @param property
     * @return void
     */
    public void updateProperty(Property property){
        propertyMapper.updateByPrimaryKey(property);
    }
}
