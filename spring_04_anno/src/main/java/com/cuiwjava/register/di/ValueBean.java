package com.cuiwjava.register.di;

import org.springframework.beans.factory.annotation.Value;

/**
 * @Classname ValueBean
 * @Description TODO
 * @Date 2019/4/16/016 7:40
 * @Created by cuiwjava
 */
public class ValueBean {
    @Value("9999")
    private int port;

    @Override
    public String toString() {
        return "ValueBean{" +
                "port=" + port +
                '}';
    }
}
