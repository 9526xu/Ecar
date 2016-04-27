package com.Ecar.service.impl;

import com.Ecar.dal.dao.IEcarTestDoDao;
import com.Ecar.dal.model.EcarTestDo;
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
@Service(IEcarTestDoService.SERVICE_NAME)
public class EcarTestDoServiceImpl implements IEcarTestDoService {

    @Autowired
    private IEcarTestDoDao iEcarTestDoDao;

    @Transactional(readOnly = false)
    public void save(EcarTestDo ecarTestDo) {
        iEcarTestDoDao.saveEntity(ecarTestDo);
    }

    @Transactional(readOnly = false)
    public void update(EcarTestDo ecarTestDo) {
        iEcarTestDoDao.updateEntity(ecarTestDo);
    }

    @Transactional(readOnly = false)
    public void deleteEcarTestDo(EcarTestDo ecarTestDo) {
        iEcarTestDoDao.deleteEntityByIds(ecarTestDo.getId());
    }

    @Transactional(readOnly = false)
    public void deleteList(List<EcarTestDo> list) {
        iEcarTestDoDao.deleteEntityByCollections(list);
    }

    @Override
    public List<EcarTestDo> findByCondition() {
        StringBuilder sb = new StringBuilder();
        List<Object> list = new ArrayList<>();


        sb.append(" and name like ? ");
        list.add("李%");

        Map<String ,String>map=new HashMap<>();
        map.put("age","desc");

        return iEcarTestDoDao.getCollectionByConditionNoPage(sb.toString(),list,map);
    }
}
