package com.cuiwjava.register.lifecycle;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * @Classname SomeBean
 * @Description TODO
 * @Date 2019/4/17/017 10:25
 * @Created by cuiwjava
 */
@Component
@Scope(value = "prototype")
public class SomeBean {

    public SomeBean(){
        System.out.println("构建SomeBean对象");
    }

    public void open(){
        System.out.println(" 初始化方法");
    }

    public void close(){
        System.out.println("销毁前的方法");
    }

    public void doWork(){
        System.out.println(" 工作 ");
    }

}
