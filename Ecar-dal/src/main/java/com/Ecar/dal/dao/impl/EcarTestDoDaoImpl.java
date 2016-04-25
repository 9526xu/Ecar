package com.Ecar.dal.dao.impl;

import com.Ecar.dal.commonDao.impl.CommonDaoImpl;

import com.Ecar.dal.dao.IEcarTestDoDao;
import com.Ecar.dal.model.EcarTestDo;
import org.springframework.stereotype.Repository;

/**
 * Created by xiaohei on 16/4/25.
 */
@Repository(IEcarTestDoDao.SERVICE_NAME)
public class EcarTestDoDaoImpl extends CommonDaoImpl<EcarTestDo> implements IEcarTestDoDao {

}
