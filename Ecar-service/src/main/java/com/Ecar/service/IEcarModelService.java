package com.Ecar.service;

import com.Ecar.dal.model.EcarModelDo;
import com.Ecar.dal.model.EcarTestDo;

import java.util.List;

/**
 * Created by xiaohei on 16/4/25.
 */
public interface IEcarModelService {
    public static final String SERVICE_NAME="com.Ecar.service.IEcarModelService";

    public List<EcarModelDo> getAllBrand();
}
