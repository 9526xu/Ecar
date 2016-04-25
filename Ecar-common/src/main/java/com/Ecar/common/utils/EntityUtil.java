package com.Ecar.common.utils;

import java.lang.reflect.ParameterizedType;

/**
 * Created by yyx on 16/4/25.
 *
 */
public class EntityUtil {
    /**
     * 获取父类上泛型类
     * @param entity
     * @return
     */
    public static Class getEntityClass(Class entity){
        ParameterizedType parameterizedType= (ParameterizedType) entity.getGenericSuperclass();
        Class entityClass= (Class) parameterizedType.getActualTypeArguments()[0];
        return entityClass;
    }
}
