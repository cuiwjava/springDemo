package com.cuiwjava.jdbc.dao;

import com.cuiwjava.jdbc.domain.Employee;

import java.util.List;

public interface IEmployeeDao {

    void save(Employee employee);
    void update(Employee employee);
    void delete(int id);
    Employee selectById(int id);
    List<Employee> selectAll();
}