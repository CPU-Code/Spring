package com.cpucode.dao.impl;

import com.cpucode.dao.AccountDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 * @author : cpucode
 * @date : 2021/2/19
 * @time : 14:45
 * @github : https://githfub.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
@Repository("acountDao")
public class AccountDaoImpl implements AccountDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void out(String outMan, double money) {
        int row = jdbcTemplate.update("update acount set money = money - ? where name = ?", money, outMan);

        System.out.println(row);
    }

    @Override
    public void in(String inMan, double money) {
        int row = jdbcTemplate.update("update acount set money = money + ? where name = ?", money, inMan);

        System.out.println(row);
    }
}
