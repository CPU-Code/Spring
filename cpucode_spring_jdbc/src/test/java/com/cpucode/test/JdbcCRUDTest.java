package com.cpucode.test;

import com.cpucode.domain.Account;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * @author : cpucode
 * @date : 2021/2/19
 * @time : 10:54
 * @github : https://githfub.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:jdbcProper.xml")
public class JdbcCRUDTest {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Test
    public void deleteTest(){
        int row = jdbcTemplate.update("delete from acount where name = ?", "lisi");

        System.out.println(row);

    }

    @Test
    public void updateTest(){
        int row = jdbcTemplate.update("update acount set money = ? where name = ?", 1314, "cpu");

        System.out.println(row);
    }

    @Test
    public void queryAllTest(){
        List<Account> list = jdbcTemplate.query("select * from acount", new BeanPropertyRowMapper<Account>(Account.class));

        System.out.println(list);
    }

    @Test
    public void queryOneTest(){
        Account account = jdbcTemplate.queryForObject("select * from acount where name = ?", new BeanPropertyRowMapper<Account>(Account.class), "cpu");

        System.out.println(account);
    }

    @Test
    public void queryCountTest(){
        Long count = jdbcTemplate.queryForObject("select count(*) from acount", Long.class);

        System.out.println(count);
    }
}
