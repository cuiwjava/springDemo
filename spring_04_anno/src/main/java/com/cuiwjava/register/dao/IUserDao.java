package com.cuiwjava.register.dao;

import com.cuiwjava.register.domain.User;

import java.sql.SQLException;

public interface IUserDao {
    public void save(User user) throws SQLException;
}