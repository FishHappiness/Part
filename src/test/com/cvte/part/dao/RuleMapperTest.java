package com.cvte.part.dao;

import com.cvte.part.bean.Rule;
import com.cvte.part.bean.RuleExample;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;
import java.util.UUID;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:applicationContext.xml"})
public class RuleMapperTest {

    @Autowired
    private RuleMapper ruleMapper;
    @Autowired
    private PropertyMapper propertyMapper;
    @Test
    public void selectByExample() throws Exception {
        RuleExample ruleExample = new RuleExample();
        RuleExample.Criteria criteria = ruleExample.createCriteria();
        criteria.andRuleNameEqualTo("rule5");
        List<Rule> rules = ruleMapper.selectByExample(ruleExample);
        System.out.println(rules);
    }
    @Test
    public void insert() throws Exception{
        ruleMapper.insert(new Rule(UUID.randomUUID().toString().replace("-",""),"rule4"));
    }


}