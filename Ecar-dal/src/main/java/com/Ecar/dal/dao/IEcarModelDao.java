package com.Ecar.dal.dao;

import com.Ecar.common.utils.PageResult;
import com.Ecar.dal.commonDao.ICommonDao;
import com.Ecar.dal.model.EcarModelDo;

import java.util.List;

/**
 * Created by xiaohei on 16/4/25.
 */
public interface IEcarModelDao extends ICommonDao<EcarModelDo> {
    public static final String SERVICE_NAME="com.Ecar.dal.dao.IEcarModelDao";

    public List<EcarModelDo> getAllBrand();

    List<EcarModelDo> getModelsByBrand(String brand);



    PageResult<EcarModelDo> getModelsByBrandWithPage(int pageNo, int pageSize, String brand);

    int getCountModelByBrand(String brand);

    List<EcarModelDo> getModelsPage();
}
