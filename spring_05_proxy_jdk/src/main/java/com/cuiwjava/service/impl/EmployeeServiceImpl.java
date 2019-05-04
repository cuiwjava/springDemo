package com.cuiwjava.service.impl;

import com.cuiwjava.dao.IEmployeeDAO;
import com.cuiwjava.domain.Employee;
import com.cuiwjava.service.IEmployeeService;
import org.junit.Test;

import java.util.List;

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

    public void delete(Long id) {
//        dao.(id);
        System.out.println(" delete");
    }

    @Test
    public List<Employee> listAll() {
        System.out.println(" listAll ");
        return null;
    }
}
