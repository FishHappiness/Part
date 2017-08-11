package com.cvte.part.dao;

import com.cvte.part.bean.PartItem;
import com.cvte.part.bean.PartItemExample;
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
public class PartItemMapperTest {
    @Autowired
    PartItemMapper partItemMapper;
    @Test
    public void insert() throws Exception {
        //partItemMapper.insert(new PartItem(UUID.randomUUID().toString().replace("-",""),"004.001.001",null,null));
        partItemMapper.insert(new PartItem(UUID.randomUUID().toString().replace("-",""),"004.001.0010",null,null));
    }
    @Test
    public void selectByExample() throws Exception{
        PartItemExample partItemExample = new PartItemExample();
        PartItemExample.Criteria criteria = partItemExample.createCriteria();
        criteria.andSpecDesIdIsNull();
        List<PartItem> list = partItemMapper.selectByExample(partItemExample);
    }
}