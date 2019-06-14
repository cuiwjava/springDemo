package com.cuiwjava.impl;

import com.cuiwjava.interfacex.AutoWire;

public class NoAutoWire implements AutoWire {
    
    String value;

    public NoAutoWire(String value) {
        this.value = value;
    }

    @Override
    public String getValue() {
        return value;
    }
    
}