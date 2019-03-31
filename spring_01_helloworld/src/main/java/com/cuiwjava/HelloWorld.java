package com.cuiwjava;

/**
 * @Classname hello
 * @Description TODO
 * @Date 2019/3/31/031 12:09
 * @Created by cuiwjava
 */
public class HelloWorld {
    private String username;

    HelloWorld(){

    }
    public void setUsername(String username) {
        this.username = username;
    }

    public void sayHello(){
        System.out.println("欢迎来到Spring帝国，你好: "+ username);
    }
}
