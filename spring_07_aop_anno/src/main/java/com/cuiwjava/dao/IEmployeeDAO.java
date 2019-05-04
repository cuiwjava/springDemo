package com.cuiwjava.dao;

import com.cuiwjava.domain.Employee;

/**
 * @Classname IEmployeeDAO
 * @Description TODO
 * @Date 2019/4/21/021 23:50
 * @Created by cuiwjava
 */
public interface IEmployeeDAO {

    void save(Employee employee);

    void update(Employee employee);
}
