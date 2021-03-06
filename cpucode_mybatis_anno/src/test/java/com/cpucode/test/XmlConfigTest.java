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
 * @date : 2021/3/5
 * @time : 15:18
 * @github : https://githfub.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class XmlConfigTest {

    private UserMapper userMapper;

    @Before
    public void before() throws IOException {
        InputStream resourceAsStream = Resources.getResourceAsStream("sqlMapConfig.xml");

        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);

        SqlSession sqlSession = sqlSessionFactory.openSession(true);

        userMapper = sqlSession.getMapper(UserMapper.class);
    }

    @Test
    public void FindAllTest(){
        List<User> users = userMapper.findAll();

        for (User user : users){
            System.out.println(user);
        }
    }

    @Test
    public void FindByIdTest(){
        int id = 2;
        User user = userMapper.findById(id);

        System.out.println(user);
    }



    @Test
    public void SaveTest(){
        User user = new User();

        user.setUsername("哈哈");
        user.setPassword("111");

        int save = userMapper.save(user);

        System.out.println(save);
    }

    @Test
    public void UpdateTest(){
        User user = new User();

        user.setId(7);
        user.setUsername("tmd");
        user.setPassword("9512");

        int update = userMapper.update(user);

        System.out.println(update);
    }

    @Test
    public void DeleteTest(){
        int id = 7;

        int delete = userMapper.delete(id);

        System.out.println(delete);
    }








}
