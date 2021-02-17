package cpucode.demo;

import cpucode.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * @author : cpucode
 * @date : 2021/2/17
 * @time : 13:32
 * @github : https://githfub.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class UserController {
    public static void main(String[] args) {
        ApplicationContext app = new ClassPathXmlApplicationContext("userService.xml");

        System.out.println();

        UserService userService = (UserService)app.getBean("userService");

        userService.save();
    }
}
