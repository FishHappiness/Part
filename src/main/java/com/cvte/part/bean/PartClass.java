package com.cvte.part.bean;

public class PartClass {
    private String partClassId;

    private String partName;

    private String ruleId;

    public PartClass() {
    }

    public PartClass(String partClassId, String partName, String ruleId) {
        this.partClassId = partClassId;
        this.partName = partName;
        this.ruleId = ruleId;
    }

    public String getPartClassId() {
        return partClassId;
    }

    public void setPartClassId(String partClassId) {
        this.partClassId = partClassId == null ? null : partClassId.trim();
    }

    public String getPartName() {
        return partName;
    }

    public void setPartName(String partName) {
        this.partName = partName == null ? null : partName.trim();
    }

    public String getRuleId() {
        return ruleId;
    }

    public void setRuleId(String ruleId) {
        this.ruleId = ruleId == null ? null : ruleId.trim();
    }

    @Override
    public String toString() {
        return "PartClass{" +
                "partClassId='" + partClassId + '\'' +
                ", partName='" + partName + '\'' +
                ", ruleId='" + ruleId + '\'' +
                '}';
    }
}