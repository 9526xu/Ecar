package com.Ecar.service;

import com.Ecar.dal.model.EcarTestDo;

/**
 * Created by xiaohei on 16/4/25.
 */
public interface IEcarTestDoService {
    public static final String SERVICE_NAME="com.Ecar.service.IEcarTestDoService";
    public void save(EcarTestDo ecarTestDo);
}
