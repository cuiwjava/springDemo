package com.cuiwjava.service.impl;

import com.cuiwjava.dao.AccountDao;
import com.cuiwjava.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class AccountServiceImpl implements AccountService {
    @Autowired
    private AccountDao accountDao;

//    public void setAccountDao(AccountDao accountDao) {
//        this.accountDao = accountDao;
//    }

    public void trans(Long outId, Long inId, int money) {

        accountDao.transOut(outId,money);
        //模拟突然停电
        // int a = 1/0;
        //System.out.println(1/0);
        accountDao.transIn(inId,money);
    }
}