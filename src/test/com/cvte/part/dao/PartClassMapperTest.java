package com.cvte.part.dao;

import com.cvte.part.bean.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import java.util.*;
import static org.junit.Assert.*;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:applicationContext.xml"})
public class PartClassMapperTest {
    @Autowired
    PartClassMapper partClassMapper;
    @Autowired
    PropertyMapper propertyMapper;
    @Test
    public void selectByExample() throws Exception {
        PartClassExample partClassExample = new PartClassExample();
        PartClassExample.Criteria criteria = partClassExample.createCriteria();
        criteria.andPartNameEqualTo("电路板");
        List<PartClass> list = partClassMapper.selectByExample(partClassExample);

    }
    @Test
    public void getRuleDes() throws Exception {
        PropertyExample propertyExample = new PropertyExample();
        PropertyExample.Criteria criteria1 = propertyExample.createCriteria();
        criteria1.andRuleIdEqualTo("ec285756c44f4654ac004afd619680a1");
        List<Property> list = propertyMapper.selectByExample(propertyExample);
        System.out.println(list);
        List<String> ss = new ArrayList<String>(list.size());
        for(int i=0 ; i<list.size() ;i++){
            ss.add(list.get(i).getPropertyName());
        }
        System.out.println(ss);
    }
    @Test
    public void insert()throws Exception{
        propertyMapper.insert(new Property(UUID.randomUUID().toString().replace("-",""),"油印","2f4d829a8445485fbb7c4a58ec8bad2e",null));
    }
    @Test
    public void selectByExample1() throws Exception{
        PropertyExample propertyExample = new PropertyExample();
        PropertyExample.Criteria criteria = propertyExample.createCriteria();
        criteria.andPropertyNameEqualTo("油印");
        List<Property> list = propertyMapper.selectByExample(propertyExample);
    }


}