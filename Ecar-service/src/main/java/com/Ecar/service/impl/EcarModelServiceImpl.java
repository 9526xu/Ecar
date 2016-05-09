package com.Ecar.service.impl;

import com.Ecar.dal.dao.IEcarModelDao;
import com.Ecar.dal.dao.IEcarTestDoDao;
import com.Ecar.dal.model.EcarModelDo;
import com.Ecar.dal.model.EcarTestDo;
import com.Ecar.service.IEcarModelService;
import com.Ecar.service.IEcarTestDoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by xiaohei on 16/4/25.
 */
@Service(IEcarModelService.SERVICE_NAME)
public class EcarModelServiceImpl implements IEcarModelService {

    @Autowired
    private IEcarModelDao modelDao;

    @Override
    public List<EcarModelDo> getAllBrand() {
        List<EcarModelDo> list=modelDao.getAllBrand();

        return list;
    }
}
