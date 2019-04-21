package com.cuiwjava.proxy;

import com.cuiwjava.domain.Employee;
import com.cuiwjava.service.IEmployeeService;
import com.cuiwjava.tx.TransactionManager;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @Classname EmployeeServiceProxy
 * @Description TODO
 * @Date 2019/4/22/022 0:19
 * @Created by cuiwjava
 */
// 静态代理类
public class EmployeeServiceProxy implements IEmployeeService{

    private IEmployeeService target;
    // 真实对象=委托对象

    public void setTarget(IEmployeeService target) {
        this.target = target;
    }

    private TransactionManager transactionManager;
    // 事务管理器


    public void setTransactionManager(TransactionManager transactionManager) {
        this.transactionManager = transactionManager;
    }

    public void save(Employee employee){
        transactionManager.begin();
        try {
            target.save(employee);
            transactionManager.commit();
        } catch (Exception e) {
            e.printStackTrace();
            transactionManager.rollback();
        }

    }

    public void update(Employee employee){
        transactionManager.begin();
        try {
            target.update(employee);
            transactionManager.commit();
        } catch (Exception e) {
            e.printStackTrace();
            transactionManager.rollback();
        }
    }


}
