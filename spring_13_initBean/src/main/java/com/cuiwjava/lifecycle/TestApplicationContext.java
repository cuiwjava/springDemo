package com.cuiwjava.lifecycle;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * @Classname TestApplicationContext
 * @Description TODO
 * @Date 2019/5/29/029 9:28
 * @Created by cuiwjava
 */
public class TestApplicationContext implements ApplicationContextAware {

    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println(applicationContext.getBean("applicationContextHelper"));
    }
}
