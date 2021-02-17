package cpucode.test.data.source;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.junit.Test;

import java.sql.Connection;

/**
 * @author : cpucode
 * @date : 2021/2/17
 * @time : 18:08
 * @github : https://githfub.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class C3p0Test {
    /**
     * 测试手动创建 c3p0 数据源
     */
    @Test
    public void test1() throws Exception {
        ComboPooledDataSource dataSource = new ComboPooledDataSource();

        dataSource.setDriverClass("com.mysql.cj.jdbc.Driver");
        dataSource.setJdbcUrl("jdbc:mysql:///test?serverTimezone=UTC");
        dataSource.setUser("root");
        dataSource.setPassword("12345");

        Connection connection = dataSource.getConnection();

        System.out.println(connection);

        connection.close();
    }
}
