package com.cpucode.mongodb;

import com.cpucode.mongodb.entity.User;
import com.cpucode.mongodb.repository.UserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;

import java.util.List;

/**
 * @author : cpucode
 * @date : 2021/4/16
 * @time : 17:44
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
@SpringBootTest
public class FindUsersLikeNameRepTest {
    @Autowired
    private UserRepository userRepository;

    /**
     * 模糊查询
     */
    @Test
    public void findUsersLikeName() {
        //创建匹配器，即如何使用查询条件
        ExampleMatcher matcher = ExampleMatcher.matching()      //构建对象
                .withStringMatcher(ExampleMatcher.StringMatcher.CONTAINING) //改变默认字符串匹配方式：模糊查询
                .withIgnoreCase(true); //改变默认大小写忽略方式：忽略大小写

        User user = new User();
        user.setName("c");

        Example<User> userExample = Example.of(user, matcher);
        List<User> userList = userRepository.findAll(userExample);

        System.out.println(userList);
    }

}
