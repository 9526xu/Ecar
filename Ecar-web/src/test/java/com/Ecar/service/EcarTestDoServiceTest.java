package com.Ecar.service;

import com.Ecar.common.utils.SpringUtil;
import com.Ecar.dal.model.EcarTestDo;
import com.Ecar.dto.model.ModelUpdateForm;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by xiaohei on 16/4/25.
 */
public class EcarTestDoServiceTest {
    @Test
    public void testSave(){
        IEcarTestDoService service= (IEcarTestDoService) SpringUtil.applicationContext
                .getBean(IEcarTestDoService.SERVICE_NAME);

        for(int i=0;i<20;i++){
            EcarTestDo ecarTestDo=new EcarTestDo();


            ecarTestDo.setAge(i);
            ecarTestDo.setName("李"+i);
            service.save(ecarTestDo);
        }




    }

    @Test
    public void testUpdate(){
        /*IEcarTestDoService service= (IEcarTestDoService) SpringUtil.applicationContext
                .getBean(IEcarTestDoService.SERVICE_NAME);*/

        /*EcarTestDo ecarTestDo=new EcarTestDo();


        ecarTestDo.setId(1);
        ecarTestDo.setName("张宝");
        ecarTestDo.setAge(23);

        service.update(ecarTestDo);*/

        IEcarModelService service = (IEcarModelService) SpringUtil.applicationContext.getBean(IEcarModelService.SERVICE_NAME);

        ModelUpdateForm form=new ModelUpdateForm();
        form.setModelId(7271);
        form.setModel("mx-66");
        form.setBrand("Aptera");
        form.setYear(1988);

        service.updateModel(form);

    }

    @Test
    public void testDelete(){
        IEcarTestDoService service= (IEcarTestDoService) SpringUtil.applicationContext
                .getBean(IEcarTestDoService.SERVICE_NAME);

        EcarTestDo ecarTestDo=new EcarTestDo();


        ecarTestDo.setId(1);

        service.deleteEcarTestDo(ecarTestDo);
    }

    @Test
    public void testDeleteList(){
        IEcarTestDoService service= (IEcarTestDoService) SpringUtil.applicationContext
                .getBean(IEcarTestDoService.SERVICE_NAME);

        EcarTestDo ecarTestDo=new EcarTestDo();


        ecarTestDo.setId(2);

        EcarTestDo ecarTestDo1=new EcarTestDo();


        ecarTestDo1.setId(3);

        List<EcarTestDo> list=new ArrayList<>();
        list.add(ecarTestDo);
        list.add(ecarTestDo1);

        service.deleteList(list);
    }

    @Test
    public void testGetCollection(){
        IEcarTestDoService service= (IEcarTestDoService) SpringUtil.applicationContext
                .getBean(IEcarTestDoService.SERVICE_NAME);

        List<EcarTestDo> list=service.findByCondition();
        for (EcarTestDo ecarTestDo : list) {
            System.out.println(ecarTestDo.getName()+":"+ecarTestDo.getAge());
        }
    }
}
