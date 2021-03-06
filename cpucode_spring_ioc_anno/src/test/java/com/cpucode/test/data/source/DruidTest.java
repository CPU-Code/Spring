package com.cpucode.test.data.source;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.pool.DruidPooledConnection;
import org.junit.Test;

/**
 * @author : cpucode
 * @date : 2021/2/17
 * @time : 18:10
 * @github : https://githfub.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class DruidTest {
    /**
     * 测试手动创建 druid 数据源
     * */
    @Test
    public void test2() throws Exception {
        //创建数据源
        DruidDataSource dataSource = new DruidDataSource();

        //设置数据库连接参数
        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:3306/test?serverTimezone=UTC");
        dataSource.setUsername("root");
        dataSource.setPassword("12345");

        //获得连接对象
        DruidPooledConnection connection = dataSource.getConnection();

        System.out.println(connection);

        connection.close();
    }
}
