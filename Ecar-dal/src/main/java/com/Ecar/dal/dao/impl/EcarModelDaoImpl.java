package com.Ecar.dal.dao.impl;

import com.Ecar.dal.commonDao.impl.CommonDaoImpl;
import com.Ecar.dal.dao.IEcarModelDao;
import com.Ecar.dal.dao.IEcarTestDoDao;
import com.Ecar.dal.model.EcarModelDo;
import com.Ecar.dal.model.EcarTestDo;
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
}
