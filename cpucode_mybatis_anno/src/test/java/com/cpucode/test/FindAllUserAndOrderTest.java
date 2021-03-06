package com.cpucode.test;

import com.cpucode.domain.User;
import com.cpucode.mapper.UserMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * @author : cpucode
 * @date : 2021/3/6
 * @time : 15:22
 * @github : https://githfub.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class FindAllUserAndOrderTest {

    private UserMapper mapper;

    @Before
    public void before() throws IOException {
        InputStream resourceAsStream = Resources.getResourceAsStream("sqlMapConfig.xml");

        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);

        SqlSession sqlSession = sqlSessionFactory.openSession(true);

        mapper = sqlSession.getMapper(UserMapper.class);
    }

    @Test
    public void test1(){
        List<User> allUserAndOrder = mapper.findAllUserAndOrder();

        for (User user : allUserAndOrder){
            System.out.println(user);
        }

    }
}
