package com.Ecar.dal.dao;

import com.Ecar.common.utils.PageResult;
import com.Ecar.dal.commonDao.ICommonDao;
import com.Ecar.dal.model.EcarCarinfoDo;
import com.Ecar.dal.model.EcarTestDo;
import com.Ecar.dal.query.CarInfoQuery;

/**
 * Created by xiaohei on 16/4/25.
 */
public interface IEcarCarInfoDao extends ICommonDao<EcarCarinfoDo> {
    public static final String SERVICE_NAME="com.Ecar.dal.dao.IEcarCarInfoDao";

    PageResult<EcarCarinfoDo> queryWithPage(CarInfoQuery carInfoQuery);
}
