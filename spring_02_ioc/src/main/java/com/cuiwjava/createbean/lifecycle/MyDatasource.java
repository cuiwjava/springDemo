package com.cuiwjava.createbean.lifecycle;

public class MyDatasource {

    public MyDatasource(){
        System.out.println("创建");
    }

    public void open(){
        System.out.println("打开");
    }
    public void doWork(){System.out.println("工作");}
    public void doaction(){
        System.out.println("运行");
    }
    public void close(){
        System.out.println("销毁");
    }
}