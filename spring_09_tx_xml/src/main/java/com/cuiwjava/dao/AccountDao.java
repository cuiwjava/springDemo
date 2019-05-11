package com.cuiwjava.dao;

public interface AccountDao {

    void transOut(Long outId,int money);
    void transIn(Long inId,int money);
}