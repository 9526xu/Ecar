package com.Ecar.dal.dao;

import com.Ecar.common.utils.PageResult;
import com.Ecar.common.utils.SpringUtil;
import com.Ecar.dal.model.EcarModelDo;
import com.Ecar.dal.model.EcarTestDo;
import org.junit.Test;
import sun.org.mozilla.javascript.internal.ast.NewExpression;

import java.util.List;

/**
 * Created by yyx on 16/4/25.
 */
public class EcarModelDaoTest {
    @Test
    public void testgetAllBrand(){
       // IEcarTestDoDao dao= (IEcarTestDoDao) SpringUtil.applicationContext.getBean(IEcarTestDoDao.SERVICE_NAME);
        IEcarModelDao dao= (IEcarModelDao) SpringUtil.applicationContext.getBean(IEcarModelDao.SERVICE_NAME);

        List<EcarModelDo>list=dao.getAllBrand();
        for (EcarModelDo ecarModelDo : list) {
            System.out.println(ecarModelDo.getBrand());
        }




    }

    @Test
    public void testGetAllModelByBrand(){
        IEcarModelDao dao= (IEcarModelDao) SpringUtil.applicationContext.getBean(IEcarModelDao.SERVICE_NAME);
        List<EcarModelDo> list=dao.getModelsByBrand("Audi");
        for (EcarModelDo ecarModelDo : list) {
            System.out.println(ecarModelDo.getModel()+":"+ecarModelDo.getModelCn());
        }
    }

    @Test
    public void testUpdateModel(){
        IEcarModelDao dao= (IEcarModelDao) SpringUtil.applicationContext.getBean(IEcarModelDao.SERVICE_NAME);


        EcarModelDo ecarModelDo= new EcarModelDo();
        ecarModelDo.setModelId(7271);
        ecarModelDo.setBrand("Aptera");
        ecarModelDo.setModel("mx-666");

        dao.updateEntity(ecarModelDo);
    }

    @Test
    public void testGetModelByBrandWithPage(){
        IEcarModelDao dao= (IEcarModelDao) SpringUtil.applicationContext.getBean(IEcarModelDao.SERVICE_NAME);

        PageResult<EcarModelDo>result=dao.getModelsByBrandWithPage(1,10,"Audi");

        System.out.println(result);
    }
}
