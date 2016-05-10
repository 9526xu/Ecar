package com.Ecar.dal.model;

/**
 * Created by xiaohei on 16/5/9.
 */
public class EcarModelDo {
    private Integer modelId;
    private Integer year;
    private String brand;
    private String model;
    private String brandCn;
    private String modelCn;

    public EcarModelDo(String brand) {
        this.brand = brand;
    }

    public EcarModelDo() {
    }

    public EcarModelDo(String model,Integer modelId,   String modelCn) {
        this.modelId = modelId;

        this.model = model;
        this.modelCn = modelCn;
    }

    public Integer getModelId() {
        return modelId;
    }

    public void setModelId(Integer modelId) {
        this.modelId = modelId;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBrandCn() {
        return brandCn;
    }

    public void setBrandCn(String brandCn) {
        this.brandCn = brandCn;
    }

    public String getModelCn() {
        return modelCn;
    }

    public void setModelCn(String modelCn) {
        this.modelCn = modelCn;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EcarModelDo that = (EcarModelDo) o;

        if (modelId != null ? !modelId.equals(that.modelId) : that.modelId != null) return false;
        if (year != null ? !year.equals(that.year) : that.year != null) return false;
        if (brand != null ? !brand.equals(that.brand) : that.brand != null) return false;
        if (model != null ? !model.equals(that.model) : that.model != null) return false;
        if (brandCn != null ? !brandCn.equals(that.brandCn) : that.brandCn != null) return false;
        if (modelCn != null ? !modelCn.equals(that.modelCn) : that.modelCn != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = modelId != null ? modelId.hashCode() : 0;
        result = 31 * result + (year != null ? year.hashCode() : 0);
        result = 31 * result + (brand != null ? brand.hashCode() : 0);
        result = 31 * result + (model != null ? model.hashCode() : 0);
        result = 31 * result + (brandCn != null ? brandCn.hashCode() : 0);
        result = 31 * result + (modelCn != null ? modelCn.hashCode() : 0);
        return result;
    }
}
