package com.cuiwjava.statics;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AA {

	private static Object variable;

	@Autowired
	public AA(Object variable) {
		AA.variable = variable;
	}
	
}