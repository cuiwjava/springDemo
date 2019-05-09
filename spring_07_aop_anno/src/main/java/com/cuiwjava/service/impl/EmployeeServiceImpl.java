package com.cuiwjava.service.impl;

import com.cuiwjava.dao.IEmployeeDAO;
import com.cuiwjava.domain.Employee;
import com.cuiwjava.service.IEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Classname EmployeeServiceImpl
 * @Description TODO
 * @Date 2019/4/21/021 23:55
 * @Created by cuiwjava
 */

/**
 * CGLIB 方式不需要实现接口
 *
 */
@Service
public class EmployeeServiceImpl /*implements IEmployeeService  1/ */ {
    @Autowired
    private IEmployeeDAO dao;

//    public void setDao(IEmployeeDAO dao) {
//        this.dao = dao;
//    }

    public void save(Employee employee) {
       dao.save(employee);
    }

    public void update(Employee employee) {
       dao.update(employee);
    }
}
