package com.Ecar.dal.commonDao.impl;

import com.Ecar.common.utils.EntityUtil;
import com.Ecar.dal.commonDao.ICommonDao;
import org.apache.commons.lang.StringUtils;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate4.HibernateCallback;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;
import org.springframework.util.CollectionUtils;


import javax.annotation.Resource;
import java.io.Serializable;
import java.util.List;
import java.util.Map;

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

    @Override
    public void updateEntity(T entity) {
        this.getHibernateTemplate().update(entity);
    }

    @Override
    public T getEntityById(Serializable id) {

        return (T) this.getHibernateTemplate().get(entity,id);
    }

    @Override
    public void deleteEntityByIds(Serializable... ids) {
        if(ids!=null&&ids.length>0){
            for (Serializable id : ids) {
                T entity=getEntityById(id);
                this.getHibernateTemplate().delete(entity);
            }
        }
    }

    @Override
    public void deleteEntityByCollections(List<T> list) {
        this.getHibernateTemplate().deleteAll(list);
    }

    @Override
    public List<T> getCollectionByConditionNoPage(String condition, final List<Object> params, Map<String, String> orderBy) {
        final String hql=getHql(condition,orderBy);

        if(StringUtils.isBlank(hql)){
            return null;
        }

        List<T> list=this.getHibernateTemplate().execute(new HibernateCallback<List<T>>() {
            @Override
            public List<T> doInHibernate(Session session) throws HibernateException {
                Query query=session.createQuery(hql);

                if(!CollectionUtils.isEmpty(params)){
                    for (int i=0;i<params.size();i++){
                        query.setParameter(i,params.get(i));
                    }
                }


                return query.list();
            }
        });


        return list;
    }

    private String getHql(String condition, Map<String, String> orderBy) {
        if(StringUtils.isBlank(condition)){
            return null;
        }
        StringBuilder sb=new StringBuilder();
        sb.append(" from "+this.entity.getName());
        sb.append(" where 1=1");
        sb.append(" "+condition);



        if(!CollectionUtils.isEmpty(orderBy)){
            sb.append(" order by");
            for (Map.Entry<String, String> entry : orderBy.entrySet()) {
                sb.append(" "+entry.getKey());
                sb.append(" "+entry.getValue()+" ,");
            }
            sb.deleteCharAt(sb.length()-1);
        }

        return sb.toString();
    }


}
