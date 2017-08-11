package com.cvte.part.service;

import com.cvte.part.bean.Property;
import com.cvte.part.bean.PropertyExample;
import com.cvte.part.dao.PropertyMapper;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import java.util.List;

import static org.junit.Assert.*;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:applicationContext.xml"})
public class PropertyServiceTest {
    @Autowired
    PropertyMapper propertyMapper;
    @Test
    public void getPropertyListByRuleId() throws Exception {
        PropertyExample propertyExample = new PropertyExample();
        PropertyExample.Criteria criteria = propertyExample.createCriteria();
        criteria.andPartClassIdEqualTo("ec285756c44f4654ac004afd619680a1");
        List<Property> list = propertyMapper.selectByExample(propertyExample);
    }

}