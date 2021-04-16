package com.cpucode.mongodb;

import com.cpucode.mongodb.entity.User;
import com.cpucode.mongodb.repository.UserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author : cpucode
 * @date : 2021/4/16
 * @time : 17:40
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
@SpringBootTest
public class GetByIdPepTest {
    @Autowired
    private UserRepository userRepository;

    /**
     * id查询
     */
    @Test
    public void getById() {
        User user = userRepository.findById("60795a708c24143d62213775").get();

        System.out.println(user);
    }

}
