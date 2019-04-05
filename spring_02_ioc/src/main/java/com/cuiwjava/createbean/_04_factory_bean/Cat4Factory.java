package com.cuiwjava.createbean._04_factory_bean;

import org.springframework.beans.factory.FactoryBean;

/**
 * @Classname Cat4Factory
 * @Description TODO
 * @Date 2019/4/5/005 14:35
 * @Created by cuiwjava
 */
public class Cat4Factory implements FactoryBean<Cat4> {

    private String username;

    public void setUsername(String username) {
        this.username = username;
    }

    public Cat4 getObject() throws Exception {
        System.out.println("username=" + username);
        Cat4 cat4 = new Cat4();
        return cat4;
    }

    public Class<?> getObjectType() {
        return Cat4.class;
    }
}
