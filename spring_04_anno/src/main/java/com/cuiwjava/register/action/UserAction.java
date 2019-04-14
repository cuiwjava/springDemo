package com.cuiwjava.register.action;

import com.cuiwjava.register.domain.User;
import com.cuiwjava.register.service.IUserService;
import lombok.Setter;

import java.sql.SQLException;

/**
 * @Classname UserAction
 * @Description TODO
 * @Date 2019/4/12 9:09
 * @Created by cuiwei34
 */
// 模拟struts2的Action/MVC的Controller

public class UserAction {

	@Setter
	private IUserService service;

	public String execute() throws SQLException {
		System.out.println("请求");
		service.register(new User());
		return "success";

	}
}
