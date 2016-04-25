package com.Ecar.service;

import com.Ecar.common.utils.SpringUtil;
import com.Ecar.dal.model.EcarTestDo;
import org.junit.Test;

/**
 * Created by xiaohei on 16/4/25.
 */
public class EcarTestDoServiceTest {
    @Test
    public void testSave(){
        IEcarTestDoService service= (IEcarTestDoService) SpringUtil.applicationContext
                .getBean(IEcarTestDoService.SERVICE_NAME);
        EcarTestDo ecarTestDo=new EcarTestDo();


        ecarTestDo.setAge(11);
        ecarTestDo.setName("张宝");

        service.save(ecarTestDo);

    }
}
