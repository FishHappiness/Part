package com.cvte.part.controller;

import com.cvte.part.bean.*;
import com.cvte.part.service.PartService;
import com.cvte.part.service.PropertyService;
import com.cvte.part.service.RuleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class RuleController {
    @Autowired
    private PartService partService;
    @Autowired
    private RuleService ruleService;
    @Autowired
    private PropertyService propertyService;

    /**
     * 为物料分类设置规则,并关联到属性中
     * @param ruleCustom
     * @return Msg
     */
    @RequestMapping(value = "/rulePartClass",method= RequestMethod.POST)
    @ResponseBody
    public Msg saveRuleByPartClassName(@RequestBody RuleCustom ruleCustom){
        System.out.println(ruleCustom);
        ruleService.insertRule(ruleCustom.getRule());
        PartClass partClass = partService.getPartClassByName(ruleCustom.getPartClassName());
        //该分类还未关联规则
        if(partClass.getRuleId() == null){
            partClass.setRuleId(ruleService.getRuleByRuleName(ruleCustom.getRule().getRuleName()).getRuleId());
            partService.updatePartClass(partClass);
            System.out.println(partClass);
        }
        //绑定该分类的规则描述
        if(ruleCustom.getRuleDes() != null){
            String []properties = ruleCustom.getRuleDes().split(",");
            System.out.println(properties[0]+"--"+properties[1]);
            for(int i=0;i<properties.length;i++){
                Property property =propertyService.getPropertyByName(properties[i]);
                if(property.getPartClassId().equals(partClass.getPartClassId())){
                    property.setRuleId(partClass.getRuleId());
                    propertyService.updateProperty(property);//更新属性
                    System.out.println(property);
                }
            }
        }
        return Msg.success();
    }

}
