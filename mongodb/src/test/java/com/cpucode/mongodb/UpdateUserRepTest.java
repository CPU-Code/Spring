package com.cpucode.mongodb;

import com.cpucode.mongodb.entity.User;
import com.cpucode.mongodb.repository.UserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author : cpucode
 * @date : 2021/4/16
 * @time : 17:58
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
@SpringBootTest
public class UpdateUserRepTest {
    @Autowired
    private UserRepository userRepository;

    /**
     * 修改
     */
    @Test
    public void updateUser() {
        User user = userRepository.findById("60795a708c24143d62213775").get();

        user.setName("苍老师");
        user.setAge(25);
        user.setEmail("9999999@qq.com");

        User save = userRepository.save(user);

        System.out.println(save);
    }

}
