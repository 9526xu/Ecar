package com.Ecar.service;

import com.Ecar.common.utils.BizResult;
import com.Ecar.dal.model.EcarRegionDo;
import com.Ecar.dal.model.EcarTestDo;

import java.util.List;

/**
 * Created by xiaohei on 16/4/25.
 */
public interface ICommonService {
    public static final String SERVICE_NAME="com.Ecar.service.ICommonService";

    List<EcarRegionDo> getProvinces();

    BizResult<List<EcarRegionDo>> getCityByProvinceRegId(String regid);
}
