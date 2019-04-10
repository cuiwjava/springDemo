
package com.cuiwjava.di_constructor;

import lombok.Data;

@Data
public class Person {
    private Cat cat;

    public Person(Cat cat) {
        this.cat = cat;
    }

    public Cat getCat() {
        return cat;
    }

    public void setCat(Cat cat) {
        this.cat = cat;
    }
}