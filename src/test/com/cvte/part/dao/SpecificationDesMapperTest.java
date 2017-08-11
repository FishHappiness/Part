package com.cvte.part.dao;

import com.cvte.part.bean.SpecificationDes;
import com.cvte.part.bean.SpecificationDesExample;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;
import java.util.UUID;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:applicationContext.xml"})
public class SpecificationDesMapperTest {

    @Autowired
    SpecificationDesMapper specificationDesMapper;

    @Test
    public void insert() throws Exception {
        specificationDesMapper.insert(new SpecificationDes(UUID.randomUUID().toString().replace("-",""),"sp003","ec285756c44f4654ac004afd619680a1"));
    }

    @Test
    public void selectByExample() throws Exception {
        SpecificationDesExample specificationDesExample = new SpecificationDesExample();
        SpecificationDesExample.Criteria criteria = specificationDesExample.createCriteria();
        criteria.andRuleIdEqualTo("ec285756c44f4654ac004afd619680a1");
        List<SpecificationDes> list = specificationDesMapper.selectByExample(specificationDesExample);
    }
}