package com.cvte.part.bean;

public class PartItem {
    private String partItemId;

    private String partItemName;

    private String partClassId;

    private String specDesId;

    public PartItem() {
    }

    public PartItem(String partItemId, String partItemName, String partClassId, String specDesId) {
        this.partItemId = partItemId;
        this.partItemName = partItemName;
        this.partClassId = partClassId;
        this.specDesId = specDesId;
    }

    public String getPartItemId() {
        return partItemId;
    }

    public void setPartItemId(String partItemId) {
        this.partItemId = partItemId == null ? null : partItemId.trim();
    }

    public String getPartItemName() {
        return partItemName;
    }

    public void setPartItemName(String partItemName) {
        this.partItemName = partItemName == null ? null : partItemName.trim();
    }

    public String getPartClassId() {
        return partClassId;
    }

    public void setPartClassId(String partClassId) {
        this.partClassId = partClassId == null ? null : partClassId.trim();
    }

    public String getSpecDesId() {
        return specDesId;
    }

    public void setSpecDesId(String specDesId) {
        this.specDesId = specDesId == null ? null : specDesId.trim();
    }

    @Override
    public String toString() {
        return "PartItem{" +
                "partItemId='" + partItemId + '\'' +
                ", partItemName='" + partItemName + '\'' +
                ", partClassId='" + partClassId + '\'' +
                ", specDesId='" + specDesId + '\'' +
                '}';
    }
}