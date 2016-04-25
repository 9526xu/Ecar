package com.Ecar.service.impl;

import com.Ecar.dal.dao.IEcarTestDoDao;
import com.Ecar.dal.model.EcarTestDo;
import com.Ecar.service.IEcarTestDoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by xiaohei on 16/4/25.
 */
@Service(IEcarTestDoService.SERVICE_NAME)
public class EcarTestDoServiceImpl implements IEcarTestDoService {

    @Autowired
    private IEcarTestDoDao iEcarTestDoDao;

    @Transactional(readOnly = false)
    public void save(EcarTestDo ecarTestDo) {
        iEcarTestDoDao.saveEntity(ecarTestDo);
    }
}
