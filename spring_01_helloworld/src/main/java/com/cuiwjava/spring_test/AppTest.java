package com.cuiwjava.spring_test;

import com.cuiwjava.hello.ApplicationContextHelper;
import com.cuiwjava.hello.HelloWorld;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @Classname SpringTest
 * @Description TODO
 * @Date 2019/4/1 12:54
 * @Created by cuiwei34
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:hello.xml")
public class AppTest {
//	@Autowired
//	HelloWorld helloWorld;

	@Test
	public void test(){
		ApplicationContext springContext = ApplicationContextHelper.getContext();

		HelloWorld helloWorld = ApplicationContextHelper.getBean("helloWorld2");
		System.out.println(" helloWorld is "+ helloWorld.getClass().getName());
		helloWorld.setUsername("helloWorld");
		System.out.println(" username is :"+ helloWorld.getUsername());

		helloWorld.sayHello("helloworld");
	}
}
