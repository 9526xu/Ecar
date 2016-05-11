package com.Ecar.dto.model;

import org.hibernate.validator.constraints.NotBlank;

/**
 * Created by xiaohei on 16/5/9.
 */
public class ModelForm {
    @NotBlank
    private String brand;

    private Integer year;
    @NotBlank
    private String model;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
