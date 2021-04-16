package com.cpucode.mongodb;

import com.cpucode.mongodb.entity.User;
import com.cpucode.mongodb.repository.UserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Example;

import java.util.List;

/**
 * @author : cpucode
 * @date : 2021/4/16
 * @time : 17:42
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
@SpringBootTest
public class FindUserListRepTest {
    @Autowired
    private UserRepository userRepository;

    /**
     * 条件查询
     */
    @Test
    public void findUserList() {
        User user = new User();

        user.setName("cpu");
        user.setAge(20);

        Example<User> userExample = Example.of(user);
        List<User> userList = userRepository.findAll(userExample);

        System.out.println(userList);
    }

}
