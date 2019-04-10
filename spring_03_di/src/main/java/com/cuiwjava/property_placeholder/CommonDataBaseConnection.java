package com.cuiwjava.property_placeholder;

import com.alibaba.druid.pool.DruidDataSource;
import lombok.Cleanup;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/*
一般情况下 连接数据库的方式
 */
@ContextConfiguration("classpath:property_placeholder.xml")
@RunWith(SpringJUnit4ClassRunner.class)
public class CommonDataBaseConnection {

    @Autowired
    private DruidDataSource dataSource;

    @Test
    public void test() throws SQLException {

        /*
        dataSource = new DruidDataSource();
        dataSource.setDriverClassName("");
        dataSource.setUrl("");
        dataSource.setUsername("");
        dataSource.setPassword("");
        dataSource.setInitialSize(2);
        */

        @Cleanup
        Connection connection = dataSource.getConnection();
        @Cleanup
        PreparedStatement ps = connection.prepareStatement("select * from student");
        @Cleanup
        ResultSet rs = ps.executeQuery();
        while(rs.next()){
            System.out.print(rs.getInt("id")+"----");
            System.out.print(rs.getString("name")+"----");
            System.out.println(rs.getInt("age"));
        }



    }
}