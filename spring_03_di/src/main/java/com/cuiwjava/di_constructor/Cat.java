package com.cuiwjava.di_constructor;

import lombok.Data;

@Data
public class Cat {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}