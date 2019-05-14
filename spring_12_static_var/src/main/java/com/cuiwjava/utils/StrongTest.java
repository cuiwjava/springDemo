package com.cuiwjava.utils;

/**
 * @Classname StrongTest
 * @Description TODO
 * @Date 2019/5/14 21:20
 * @Created by cuiwei34
 */
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Value;
public class StrongTest implements InitializingBean {

	public static String STRONG_TEST;

	@Value("${strong.url.strongTest}")
	private String strongTest;

	@Override
	public void afterPropertiesSet() throws Exception {
		STRONG_TEST= strongTest;
	}
}


