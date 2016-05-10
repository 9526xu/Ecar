package com.Ecar.service;

import com.Ecar.common.utils.BizResult;
import com.Ecar.dal.model.EcarModelDo;
import com.Ecar.dto.ModelForm;
import com.Ecar.dto.ModelUpdateForm;


import java.util.List;

/**
 * Created by xiaohei on 16/4/25.
 */
public interface IEcarModelService {
    public static final String SERVICE_NAME="com.Ecar.service.IEcarModelService";

    public List<EcarModelDo> getAllBrand();

    List<EcarModelDo> getModelsByBrand(String brand);

    BizResult addModel(ModelForm form);

    BizResult<EcarModelDo> getModelById(Integer modelId);

    BizResult updateModel(ModelUpdateForm form);

    BizResult deleteModel(Integer modelId);
}
