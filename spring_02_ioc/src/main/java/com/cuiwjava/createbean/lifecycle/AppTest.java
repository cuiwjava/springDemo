package com.cuiwjava.createbean.lifecycle;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @Classname AppTest
 * @Description TODO
 * @Date 2019/4/9/009 7:39
 * @Created by cuiwjava
 */
public class AppTest {

    @Test
    void testOld(){
        MyDatasource ds = new MyDatasource();
        // 立马初始化
        ds.open();

        ds.doWork();

        //在销毁之前执行扫尾操作
        ds.close();

    }
    @Autowired
    private MyDatasource myDatasource;

    @Test
    void testIoC(){
        myDatasource.doWork();
    }
}
