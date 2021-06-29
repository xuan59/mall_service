package com.mall.common.utils;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

/**
 * @author lx
 * @date 2021-06-11 16:30
 */
@Component
public class SpringUtil implements ApplicationContextAware {

    private static ApplicationContext applicationContext;


    @Override
    public void setApplicationContext(ApplicationContext context) throws BeansException {
        applicationContext = context;
    }

    public static void setApplicationContext2(ApplicationContext context) {
        applicationContext = context;
    }

    public static ApplicationContext getApplicationContext() {
        return applicationContext;
    }

    public static <T> T getBean(Class<T> clazz) {
        return getApplicationContext().getBean(clazz);
    }
}
