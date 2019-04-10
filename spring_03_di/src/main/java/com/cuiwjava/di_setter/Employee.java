package com.cuiwjava.di_setter;

import java.math.BigDecimal;

/**
 * @Classname Employee
 * @Description TODO
 * @Date 2019/4/10/010 23:02
 * @Created by cuiwjava
 */
public class Employee {
    private String name;
    private Integer age;
    private BigDecimal salary;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }
}
