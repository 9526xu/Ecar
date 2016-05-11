package com.Ecar.service.impl;

import com.Ecar.common.utils.BizResult;
import com.Ecar.common.utils.PageResult;
import com.Ecar.dal.dao.IEcarModelDao;
import com.Ecar.dal.model.EcarModelDo;
import com.Ecar.dto.model.ModelForm;
import com.Ecar.dto.model.ModelPageForm;
import com.Ecar.dto.model.ModelUpdateForm;
import com.Ecar.service.IEcarModelService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

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

    @Override
    public PageResult<EcarModelDo> getModelsByBrandWithPage(ModelPageForm form) {
        PageResult<EcarModelDo> result=modelDao.getModelsByBrandWithPage(form.getPageNo(),form.getPageSize(),form.getBrand());


        return result;
    }
}
