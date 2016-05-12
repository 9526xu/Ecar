package com.Ecar.service;

import com.Ecar.common.utils.BizResult;
import com.Ecar.dal.model.EcarTestDo;
import com.Ecar.dal.model.EcarUserDo;

import java.util.List;

/**
 * Created by xiaohei on 16/4/25.
 */
public interface IEcarUserService {
    public static final String SERVICE_NAME="com.Ecar.service.IEcarUserService";

    BizResult<EcarUserDo> getUserByTel(String mobile);

    BizResult saveUser(EcarUserDo userDo);

    EcarUserDo getUserByUserName(String name);
}
