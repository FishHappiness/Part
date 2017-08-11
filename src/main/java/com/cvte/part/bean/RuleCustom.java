package com.cvte.part.bean;

public class RuleCustom{
    private String partClassName;
    private String ruleDes;
    private Rule rule;

    public RuleCustom() {
    }

    public RuleCustom(String partClassName, String ruleDes, Rule rule) {
        this.partClassName = partClassName;
        this.ruleDes = ruleDes;
        this.rule = rule;
    }

    public String getPartClassName() {
        return partClassName;
    }

    public void setPartClassName(String partClassName) {
        this.partClassName = partClassName;
    }

    public String getRuleDes() {
        return ruleDes;
    }

    public void setRuleDes(String ruleDes) {
        this.ruleDes = ruleDes;
    }

    public Rule getRule() {
        return rule;
    }

    public void setRule(Rule rule) {
        this.rule = rule;
    }

    @Override
    public String toString() {
        return "RuleCustom{" +
                "partClassName='" + partClassName + '\'' +
                ", ruleDes='" + ruleDes + '\'' +
                ", rule=" + rule +
                '}';
    }
}
