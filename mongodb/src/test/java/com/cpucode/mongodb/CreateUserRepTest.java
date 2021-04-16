package com.cpucode.mongodb;

import com.cpucode.mongodb.entity.User;
import com.cpucode.mongodb.repository.UserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author : cpucode
 * @date : 2021/4/16
 * @time : 17:34
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
@SpringBootTest
public class CreateUserRepTest {
    @Autowired
    private UserRepository userRepository;

    /**
     * 添加
     */
    @Test
    public void createUser() {
        User user = new User();

        user.setAge(11);
        user.setName("cpucode");
        user.setEmail("https://github.com/CPU-Code");

        User user1 = userRepository.save(user);

        System.out.println(user1);
    }

}
