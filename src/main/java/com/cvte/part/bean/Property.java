package com.cvte.part.bean;

public class Property {
    private String propertyId;

    private String propertyName;

    private String partClassId;

    private String ruleId;

    public Property() {
    }

    public Property(String propertyId, String propertyName, String partClassId, String ruleId) {
        this.propertyId = propertyId;
        this.propertyName = propertyName;
        this.partClassId = partClassId;
        this.ruleId = ruleId;
    }

    public String getPropertyId() {
        return propertyId;
    }

    public void setPropertyId(String propertyId) {
        this.propertyId = propertyId == null ? null : propertyId.trim();
    }

    public String getPropertyName() {
        return propertyName;
    }

    public void setPropertyName(String propertyName) {
        this.propertyName = propertyName == null ? null : propertyName.trim();
    }

    public String getPartClassId() {
        return partClassId;
    }

    public void setPartClassId(String partClassId) {
        this.partClassId = partClassId == null ? null : partClassId.trim();
    }

    public String getRuleId() {
        return ruleId;
    }

    @Override
    public String toString() {
        return "Property{" +
                "propertyId='" + propertyId + '\'' +
                ", propertyName='" + propertyName + '\'' +
                ", partClassId='" + partClassId + '\'' +
                ", ruleId='" + ruleId + '\'' +
                '}';
    }

    public void setRuleId(String ruleId) {
        this.ruleId = ruleId == null ? null : ruleId.trim();
    }
}