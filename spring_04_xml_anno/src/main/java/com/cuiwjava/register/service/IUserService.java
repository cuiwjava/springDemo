package com.cuiwjava.register.service;

import com.cuiwjava.register.domain.User;

import java.sql.SQLException;

/**
 * @Classname IUserService
 * @Description TODO
 * @Date 2019/4/12 9:04
 * @Created by cuiwei34
 */
public interface IUserService {
	void register(User user) throws SQLException;
}
