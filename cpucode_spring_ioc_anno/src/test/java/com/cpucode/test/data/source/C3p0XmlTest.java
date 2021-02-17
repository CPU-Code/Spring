package cpucode.test.data.source;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.sql.DataSource;
import java.sql.Connection;

/**
 * @author : cpucode
 * @date : 2021/2/17
 * @time : 18:58
 * @github : https://githfub.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class C3p0XmlTest {
    /**
     * 测试Spring容器产生数据源对象
     * */
    @Test
    public void test1() throws Exception{
        ApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");

        DataSource dataSource = app.getBean(DataSource.class);
        Connection connection = dataSource.getConnection();

        System.out.println(connection);

        connection.close();
    }
}
