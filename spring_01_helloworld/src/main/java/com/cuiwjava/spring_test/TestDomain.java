package com.cuiwjava.spring_test;

import com.cuiwjava.domain.Domain;

/**
 * https://www.jianshu.com/p/127310cb90e0
 */
public class TestDomain {
    public static void main(String[] args) {
        String domainString = Domain.getInstance().toString();
        System.out.println(domainString);
    }
}