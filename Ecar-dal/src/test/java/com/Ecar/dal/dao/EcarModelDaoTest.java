package com.Ecar.dal.dao;

import com.Ecar.common.utils.SpringUtil;
import com.Ecar.dal.model.EcarModelDo;
import com.Ecar.dal.model.EcarTestDo;
import org.junit.Test;

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
}
