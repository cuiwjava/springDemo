package com.cuiwjava.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

/**
 * @Classname TestBeanLifecycle
 * @Description TODO
 * @Date 2019/5/24/024 7:00
 * @Created by cuiwjava
 */
public class TestBeanLifecycle   implements InitializingBean, DisposableBean {

    public void start(){
        System.out.println("TestBeanLifecycle start");
    }

    public void stop(){
        System.out.println("TestBeanLifecycle stop");
    }

    public void destroy() throws Exception {
        System.out.println(" Bean destroy");
    }

    public void afterPropertiesSet() throws Exception {
        System.out.println("  Bean afterPropertiesSet");

    }

    public void defaultInit(){
        System.out.println("  Bean defaultInit");
    }

    public void defaultDestroy(){
        System.out.println("  Bean defaultDestroy");
    }
}
