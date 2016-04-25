package com.Ecar.common.utils;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by xiaohei on 16/4/25.
 */
public class SpringUtil {
    public static ApplicationContext applicationContext;
    private static final String path = "spring-common.xml";

    static {
        applicationContext = new ClassPathXmlApplicationContext(path);
    }
}
