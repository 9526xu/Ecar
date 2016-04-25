package com.Ecar.dal.dao;

import com.Ecar.common.utils.SpringUtil;
import com.Ecar.dal.model.EcarTestDo;
import org.junit.Test;

/**
 * Created by yyx on 16/4/25.
 */
public class EcarTestDoDaoTest {
    @Test
    public void testSaveEntity(){
        IEcarTestDoDao dao= (IEcarTestDoDao) SpringUtil.applicationContext.getBean(IEcarTestDoDao.SERVICE_NAME);


        EcarTestDo ecarTestDo=new EcarTestDo();


        ecarTestDo.setAge(11);
        ecarTestDo.setName("张宝");

        dao.saveEntity(ecarTestDo);
    }
}
