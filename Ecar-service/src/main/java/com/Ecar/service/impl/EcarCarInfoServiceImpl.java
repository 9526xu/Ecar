package com.Ecar.service.impl;

import com.Ecar.common.utils.PageResult;
import com.Ecar.dal.dao.IEcarCarInfoDao;
import com.Ecar.dal.model.EcarCarInfoPicDo;
import com.Ecar.dal.model.EcarCarinfoDo;
import com.Ecar.dal.query.CarInfoQuery;
import com.Ecar.dto.carInfo.CarAddForm;
import com.Ecar.dto.carInfo.CarInfoQueryForm;
import com.Ecar.service.IEcarCarInfoService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.UUID;

/**
 * Created by xiaohei on 16/5/11.
 */
@Service(IEcarCarInfoService.SERVICE_NAME)
public class EcarCarInfoServiceImpl implements IEcarCarInfoService {

    @Autowired
    private IEcarCarInfoDao carInfoDao;

    /**
     * 分页搜索
     *
     * @param form
     * @return
     */
    @Override
    public PageResult<EcarCarinfoDo> queryCarInfo(CarInfoQueryForm form) {

        CarInfoQuery carInfoQuery = new CarInfoQuery();
        BeanUtils.copyProperties(form, carInfoQuery);

        PageResult<EcarCarinfoDo> result = carInfoDao.queryWithPage(carInfoQuery);


        return result;
    }

    /**
     * 1.保存汽车信息
     * 2.如果有图片信息,添加图片
     *
     * @param form
     */
    @Override
    @Transactional(readOnly = false)
    public void saveCarInfo(CarAddForm form) {
        EcarCarinfoDo ecarCarinfoDo = new EcarCarinfoDo();
        //设置上架状态为未上架
        ecarCarinfoDo.setUpStatus(0);
        //设置车辆状态为已创建
        ecarCarinfoDo.setCarStatus(0);
        //车辆名字对应form的model
        ecarCarinfoDo.setName(form.getBrand());
        BeanUtils.copyProperties(form, ecarCarinfoDo);
        //先储存车辆信息
        //车辆id为uuid
        String carId = UUID.randomUUID().toString();
        ecarCarinfoDo.setCarId(carId);
        //先储存车辆信息
        carInfoDao.saveEntity(ecarCarinfoDo);
        //如果存在图片信息,储存
        if (form.getPicPath() != null && form.getPicPath().length != 0) {
            for (int i = 0; i < form.getPicPath().length; i++) {
                EcarCarInfoPicDo ecarCarInfoPicDo = new EcarCarInfoPicDo();
                ecarCarInfoPicDo.setCarId(carId);
                ecarCarInfoPicDo.setPicUrl(form.getPicPath()[i]);
            }

        }


    }
}
