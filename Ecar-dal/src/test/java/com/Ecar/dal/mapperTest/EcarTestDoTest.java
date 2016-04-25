package com.Ecar.dal.mapperTest;

import com.Ecar.common.utils.HibernateUtil;
import com.Ecar.dal.model.EcarTestDo;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.junit.Test;

/**
 * Created by yyx on 16/4/24.
 * 单元测试
 */
public class EcarTestDoTest {

    @Test
    public void hibernateUtilTest(){
        SessionFactory sessionFactory= HibernateUtil.getSessionFactory();
        Session session=sessionFactory.openSession();
        Transaction transaction=session.beginTransaction();

        EcarTestDo ecarTestDo=new EcarTestDo();


        ecarTestDo.setAge(11);
        ecarTestDo.setName("张宝");


        session.save(ecarTestDo);

        transaction.commit();
        session.close();
    }
}
