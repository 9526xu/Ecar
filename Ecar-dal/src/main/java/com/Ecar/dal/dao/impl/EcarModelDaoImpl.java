package com.Ecar.dal.dao.impl;

import com.Ecar.common.utils.PageResult;
import com.Ecar.dal.commonDao.impl.CommonDaoImpl;
import com.Ecar.dal.dao.IEcarModelDao;
import com.Ecar.dal.model.EcarModelDo;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.orm.hibernate4.HibernateCallback;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by xiaohei on 16/4/25.
 */
@Repository(IEcarModelDao.SERVICE_NAME)
public class EcarModelDaoImpl extends CommonDaoImpl<EcarModelDo> implements IEcarModelDao {

    @Override
    public List<EcarModelDo> getAllBrand() {
        String hql="select distinct new EcarModelDo(brand) from EcarModelDo order by brand asc";
        List<EcarModelDo> list= (List<EcarModelDo>) this.getHibernateTemplate().find(hql);
        return list;
    }

    @Override
    public List<EcarModelDo> getModelsByBrand(String brand) {
        String hql=" from EcarModelDo where brand=? order by model asc ";

        return (List<EcarModelDo>) this.getHibernateTemplate().find(hql,brand);
    }

    @Override
    public PageResult<EcarModelDo> getModelsByBrandWithPage(final int pageNo, final int pageSize, final String brand) {
        PageResult<EcarModelDo> result=new PageResult<>();


        List<EcarModelDo>list=this.getHibernateTemplate().execute(new HibernateCallback<List<EcarModelDo>>() {
            @Override
            public List<EcarModelDo> doInHibernate(Session session) throws HibernateException {
                String hql=" from EcarModelDo where brand=? order by modelId desc ";
                Query query=session.createQuery(hql);
                query.setString(0,brand);
                //分页
                query.setFirstResult((pageNo-1)*pageSize);
                query.setMaxResults(pageSize);


                return query.list();
            }
        });


        result.setPageNo(pageNo);
        result.setPageSize(pageSize);
        result.setTotalCount(this.getCountModelByBrand(brand));
        result.setResult(list);



        return result;
    }

    @Override
    public int getCountModelByBrand(final String brand) {
        final String hql="select count(*) from EcarModelDo where brand=?";
        Integer totalCount = this.getHibernateTemplate().execute(new HibernateCallback<Integer>() {

            @Override
            public Integer doInHibernate(Session session) throws HibernateException {

                Query query=session.createQuery(hql);
                query.setString(0,brand);
                Long count=(Long)query.uniqueResult();

                return  count.intValue();
            }
        });
        return totalCount;
    }

    @Override
    public List<EcarModelDo> getModelsPage() {
        final String hql="from EcarModelDo where brand";
        return null;
    }
}
