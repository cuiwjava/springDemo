package com.cuiwjava.xml_autowired;

/**
 * @Classname Person
 * @Description TODO
 * @Date 2019/4/10/010 9:33
 * @Created by cuiwjava
 */
public class Person {
    private Dog dog;

    public void setDog(Dog dog) {
        this.dog = dog;
    }

    @Override
    public String toString() {
        return "Person{" +
                "dog=" + dog +
                '}';
    }
}
