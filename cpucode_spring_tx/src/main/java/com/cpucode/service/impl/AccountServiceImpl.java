package com.cpucode.service.impl;

import com.cpucode.dao.AccountDao;
import com.cpucode.service.AccountService;

/**
 * @author : cpucode
 * @date : 2021/2/19
 * @time : 12:25
 * @github : https://githfub.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class AccountServiceImpl implements AccountService {
    private AccountDao accountDao;

    public void setAccountDao(AccountDao accountDao){
        this.accountDao = accountDao;
    }

    public void transfer(String outMan, String inMan, double money){
        accountDao.out(outMan, money);

        accountDao.in(inMan, money);
    }

    public void errorTest(String outMan, String inMan, double money){
        accountDao.out(outMan, money);

        int i = 1 /0;

        accountDao.in(inMan, money);
    }
}
