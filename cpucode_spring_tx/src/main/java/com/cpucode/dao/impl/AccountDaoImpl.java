package com.cpucode.dao.impl;

import com.cpucode.dao.AccountDao;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * @author : cpucode
 * @date : 2021/2/19
 * @time : 12:24
 * @github : https://githfub.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class AccountDaoImpl implements AccountDao {
    private JdbcTemplate jdbcTemplate;

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate){
        this.jdbcTemplate = jdbcTemplate;
    }

    public void out(String outMan, double money){
        int row = jdbcTemplate.update("update acount set money = money - ? where name = ?", money, outMan);

        System.out.println(row);
    }

    public void in(String inMan, double money){
        int row = jdbcTemplate.update("update acount set money = money + ? where name = ?", money, inMan);

        System.out.println(row);
    }
}
