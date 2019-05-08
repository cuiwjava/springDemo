package com.cuiwjava.jdbc.dao.impl;

import com.cuiwjava.jdbc.dao.IEmployeeDao;
import com.cuiwjava.jdbc.domain.Employee;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import javax.sql.DataSource;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;


public class EmployeeDaoImpl implements IEmployeeDao {
    private JdbcTemplate jdbcTemplate;
    public void setDataSource(DataSource dataSource){
        this.jdbcTemplate = new JdbcTemplate(dataSource);
        this.namedParameterJdbcTemplate = new NamedParameterJdbcTemplate(dataSource);
    }
    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;



    public void save(final Employee employee) {
        /*
        jdbcTemplate.update("insert into employee (name, age) values(?,?) ",
                employee.getName(),employee.getAge());
        //public int update(String sql, @Nullable Object... args) throws DataAccessException
        //返回受影响的行数
        */

        namedParameterJdbcTemplate.update("insert into employee (name, age) values(:name,:age)",new HashMap(){
            {
                this.put("name",employee.getName());
                this.put("age",employee.getAge());
            }
        });


    }

    public void update(Employee employee) {
        jdbcTemplate.update("update employee set name=?,age=? where id=?",
                employee.getName(),employee.getAge(),employee.getId());
    }

    public void delete(int id) {
        jdbcTemplate.update("delete from employee where id=?",id);
    }
    /*
    public Employee selectById(int id) {
        Employee employee = jdbcTemplate.queryForObject("select * from employee where id=?",new Object[]{id}, new RowMapper<Employee>() {
            public Employee mapRow(ResultSet resultSet, int i) throws SQLException {
                Employee emp = new Employee();
                emp.setId(resultSet.getInt(1));
                emp.setName(resultSet.getString(2));
                emp.setAge(resultSet.getInt(3));
                return emp;
            }
        });
        return employee;
    }
    public List<Employee> selectAll() {
        List<Employee> list = jdbcTemplate.query("select * from employee", new RowMapper<Employee>() {
            public Employee mapRow(ResultSet resultSet, int i) throws SQLException {
                Employee employee = new Employee();
                employee.setId(resultSet.getInt(1));
                employee.setName(resultSet.getString(2));
                employee.setAge(resultSet.getInt(3));
                return employee;
            }
        });
        return list;
    }
    */
    public Employee selectById(int id) {

        /*
        Employee employee = jdbcTemplate.queryForObject(
                "select * from employee where id=?",
                new Object[]{id},
                new EmployeeMapper());
        return employee;
        */

        List<Employee> list = jdbcTemplate.query("select * from employee where id=?",
                new Object[id],
                new EmployeeMapper());

        return list.size() == 1 ? list.get(0) : null;

    }

    public List<Employee> selectAll() {
        /*
        List<Employee> list = jdbcTemplate.query("select * from employee",
                new EmployeeMapper());
        return list;
        */


        /*
        jdbcTemplate.query("select * from employee",{resultSet,i} -> {
            Employee employee = new Employee();
            employee.setId(resultSet.getInt(1));
            employee.setName(resultSet.getString(2));
            employee.setAge(resultSet.getInt(3));
            return employee;
        });
        */
        return jdbcTemplate.query("select * from employee",
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