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
import java.util.Date;

/**
 * @author : cpucode
 * @date : 2021/3/4
 * @time : 14:08
 * @github : https://githfub.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class SaveTest {
    @Test
    public void test1() throws IOException {
        InputStream resourceAsStream = Resources.getResourceAsStream("sqlMapConfig.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();

        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        //创建user
        User user = new User();
        user.setUsername("哈哈");
        user.setPassword("111");
        user.setBirthday(new Date());

        //执行保存造作
        int row = mapper.save(user);

        sqlSession.commit();
        sqlSession.close();

        System.out.println(row);
    }
}
