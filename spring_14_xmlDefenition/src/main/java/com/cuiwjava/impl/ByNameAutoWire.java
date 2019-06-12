package com.cuiwjava.impl;

import com.cuiwjava.interfacex.AutoWire;

public class ByNameAutoWire implements AutoWire {
    
    private String value;

    public ByNameAutoWire(String value) {
        
        this.value = value;
    }

    @Override
    public String getValue() {
        
        return value;
    }

}