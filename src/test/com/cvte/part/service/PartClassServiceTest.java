package com.cvte.part.service;

import com.cvte.part.bean.PartClass;
import com.cvte.part.bean.PartClassExample;
import com.cvte.part.dao.PartClassMapper;
import com.cvte.part.dao.PropertyMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

import static org.junit.Assert.*;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:applicationContext.xml"})
public class PartClassServiceTest {
    @Autowired
    PartClassMapper partClassMapper;
    @Autowired
    private PropertyMapper propertyMapper;

}