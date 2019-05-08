package com.cuiwjava.jdbc.dao.impl;

import com.cuiwjava.jdbc.dao.IEmployeeDao;
import com.cuiwjava.jdbc.domain.Employee;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class EmployeeSupport extends JdbcDaoSupport implements IEmployeeDao {

    public void save(Employee employee) {
        super.getJdbcTemplate().update("insert into employee (name, age) values(?,?) ",
                employee.getName(),employee.getAge());
    }

    public void update(Employee employee) {
        super.getJdbcTemplate().update("update employee set name=?,age=? where id=?",
                employee.getName(),employee.getAge(),employee.getId());
    }

    public void delete(int id) {
        super.getJdbcTemplate().update("delete from employee where id=?",id);
    }


    public Employee selectById(int id) {


        List<Employee> list = super.getJdbcTemplate().query("select * from employee where id=?",
                new Object[id],
                new EmployeeMapper());

        return list.size() == 1 ? list.get(0) : null;

    }

    public List<Employee> selectAll() {

        return super.getJdbcTemplate().query("select * from employee",
                new EmployeeMapper());
    }

    private static final class EmployeeMapper implements RowMapper<Employee> {

        public Employee mapRow(ResultSet resultSet, int i) throws SQLException {
            Employee emp = new Employee();
            emp.setId(resultSet.getInt(1));
            emp.setName(resultSet.getString(2));
            emp.setAge(resultSet.getInt(3));
            return emp;
        }
    }
}