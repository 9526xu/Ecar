package com.Ecar.dal.dao;

import com.Ecar.dal.commonDao.ICommonDao;
import com.Ecar.dal.model.EcarModelDo;
import com.Ecar.dal.model.EcarTestDo;

import java.util.List;

/**
 * Created by xiaohei on 16/4/25.
 */
public interface IEcarModelDao extends ICommonDao<EcarModelDo> {
    public static final String SERVICE_NAME="com.Ecar.dal.dao.IEcarModelDao";

    public List<EcarModelDo> getAllBrand();
}
