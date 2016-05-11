package com.Ecar.dal.dao.impl;

import com.Ecar.dal.commonDao.impl.CommonDaoImpl;
import com.Ecar.dal.dao.IEcarTestDoDao;
import com.Ecar.dal.dao.IEcarUserDao;
import com.Ecar.dal.model.EcarTestDo;
import com.Ecar.dal.model.EcarUserDo;
import org.springframework.stereotype.Repository;
import org.springframework.util.CollectionUtils;

import java.util.List;

/**
 * Created by xiaohei on 16/4/25.
 */
@Repository(IEcarUserDao.SERVICE_NAME)
public class EcarUserDaoImpl extends CommonDaoImpl<EcarUserDo> implements IEcarUserDao {

    @Override
    public EcarUserDo getUserByTel(String mobile) {
        String hql="from EcarUserDo where mobile=?";
        List list=this.getHibernateTemplate().find(hql,mobile);
        EcarUserDo ecarUserDo=null;
        if(!CollectionUtils.isEmpty(list)){
            ecarUserDo= (EcarUserDo) list.get(0);
        }
        return ecarUserDo;
    }
}
