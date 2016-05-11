package com.Ecar.service.impl;

import com.Ecar.common.utils.PageResult;
import com.Ecar.dal.dao.IEcarCarInfoDao;
import com.Ecar.dal.model.EcarCarinfoDo;
import com.Ecar.dal.query.CarInfoQuery;
import com.Ecar.dto.carInfo.CarInfoQueryForm;
import com.Ecar.service.IEcarCarInfoService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

/**
 * Created by xiaohei on 16/5/11.
 */
@Service(IEcarCarInfoService.SERVICE_NAME)
public class EcarCarInfoServiceImpl implements IEcarCarInfoService {

    @Autowired
    private IEcarCarInfoDao carInfoDao;

    /**
     * 分页搜索
     * @param form
     * @return
     */
    @Override
    public PageResult<EcarCarinfoDo> queryCarInfo(CarInfoQueryForm form) {

        CarInfoQuery carInfoQuery=new CarInfoQuery();
        BeanUtils.copyProperties(form,carInfoQuery);

        PageResult<EcarCarinfoDo> result=carInfoDao.queryWithPage(carInfoQuery);


        return result;
    }
}
