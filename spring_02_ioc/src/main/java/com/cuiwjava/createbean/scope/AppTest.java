package com.cuiwjava.createbean.scope;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

/**
 * @Classname AppTest
 * @Description TODO
 * @Date 2019/4/9/009 7:27
 * @Created by cuiwjava
 */
@SpringJUnitConfig
public class AppTest {
    @Autowired
    private Dog dog1;
    @Autowired
    private Dog dog2;
    @Autowired
    private Dog dog3;
    @Test
    void test(){
        System.out.println(dog1);
        System.out.println(dog2);
        System.out.println(dog3);
    }
}
