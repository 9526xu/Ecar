package com.Ecar.service;

import com.Ecar.common.utils.PageResult;
import com.Ecar.dal.model.EcarCarinfoDo;
import com.Ecar.dal.model.EcarTestDo;
import com.Ecar.dto.carInfo.CarInfoQueryForm;

import java.util.List;

/**
 * Created by xiaohei on 16/4/25.
 */
public interface IEcarCarInfoService {
    public static final String SERVICE_NAME="com.Ecar.service.IEcarCarInfoService";

    PageResult<EcarCarinfoDo> queryCarInfo(CarInfoQueryForm form);
}
