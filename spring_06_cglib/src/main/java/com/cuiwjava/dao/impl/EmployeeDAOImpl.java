package com.cuiwjava.dao.impl;

import com.cuiwjava.dao.IEmployeeDAO;
import com.cuiwjava.domain.Employee;

/**
 * @Classname EmployeeDAOImpl
 * @Description TODO
 * @Date 2019/4/21/021 23:53
 * @Created by cuiwjava
 */
public class EmployeeDAOImpl implements IEmployeeDAO {

    public void save(Employee employee) {
        System.out.println("保存员工");
    }

    public void update(Employee employee) {
        System.out.println("修改员工");
    }

}
