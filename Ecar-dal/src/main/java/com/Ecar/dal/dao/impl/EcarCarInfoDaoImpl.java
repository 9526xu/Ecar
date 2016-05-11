package com.Ecar.dal.dao.impl;

import com.Ecar.common.utils.PageResult;
import com.Ecar.dal.commonDao.impl.CommonDaoImpl;
import com.Ecar.dal.dao.IEcarCarInfoDao;
import com.Ecar.dal.dao.IEcarTestDoDao;
import com.Ecar.dal.model.EcarCarinfoDo;
import com.Ecar.dal.model.EcarTestDo;
import com.Ecar.dal.query.CarInfoQuery;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.orm.hibernate4.HibernateCallback;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by xiaohei on 16/4/25.
 */
@Repository(IEcarCarInfoDao.SERVICE_NAME)
public class EcarCarInfoDaoImpl extends CommonDaoImpl<EcarCarinfoDo> implements IEcarCarInfoDao {

    /**
     * 分页搜索
     * @param carInfoQuery
     * @return
     */
    @Override
    public PageResult<EcarCarinfoDo> queryWithPage(CarInfoQuery carInfoQuery) {
        final String baseHql="from EcarCarinfoDo where 1=1 ";

        String condition=buildCondition(carInfoQuery);

        int totalCount=getCountCarInfo(carInfoQuery);

        List<EcarCarinfoDo> list=this.getHibernateTemplate().execute(new HibernateCallback<List<EcarCarinfoDo>>() {
            @Override
            public List<EcarCarinfoDo> doInHibernate(Session session) throws HibernateException {
                Query query=session.createQuery(baseHql);



                return query.list();
            }
        });

        PageResult<EcarCarinfoDo> result=new PageResult<>();
        result.setPageNo(carInfoQuery.getPageNo());
        result.setTotalCount(totalCount);
        result.setResult(list);



        return result;
    }

    /**
     * [拼接搜索条件
     * @param carInfoQuery
     * @return
     */
    private String buildCondition(CarInfoQuery carInfoQuery) {
        return "";
    }

    private int getCountCarInfo(final CarInfoQuery carInfoQuery) {
        final String baseHql="select count(*) from EcarCarinfoDo where 1=1";

        return this.getHibernateTemplate().execute(new HibernateCallback<Integer>() {

            @Override
            public Integer doInHibernate(Session session) throws HibernateException {
                //String hql=baseHql+buildCondition(carInfoQuery);
                Query query=session.createQuery(baseHql);

                Long totalCount= (Long) query.uniqueResult();



                return totalCount.intValue();
            }
        });

    }


}
