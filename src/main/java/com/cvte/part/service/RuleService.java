package com.cvte.part.service;

import com.cvte.part.bean.PartClass;
import com.cvte.part.bean.Rule;
import com.cvte.part.bean.RuleCustom;
import com.cvte.part.bean.RuleExample;
import com.cvte.part.dao.PartClassMapper;
import com.cvte.part.dao.RuleMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.*;
@Service
public class RuleService {
    @Autowired
    private RuleMapper ruleMapper;
    @Autowired
    private PartClassMapper partClassMapper;
    /**
     * 为物料分类设置规则
     * @param partClass,rule
     * @return void
     */
    public void setRuleByPartClass(PartClass partClass,Rule rule){
        if(partClass.getRuleId() == null){
            partClass.setRuleId(rule.getRuleId());
        }
    }

    /**
     * 新增规则
     * @param rule
     * @return void
     */
    public void insertRule(Rule rule){
        rule.setRuleId(UUID.randomUUID().toString().replace("-",""));
        ruleMapper.insert(rule);
    }
    /**
     * 根据ruleName查询rule
     * @param ruleName
     * @return void
     */
    public Rule getRuleByRuleName(String ruleName){
        RuleExample ruleExample = new RuleExample();
        RuleExample.Criteria criteria = ruleExample.createCriteria();
        criteria.andRuleNameEqualTo(ruleName);
        List<Rule> rules = ruleMapper.selectByExample(ruleExample);
        return rules.get(0);
    }

}
