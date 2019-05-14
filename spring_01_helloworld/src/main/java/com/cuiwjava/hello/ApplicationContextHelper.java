package com.cuiwjava.hello;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import java.lang.reflect.Type;

public class ApplicationContextHelper implements ApplicationContextAware {
    private static ApplicationContext context;

    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        context = applicationContext;
    }

    public static ApplicationContext getContext(){
        return context;
    }

    public static Object  getBean(String beanName){
        return context.getBean(beanName);
    }
    public static Object getBean(String beanName,Object... obj){
        return context.getBean(beanName,obj);
    }
    public static Object getBean(String beanName, Type t){
        return context.getBean(beanName,t);
    }
}