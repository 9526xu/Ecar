package com.Ecar.dto;

import org.hibernate.validator.constraints.NotBlank;

/**
 * Created by xiaohei on 16/5/9.
 */
public class ModelListForm {
    @NotBlank
    private String brand;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}
