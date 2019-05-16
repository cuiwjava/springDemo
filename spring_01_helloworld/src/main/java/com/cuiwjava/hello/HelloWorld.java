package com.cuiwjava.hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @Classname hello
 * @Description TODO
 * @Date 2019/3/31/031 12:09
 * @Created by cuiwjava
 */
public class HelloWorld {

//    @Autowired
    private static String username;

    public HelloWorld(){

    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    public void sayHello(String username){
        System.out.println("欢迎来到Spring帝国，你好: "+ username);
    }


}
