package com.cuiwjava.bean_inheritance;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@ContextConfiguration("classpath:bean_inheritance.xml")
@RunWith(SpringJUnit4ClassRunner.class)
public class bean_inheritanceTest {

    @Autowired
    private SomeBean1 someBean1;
    @Autowired
    private SomeBean2 someBean2;
    @Test
    public void test(){
        System.out.println(someBean1);
        System.out.println(someBean2);
    }

}