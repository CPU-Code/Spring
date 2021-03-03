package com.cpucode.test;

import com.cpucode.dao.UserDao;
import com.cpucode.domain.User;
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
 * @time : 13:44
 * @github : https://githfub.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class ProxyDaoTest {
    @Test
    public void test1() throws IOException {
        InputStream resourceAsStream = Resources.getResourceAsStream("sqlMapConfig.xml");

        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);

        SqlSession sqlSession = sqlSessionFactory.openSession();

        //获得MyBatis框架生成的UserMapper接口的实现类
        UserDao mapper = sqlSession.getMapper(UserDao.class);

        List<User> all = mapper.findAll();

        System.out.println(all);

        User byId = mapper.findById(1);

        System.out.println(byId);
    }
}
