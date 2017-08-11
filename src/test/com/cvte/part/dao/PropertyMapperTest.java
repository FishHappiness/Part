package com.cvte.part.dao;

import com.cvte.part.bean.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

import static org.junit.Assert.*;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:applicationContext.xml"})
public class PropertyMapperTest {
    @Autowired
    private PartClassMapper partClassMapper;
    @Autowired
    private RuleMapper ruleMapper;
    @Autowired
    private PartClass partClass;
    @Autowired
    private PropertyMapper propertyMapper;

    //根据partClassId查询属性列表，并设置属性的ruleId,最后保存
    @Test
    public void selectByExample() throws Exception {
        PropertyExample propertyExample = new PropertyExample();
        PropertyExample.Criteria criteria = propertyExample.createCriteria();
        criteria.andPartClassIdEqualTo("dc426b6e57da4f2b9d1410c76d138b8d");
        List<Property> list = propertyMapper.selectByExample(propertyExample);
        //System.out.println(list);
        for(int i = 0; i<list.size();i++){
            list.get(i).setRuleId("ec285756c44f4654ac004afd619680a1");
            propertyMapper.updateByPrimaryKey(list.get(i));
        }

    }

}