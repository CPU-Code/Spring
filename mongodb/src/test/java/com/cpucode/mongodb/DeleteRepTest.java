package com.cpucode.mongodb;

import com.cpucode.mongodb.entity.User;
import com.cpucode.mongodb.repository.UserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

/**
 * @author : cpucode
 * @date : 2021/4/16
 * @time : 18:00
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
@SpringBootTest
public class DeleteRepTest {
    @Autowired
    private UserRepository userRepository;

    /**
     * 删除
     */
    @Test
    public void delete() {

        List<User> userList = userRepository.findAll();

        System.out.println(userList);

        userRepository.deleteById("60795a708c24143d62213775");

        userList = userRepository.findAll();

        System.out.println(userList);
    }

}
