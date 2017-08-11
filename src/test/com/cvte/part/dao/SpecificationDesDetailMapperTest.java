package com.cvte.part.dao;

import com.cvte.part.bean.SpecificationDesDetail;
import com.cvte.part.bean.SpecificationDesDetailExample;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import java.util.*;
import static org.junit.Assert.*;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:applicationContext.xml"})
public class SpecificationDesDetailMapperTest {
    @Autowired
    SpecificationDesDetailMapper specificationDesDetailMapper;

    @Test
    public void insert() throws Exception {
        specificationDesDetailMapper.insert(new SpecificationDesDetail(UUID.randomUUID().toString().replace("-",""),"长度","10","9d46a9a878f94308a5bc075254f45670"));
        specificationDesDetailMapper.insert(new SpecificationDesDetail(UUID.randomUUID().toString().replace("-",""),"颜色","蓝","9d46a9a878f94308a5bc075254f45670"));
    }
    @Test
    public void selectByExample() throws Exception{
        SpecificationDesDetailExample specificationDesDetailExample = new SpecificationDesDetailExample();
        SpecificationDesDetailExample.Criteria criteria = specificationDesDetailExample.createCriteria();
        criteria.andPropertyNameEqualTo("颜色");
        criteria.andPropertyValueEqualTo("红");
        criteria.andPropertyNameEqualTo("长度");
        criteria.andPropertyValueEqualTo("10");
        List<SpecificationDesDetail> list=specificationDesDetailMapper.selectByExample(specificationDesDetailExample);
    }
}