package com.Ecar.dto.model;

import com.Ecar.common.utils.BasePageForm;

/**
 * Created by xiaohei on 16/5/11.
 * 分页
 */
public class ModelPageForm extends BasePageForm {
    private String brand;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}
