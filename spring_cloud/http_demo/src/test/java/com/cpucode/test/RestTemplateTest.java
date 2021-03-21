package com.cpucode.test;

import com.cpucode.pojo.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.RestTemplate;

/**
 * @author : cpucode
 * @date : 2021/3/21
 * @time : 13:43
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class RestTemplateTest {

        @Autowired
        private RestTemplate restTemplate;

        @Test
        public void test(){
            String url="http://localhost/user/8";

            //restTemplate可以对json格式字符串进行反序列化
            User user= restTemplate.getForObject(url, User.class);

            System.out.println(user);
        }
}
