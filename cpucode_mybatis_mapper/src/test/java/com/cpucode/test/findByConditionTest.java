package com.cpucode.test;

import com.cpucode.domain.User;
import com.cpucode.mapper.UserMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * @author : cpucode
 * @date : 2021/3/3
 * @time : 15:08
 * @github : https://githfub.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class findByConditionTest {

    @Test
    public void test1() throws IOException {
        InputStream  resourceAsStream = Resources.getResourceAsStream("sqlMapConfig.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);

        SqlSession sqlSession = sqlSessionFactory.openSession();

        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        User condition = new User();

        condition.setId(2);
        //condition.setUsername("cpucode");
        condition.setPassword("12345");

        List<User> byCondition = mapper.findByCondition(condition);

        System.out.println(byCondition);

        sqlSession.close();
    }
}
