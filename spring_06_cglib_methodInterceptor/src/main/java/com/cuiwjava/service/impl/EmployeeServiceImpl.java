package com.cuiwjava.service.impl;

import com.cuiwjava.dao.IEmployeeDAO;
import com.cuiwjava.domain.Employee;
import com.cuiwjava.service.IEmployeeService;

/**
 * @Classname EmployeeServiceImpl
 * @Description TODO
 * @Date 2019/4/21/021 23:55
 * @Created by cuiwjava
 */
public class EmployeeServiceImpl implements IEmployeeService {

    private IEmployeeDAO dao;

    public void setDao(IEmployeeDAO dao) {
        this.dao = dao;
    }

    public void save(Employee employee) {
       dao.save(employee);
    }

    public void update(Employee employee) {
       dao.update(employee);
    }
}
