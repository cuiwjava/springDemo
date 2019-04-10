package com.cuiwjava.di_setter;

import com.cuiwjava.xml_autowired.Dog;

/**
 * @Classname Person
 * @Description TODO
 * @Date 2019/4/10/010 9:33
 * @Created by cuiwjava
 */
public class Person1 {
    private Cat1 cat1;

    public void setCat1(Cat1 cat1) {
        this.cat1 = cat1;
    }

    @Override
    public String toString() {
        return "Person1{" +
                "cat1=" + cat1 +
                '}';
    }
}
