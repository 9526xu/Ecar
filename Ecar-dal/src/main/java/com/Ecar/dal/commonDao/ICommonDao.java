package com.Ecar.dal.commonDao;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

/**
 * Created by yyx on 16/4/25.
 * 公共接口
 */
public interface ICommonDao<T> {
    public void saveEntity(T entity);

    /**
     * yyx 更新
     * @param entity
     */
    public void updateEntity(T entity);

    /**
     * yyx
     * 根据id查找
     * @param id
     * @return
     */
    public T getEntityById(Serializable id);

    /**
     * yyx
     * 根据输入id删除
     * @param ids
     */
    public void deleteEntityByIds(Serializable...ids);

    /**
     * 批量删除
     * @param list
     */
    public void deleteEntityByCollections(List<T> list);

    /**
     * 按条件搜索
     * @param condition service层拼接搜索条件
     * @param params 搜索参数
     * @param orderBy 排序参数
     * @return
     */
    public List<T> getCollectionByConditionNoPage(String condition,
                                                  List<Object> params,
                                                  Map<String,String> orderBy);


}
