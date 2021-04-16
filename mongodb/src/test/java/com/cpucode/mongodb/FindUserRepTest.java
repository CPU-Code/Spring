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
 * @time : 17:38
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
@SpringBootTest
public class FindUserRepTest {
    @Autowired
    private UserRepository userRepository;

    /**
     * 查询所有
     */
    @Test
    public void findUser() {
        List<User> userList = userRepository.findAll();

        System.out.println(userList);
    }

}
