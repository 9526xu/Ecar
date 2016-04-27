package com.Ecar.service;

import com.Ecar.dal.model.EcarTestDo;

import java.util.List;

/**
 * Created by xiaohei on 16/4/25.
 */
public interface IEcarTestDoService {
    public static final String SERVICE_NAME="com.Ecar.service.IEcarTestDoService";
    public void save(EcarTestDo ecarTestDo);
    public void update(EcarTestDo ecarTestDo);

    public void deleteEcarTestDo(EcarTestDo ecarTestDo);

    public void deleteList(List<EcarTestDo> list);

    public List<EcarTestDo> findByCondition();
}
