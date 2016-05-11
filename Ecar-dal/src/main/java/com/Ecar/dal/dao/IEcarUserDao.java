package com.Ecar.dal.dao;

import com.Ecar.dal.commonDao.ICommonDao;
import com.Ecar.dal.model.EcarTestDo;
import com.Ecar.dal.model.EcarUserDo;

/**
 * Created by xiaohei on 16/4/25.
 */
public interface IEcarUserDao extends ICommonDao<EcarUserDo> {
    public static final String SERVICE_NAME="com.Ecar.dal.dao.IEcarUserDao";

    EcarUserDo getUserByTel(String mobile);
}
