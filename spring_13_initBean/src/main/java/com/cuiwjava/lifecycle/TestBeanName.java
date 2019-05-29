package com.cuiwjava.lifecycle;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * @Classname TestBeanName
 * @Description TODO
 * @Date 2019/5/29/029 9:33
 * @Created by cuiwjava
 */
public class TestBeanName implements BeanNameAware, ApplicationContextAware {
    private String beanName;

    @Override
    public void setBeanName(String name) {
        this.beanName = name;
        System.out.println("TestbeanName");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println(applicationContext.getBean(this.beanName));
    }


}
