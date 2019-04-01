package com.cuiwjava.spring_test;

import com.cuiwjava.hello.HelloWorld;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


/**
 * @Classname SpringTestTest
 * @Description TODO
 * @Date 2019/3/31/031 22:26
 * @Created by cuiwjava
 */
// SpringJUnit4 运行
@RunWith(SpringJUnit4ClassRunner.class)
// 上下文配置对象
@ContextConfiguration("classpath:applicationContext.xml")
public class SpringTestTest {
    // 按照bean类型自动注入
    @Autowired
    private SomeBean someBean;

    @Autowired
    private HelloWorld helloWorld;

    @Test
    public void testIoC(){
        someBean.doWork();
        helloWorld.sayHello();
    }
}
