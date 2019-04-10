
package com.cuiwjava.di_constructor;

import lombok.Data;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

@Data
public class CollectionBean {

    private Set<String> set;
    private List<String> list;
    private String[] array;
    private Map<String,String> map;
    private Properties properties;

    public CollectionBean(Set<String> set) {
        this.set = set;
    }
}