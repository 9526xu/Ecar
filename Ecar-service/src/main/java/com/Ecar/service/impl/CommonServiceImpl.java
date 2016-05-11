package com.Ecar.service.impl;

import com.Ecar.common.utils.BizResult;
import com.Ecar.dal.dao.IEcarRegionDao;
import com.Ecar.dal.model.EcarRegionDo;
import com.Ecar.service.ICommonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by xiaohei on 16/4/25.
 */
@Service(ICommonService.SERVICE_NAME)
public class CommonServiceImpl implements ICommonService {
    @Autowired
    private IEcarRegionDao regionDao;
    @Override
    public List<EcarRegionDo> getProvinces() {
       List<EcarRegionDo> list= regionDao.getAllProvinces();

        return list;
    }

    @Override
    public BizResult<List<EcarRegionDo>> getCityByProvinceRegId(String regid) {
        BizResult<List<EcarRegionDo>> bizResult=new BizResult<>();
        try{
            List<EcarRegionDo>list=regionDao.getCityByProvinceId(regid);

            bizResult.setData(list);
            bizResult.setSuccess(true);

        }catch (Exception e){
            bizResult.setErrMsg("查询异常");
        }

        return bizResult;
    }
}
