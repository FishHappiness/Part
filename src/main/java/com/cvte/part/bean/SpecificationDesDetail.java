package com.cvte.part.bean;

public class SpecificationDesDetail {
    private String specDesDetailId;

    private String propertyName;

    private String propertyValue;

    private String specDesId;

    public SpecificationDesDetail() {
    }

    public SpecificationDesDetail(String specDesDetailId, String propertyName, String propertyValue, String specDesId) {
        this.specDesDetailId = specDesDetailId;
        this.propertyName = propertyName;
        this.propertyValue = propertyValue;
        this.specDesId = specDesId;
    }

    public String getSpecDesDetailId() {
        return specDesDetailId;
    }

    public void setSpecDesDetailId(String specDesDetailId) {
        this.specDesDetailId = specDesDetailId == null ? null : specDesDetailId.trim();
    }

    public String getPropertyName() {
        return propertyName;
    }

    public void setPropertyName(String propertyName) {
        this.propertyName = propertyName == null ? null : propertyName.trim();
    }

    public String getPropertyValue() {
        return propertyValue;
    }

    public void setPropertyValue(String propertyValue) {
        this.propertyValue = propertyValue == null ? null : propertyValue.trim();
    }

    public String getSpecDesId() {
        return specDesId;
    }

    public void setSpecDesId(String specDesId) {
        this.specDesId = specDesId == null ? null : specDesId.trim();
    }

    @Override
    public String toString() {
        return "SpecificationDesDetail{" +
                "specDesDetailId='" + specDesDetailId + '\'' +
                ", propertyName='" + propertyName + '\'' +
                ", propertyValue='" + propertyValue + '\'' +
                ", specDesId='" + specDesId + '\'' +
                '}';
    }
}