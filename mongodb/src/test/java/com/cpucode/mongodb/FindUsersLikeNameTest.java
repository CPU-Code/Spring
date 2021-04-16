package com.cpucode.mongodb;

import com.cpucode.mongodb.entity.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;

import java.util.List;
import java.util.regex.Pattern;

/**
 * @author : cpucode
 * @date : 2021/4/16
 * @time : 16:11
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
@SpringBootTest
public class FindUsersLikeNameTest {
    @Autowired
    private MongoTemplate mongoTemplate;

    /**
     * 模糊查询
     */
    @Test
    public void findUsersLikeName() {
        String name = "est";
        String regex = String.format("%s%s%s", "^.*", name, ".*$");

        System.out.println(regex);

        Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
        Query query = new Query(Criteria.where("name").regex(pattern));

        List<User> userList = mongoTemplate.find(query, User.class);

        System.out.println(userList);
    }

}
