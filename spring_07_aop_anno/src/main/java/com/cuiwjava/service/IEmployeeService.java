package com.cuiwjava.service;

import com.cuiwjava.domain.Employee;

/**
 * @Classname IEmployeeService
 * @Description TODO
 * @Date 2019/4/21/021 23:55
 * @Created by cuiwjava
 */
public interface IEmployeeService {
    void save(Employee employee);
    void update(Employee employee);
}
