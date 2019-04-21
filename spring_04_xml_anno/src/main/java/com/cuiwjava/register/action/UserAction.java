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
	// @Setter=setService

//	public void setService(IUserService service) {
//		this.service = service;
//	}

	public String execute() throws SQLException {
		System.out.println("请求");
		service.register(new User(1,"cuiwjava",27));
		// id=1 在数据库中是主键自增使用，这里insert 没有用到
		return "success";

	}
}
