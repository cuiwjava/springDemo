package com.cuiwjava.createbean;

import com.cuiwjava.createbean._01_constructor.Cat1;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

/**
 * @Classname App
 * @Description TODO
 * @Date 2019/4/3/003 0:11
 * @Created by cuiwjava
 */
@SpringJUnitConfig
public class AppTest {
    @Autowired
    private Cat1 cat1;

    @Test
    void test(){
        System.out.println(cat1);
    }

    @Test
    void testOld(){
        cat1 =  new Cat1();

    }
}
