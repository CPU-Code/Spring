package cpucode.demo;

import cpucode.service.UserService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author : cpucode
 * @date : 2021/2/17
 * @time : 16:00
 * @github : https://githfub.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class UserControllerAggregate {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext app = new ClassPathXmlApplicationContext("userControllerAggregate.xml");

        UserService userService = (UserService) app.getBean("serviceAggregate");

        userService.save();
    }
}
