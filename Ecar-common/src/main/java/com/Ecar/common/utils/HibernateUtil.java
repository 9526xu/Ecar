package com.Ecar.common.utils;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.metamodel.MetadataSources;
import org.hibernate.service.ServiceRegistry;


/**
 * Created by yyx on 16/4/24.
 * hibernate单机测试工具类
 */
public class HibernateUtil {
    private static final String xmlPath="resources/hibernate.cfg.xml";
    private static final SessionFactory sessionFactory;

    static {
        //hibernate官方文档上面配置有错,如下
        /*sessionFactory = new Configuration().configure().buildSessionFactory(
                new StandardServiceRegistryBuilder().build() );// new Configuration().configure().buildSessionFactory()过时*/
        Configuration configuration = new Configuration();
        configuration.configure();
        ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
                .applySettings(configuration.getProperties()).build();
        sessionFactory = configuration
                .buildSessionFactory(serviceRegistry);

    }

    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }
}
