package cpucode.test.data.source;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.junit.Test;

import java.sql.Connection;
import java.util.ResourceBundle;

/**
 * @author : cpucode
 * @date : 2021/2/17
 * @time : 18:27
 * @github : https://githfub.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class C3p0ProperTest {

    /**
     * 测试手动创建 c3p0 数据源(加载properties配置文件)
     * */
    @Test
    public void test1() throws Exception{
        //读取配置文件
        ResourceBundle rb = ResourceBundle.getBundle("jdbc");

        String driver = rb.getString("jdbc.driver");
        String url = rb.getString("jdbc.url");
        String username = rb.getString("jdbc.username");
        String password = rb.getString("jdbc.password");

        //创建数据源对象  设置连接参数
        ComboPooledDataSource dataSource = new ComboPooledDataSource();
        dataSource.setDriverClass(driver);
        dataSource.setJdbcUrl(url);
        dataSource.setUser(username);
        dataSource.setPassword(password);

        Connection connection = dataSource.getConnection();

        System.out.println(connection);

        connection.close();

    }
}
