package com.Ecar.service.impl;

import com.Ecar.common.utils.BizResult;
import com.Ecar.dal.dao.IEcarTestDoDao;
import com.Ecar.dal.dao.IEcarUserDao;
import com.Ecar.dal.model.EcarTestDo;
import com.Ecar.dal.model.EcarUserDo;
import com.Ecar.service.IEcarTestDoService;
import com.Ecar.service.IEcarUserService;
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
@Service(IEcarUserService.SERVICE_NAME)
public class EcarUserImpl implements IEcarUserService {
    @Autowired
    private IEcarUserDao userDao;


    @Override
    public BizResult<EcarUserDo> getUserByTel(String mobile) {
        BizResult<EcarUserDo>bizResult=new BizResult<>();
        try{
            EcarUserDo ecarUserDo=userDao.getUserByTel(mobile);

            bizResult.setData(ecarUserDo);
            bizResult.setSuccess(true);

        }catch (Exception e){
            bizResult.setErrMsg("查询异常");
        }

        return bizResult;
    }

    @Transactional(readOnly = false)
    public BizResult saveUser(EcarUserDo userDo) {
        BizResult bizResult=new BizResult();
        try{
            userDao.saveEntity(userDo);

            bizResult.setSuccess(true);
            bizResult.setData(userDo);

        }catch (Exception e){
            bizResult.setErrMsg("增加异常");
        }
        return bizResult;
    }

    /**
     * 根据用户名查找用户()
     * @param name
     * @return
     */
    @Override
    @Deprecated
    public EcarUserDo getUserByUserName(String name) {
       // EcarUserDo ecarUserDo=userDao
        return null;
    }
}
