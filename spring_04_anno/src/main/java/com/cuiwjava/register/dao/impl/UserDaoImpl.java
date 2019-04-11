package com.cuiwjava.register.dao.impl;

import com.alibaba.druid.pool.DruidDataSource;
import com.wac.springtest.di_anno.register.dao.IUserDao;
import com.wac.springtest.di_anno.register.domain.User;
import lombok.Cleanup;
import lombok.Setter;
import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

@Repository()
public class UserDaoImpl implements IUserDao {

    private final DruidDataSource dataSource;

    @Autowired
    public UserDaoImpl(DruidDataSource dataSource) {
        this.dataSource = dataSource;
    }

    @SneakyThrows
    public void save(User user) throws SQLException {
        @Cleanup
        Connection conn = dataSource.getConnection();
        String sql = "insert into user(id,name,age) values(?,?,?)";
        @Cleanup
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setInt(1,user.getId());
        ps.setString(2,user.getName());
        ps.setInt(3,user.getAge());
        ps.executeUpdate();
    }

}