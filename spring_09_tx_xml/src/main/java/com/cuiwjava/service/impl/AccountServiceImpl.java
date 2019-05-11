package com.cuiwjava.service.impl;

import com.cuiwjava.dao.AccountDao;
import com.cuiwjava.service.AccountService;

public class AccountServiceImpl implements AccountService {

    private AccountDao accountDao;

    public void setAccountDao(AccountDao accountDao) {
        this.accountDao = accountDao;
    }

    public void trans(Long outId, Long inId, int money) {

        accountDao.transOut(outId,money);
        //模拟突然停电
        //System.out.println(1/0);
        accountDao.transIn(inId,money);
    }
}