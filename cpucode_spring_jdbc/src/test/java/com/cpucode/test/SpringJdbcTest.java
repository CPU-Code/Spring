package com.cpucode.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * @author : cpucode
 * @date : 2021/2/19
 * @time : 9:42
 * @github : https://githfub.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class SpringJdbcTest {
    /**
     * 测试Spring产生jdbcTemplate对象
     */
    @Test
    public void test1() {
        ApplicationContext app = new ClassPathXmlApplicationContext("springJdbc.xml");

        JdbcTemplate jdbcTemplate = (JdbcTemplate) app.getBean("jdbcTemplate");

        int row = jdbcTemplate.update("insert into acount values(?,?)", "lisi", 5000);

        System.out.println(row);
    }
}
