package com.cuiwjava.register.service.impl;

import com.cuiwjava.register.dao.IUserDao;
import com.cuiwjava.register.domain.User;
import com.cuiwjava.register.service.IUserService;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;

import java.sql.SQLException;

/**
 * @Classname UserServiceImpl
 * @Description TODO
 * @Date 2019/4/12 9:05
 * @Created by cuiwei34
 */
public class UserServiceImpl implements IUserService {

	@Autowired
	@Setter
	private IUserDao dao;

//	public void setDao(IUserDao dao) {
//		this.dao = dao;
//	}

	public void register(User user) throws SQLException {
		System.out.println("register");
		dao.save(user);
	}
}
