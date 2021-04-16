package com.cpucode.mongodb;

import com.cpucode.mongodb.entity.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

/**
 * @author : cpucode
 * @date : 2021/4/16
 * @time : 16:15
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
@SpringBootTest
public class FindUsersPageTest {
    @Autowired
    private MongoTemplate mongoTemplate;

    /**
     * 分页查询
     */
    @Test
    public void findUsersPage() {
        String name = "est";
        int pageNo = 1;
        int pageSize = 10;

        Query query = new Query();
        String regex = String.format("%s%s%s", "^.*", name, ".*$");

        Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
        query.addCriteria(Criteria.where("name").regex(pattern));

        //总数
        int totalCount = (int) mongoTemplate.count(query, User.class);

        List<User> userList = mongoTemplate.find(query.skip((pageNo - 1) * pageSize).limit(pageSize), User.class);

        Map<String, Object> pageMap = new HashMap<>();

        pageMap.put("list", userList);
        pageMap.put("totalCount",totalCount);

        System.out.println(pageMap);
    }

}
