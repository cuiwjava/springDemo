package com.cuiwjava.spring_test;

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
@ContextConfiguration("classpath:com/cuiwjava/spring_test/springtest.xml")
public class SpringTestTest {

    @Autowired
    private SomeBean someBean;

    @Test
    public void testIoC(){
        someBean.doWork();
    }
}
