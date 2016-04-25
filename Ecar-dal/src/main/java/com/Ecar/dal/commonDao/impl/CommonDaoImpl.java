package com.Ecar.dal.commonDao.impl;

import com.Ecar.common.utils.EntityUtil;
import com.Ecar.dal.commonDao.ICommonDao;
import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;

import javax.annotation.Resource;

/**
 * Created by xiaohei on 16/4/25.
 */
public class CommonDaoImpl<T> extends HibernateDaoSupport implements ICommonDao<T> {
    private Class entity;




    public CommonDaoImpl() {
        entity= EntityUtil.getEntityClass(this.getClass());
    }

    @Resource(name="sessionFactory")
    private void seSessionFactoryDi(SessionFactory sessionFactory){
        this.setSessionFactory(sessionFactory);
    }

    @Override
    public void saveEntity(T entity) {

        this.getHibernateTemplate().save(entity);
    }
}
