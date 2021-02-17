package cpucode.test;

import cpucode.dao.UserDao;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author : cpucode
 * @date : 2021/2/17
 * @time : 12:04
 * @github : https://githfub.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class SpringProtoTest {
    @Test
    public void test1(){
        ClassPathXmlApplicationContext app = new ClassPathXmlApplicationContext("userDaoProto.xml");

        //创建一个bean
        UserDao userDao = (UserDao)app.getBean("userDaoProto");

        //创建另一个bean
        UserDao userDao2 = (UserDao)app.getBean("userDaoProto");

        System.out.println(userDao);
        System.out.println(userDao2);
    }
}

/**
 * com.cpucode.dao.impl.UserDaoImpl@2d8f65a4
 * com.cpucode.dao.impl.UserDaoImpl@1b68ddbd
 * */
