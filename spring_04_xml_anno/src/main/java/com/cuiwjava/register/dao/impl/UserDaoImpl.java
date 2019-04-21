package com.cuiwjava.register.dao.impl;

import com.cuiwjava.register.dao.IUserDao;
import com.cuiwjava.register.domain.User;
import lombok.Cleanup;
import lombok.Setter;
import lombok.SneakyThrows;
import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UserDaoImpl implements IUserDao {

    @Setter
    private DataSource dataSource;

//    public void setDataSource(DataSource dataSource) {
//        this.dataSource = dataSource;
//    }

    @SneakyThrows
    public void save(User user) throws SQLException {
        System.out.println(" save operator ");
        @Cleanup
        Connection conn = dataSource.getConnection();
        String sql = "INSERT INTO user1(name,age) VALUES(?,?)";
        @Cleanup
        PreparedStatement ps = conn.prepareStatement(sql);
        System.out.println(" username "+user.getName() + "age " + user.getAge());
        ps.setString(1, user.getName());
        ps.setInt(2,user.getAge());
        ps.executeUpdate();

    }

}