package com.cuiwjava.register.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

/**
 * @Classname Person
 * @Description TODO
 * @Date 2019/4/15 8:54
 * @Created by cuiwei34
 */
public class Person {
	@Autowired
	@Qualifier("cat")
	private Cat cat;

	public void setCat(Cat cat) {
		this.cat = cat;
	}

	@Override
	public String toString() {
		return "Person{" +
				"cat=" + cat +
				'}';
	}
}
