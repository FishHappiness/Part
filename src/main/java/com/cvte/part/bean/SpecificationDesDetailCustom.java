package com.cvte.part.bean;

import java.util.List;

public class SpecificationDesDetailCustom {
    private String partItemId ;
    private List<SpecificationDesDetail> specList;

    public SpecificationDesDetailCustom() {
    }

    public SpecificationDesDetailCustom(String partItemId, List<SpecificationDesDetail> specList) {
        this.partItemId = partItemId;
        this.specList = specList;
    }

    public String getPartItemId() {
        return partItemId;
    }

    public void setPartItemId(String partItemId) {
        this.partItemId = partItemId;
    }

    public List<SpecificationDesDetail> getSpecList() {
        return specList;
    }

    public void setSpecList(List<SpecificationDesDetail> specList) {
        this.specList = specList;
    }

    @Override
    public String toString() {
        return "SpecificationDesDetailCustom{" +
                "partItemId='" + partItemId + '\'' +
                ", specList=" + specList +
                '}';
    }
}
