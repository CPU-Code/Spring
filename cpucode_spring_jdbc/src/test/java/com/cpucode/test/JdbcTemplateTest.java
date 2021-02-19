package com.cpucode.test;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.junit.Test;
import org.springframework.jdbc.core.JdbcTemplate;

import java.beans.PropertyVetoException;

/**
 * @author : cpucode
 * @date : 2021/2/18
 * @time : 22:05
 * @github : https://githfub.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class JdbcTemplateTest {

    /**
     * 测试JdbcTemplate开发步骤
     * */
    @Test
    public void test1() throws PropertyVetoException {
        //创建数据源对象
        ComboPooledDataSource dataSource = new ComboPooledDataSource();

        dataSource.setDriverClass("com.mysql.cj.jdbc.Driver");
        dataSource.setJdbcUrl("jdbc:mysql:///cpucode?serverTimezone=UTC");
        dataSource.setUser("root");
        dataSource.setPassword("12345");

        JdbcTemplate jdbcTemplate = new JdbcTemplate();

        //设置数据源对象  知道数据库在哪
        jdbcTemplate.setDataSource(dataSource);

        //执行操作
        int row = jdbcTemplate.update("insert into acount value (?,?)", "haha", 2222);

        System.out.println(row);
    }
}
