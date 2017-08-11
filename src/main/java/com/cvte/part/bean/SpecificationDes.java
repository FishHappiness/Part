package com.cvte.part.bean;

public class SpecificationDes {
    private String specDesId;

    private String specDesName;

    private String ruleId;

    public SpecificationDes() {
    }

    public SpecificationDes(String specDesId, String specDesName, String ruleId) {
        this.specDesId = specDesId;
        this.specDesName = specDesName;
        this.ruleId = ruleId;
    }

    public String getSpecDesId() {
        return specDesId;
    }

    public void setSpecDesId(String specDesId) {
        this.specDesId = specDesId == null ? null : specDesId.trim();
    }

    public String getSpecDesName() {
        return specDesName;
    }

    public void setSpecDesName(String specDesName) {
        this.specDesName = specDesName == null ? null : specDesName.trim();
    }

    public String getRuleId() {
        return ruleId;
    }

    public void setRuleId(String ruleId) {
        this.ruleId = ruleId == null ? null : ruleId.trim();
    }

    @Override
    public String toString() {
        return "SpecificationDes{" +
                "specDesId='" + specDesId + '\'' +
                ", specDesName='" + specDesName + '\'' +
                ", ruleId='" + ruleId + '\'' +
                '}';
    }
}