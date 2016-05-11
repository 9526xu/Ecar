package com.Ecar.dal.dao;

import com.Ecar.dal.commonDao.ICommonDao;
import com.Ecar.dal.model.EcarRegionDo;
import com.Ecar.dal.model.EcarTestDo;

import java.util.List;

/**
 * Created by xiaohei on 16/4/25.
 */
public interface IEcarRegionDao extends ICommonDao<EcarRegionDo> {
    public static final String SERVICE_NAME="com.Ecar.dal.dao.IEcarRegionDao";

    List<EcarRegionDo> getAllProvinces();

    List<EcarRegionDo> getCityByProvinceId(String regid);
}
