package com.cuiwjava.spring_test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @Classname SpringTest
 * @Description TODO
 * @Date 2019/4/1 12:54
 * @Created by cuiwei34
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:SpringTest-context.xml")
public class SpringTest {
	@Autowired
	private BeanTest beanTest;

	@Test
	public void test(){

		beanTest.doaction();

	}
}
