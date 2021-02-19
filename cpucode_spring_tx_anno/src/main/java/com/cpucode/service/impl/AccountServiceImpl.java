package com.cpucode.service.impl;

import com.cpucode.dao.AccountDao;
import com.cpucode.domian.Account;
import com.cpucode.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import sun.nio.ch.IOStatus;

/**
 * @author : cpucode
 * @date : 2021/2/19
 * @time : 14:44
 * @github : https://githfub.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
@Service("accountService")
@Transactional(isolation = Isolation.REPEATABLE_READ)
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountDao accountDao;

    /**
     * @Transactional(isolation = Isolation.READ_COMMITTED, propagation = Propagation.REQUIRED)
     *
     * @param outMan
     * @param inMan
     * @param money
     */
    @Override
    public void transfer(String outMan, String inMan, double money) {
        accountDao.out(outMan, money);

        accountDao.in(inMan, money);
    }

    @Override
    public void errorTest(String outMan, String inMan, double money) {
        accountDao.out(outMan, money);

        int i = 1 / 0;

        accountDao.in(inMan, money);
    }
}
