package com.Ecar.dal.dao.impl;

import com.Ecar.dal.commonDao.impl.CommonDaoImpl;
import com.Ecar.dal.dao.IEcarRegionDao;
import com.Ecar.dal.dao.IEcarTestDoDao;
import com.Ecar.dal.model.EcarRegionDo;
import com.Ecar.dal.model.EcarTestDo;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by xiaohei on 16/4/25.
 */
@Repository(IEcarRegionDao.SERVICE_NAME)
public class EcarRegionDaoImpl extends CommonDaoImpl<EcarRegionDo> implements IEcarRegionDao {

    @Override
    public List<EcarRegionDo> getAllProvinces() {
        String hql="from EcarRegionDo where pRegId='100000'";

        return (List<EcarRegionDo>) this.getHibernateTemplate().find(hql);
    }

    @Override
    public List<EcarRegionDo> getCityByProvinceId(String regid) {
        String hql="from EcarRegionDo where pRegId=?";


        return (List<EcarRegionDo>) this.getHibernateTemplate().find(hql,regid);
    }
}
