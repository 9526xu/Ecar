package com.Ecar.service.impl;

import com.Ecar.common.utils.BizResult;
import com.Ecar.dal.dao.IEcarModelDao;
import com.Ecar.dal.dao.IEcarTestDoDao;
import com.Ecar.dal.model.EcarModelDo;
import com.Ecar.dal.model.EcarTestDo;
import com.Ecar.dto.ModelForm;
import com.Ecar.dto.ModelUpdateForm;
import com.Ecar.service.IEcarModelService;
import com.Ecar.service.IEcarTestDoService;
import org.springframework.beans.BeanUtils;
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

    @Override
    public List<EcarModelDo> getModelsByBrand(String brand) {
        List<EcarModelDo> list=modelDao.getModelsByBrand(brand);
        return list;
    }

    @Override
    @Transactional(readOnly = false)
    public BizResult addModel(ModelForm form) {
        BizResult bizResult=new BizResult();
        try{
            EcarModelDo ecarModelDo=new EcarModelDo();
            BeanUtils.copyProperties(form,ecarModelDo);
            modelDao.saveEntity(ecarModelDo);

            bizResult.setSuccess(true);
        }catch (Exception e){

            bizResult.setErrMsg("新增车型异常");
        }
        return bizResult;
    }

    @Override
    public BizResult<EcarModelDo> getModelById(Integer modelId) {
        BizResult<EcarModelDo> bizResult=new BizResult<>();
        try {
            EcarModelDo ecarModelDo=modelDao.getEntityById(modelId);

            bizResult.setData(ecarModelDo);
            bizResult.setSuccess(true);

        }catch (Exception e){
            bizResult.setErrMsg("查询异常");
        }
        return bizResult;
    }

    @Override
    @Transactional(readOnly = false)
    public BizResult updateModel(ModelUpdateForm form) {
        BizResult bizResult=new BizResult();
        try {
            EcarModelDo ecarModelDo=new EcarModelDo();
            BeanUtils.copyProperties(form,ecarModelDo);

            modelDao.updateEntity(ecarModelDo);

            bizResult.setSuccess(true);

        }catch (Exception e){
            bizResult.setErrMsg("更新异常");
        }
        return bizResult;


    }

    @Transactional(readOnly = false)
    public BizResult deleteModel(Integer modelId) {
        BizResult bizResult=new BizResult();
        try {
            EcarModelDo ecarModelDo=new EcarModelDo();

            modelDao.deleteEntityByIds(modelId);

            bizResult.setSuccess(true);

        }catch (Exception e){
            bizResult.setErrMsg("删除异常");
        }
        return bizResult;
    }
}
