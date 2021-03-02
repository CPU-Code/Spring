package com.cpucode.test;

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
 * @date : 2021/3/2
 * @time : 12:36
 * @github : https://githfub.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class MyBatisTest {

    /**
     * 查询操作
     * */
    @Test
    public void test1() throws IOException {
        //获得核心配置文件
        InputStream resourceAsStream = Resources.getResourceAsStream("sqlMapConfig.xml");

        //获得session工厂对象
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);

        //获得session回话对象
        SqlSession sqlSession = sqlSessionFactory.openSession();

        //执行操作
        List<User> userList = sqlSession.selectList("userMapper.finAll");

        //打印数据
        System.out.println(userList);

        //释放资源
        sqlSession.close();
    }

    /**
     * 插入操作
     * */
    @Test
    public void test2() throws IOException {
        //模拟user对象
        User user = new User();
        user.setUsername("code");
        user.setPassword("1111");

        //获得核心配置文件
        InputStream resourceAsStream= Resources.getResourceAsStream("sqlMapConfig.xml");

        //获得session工厂对象
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);

        //获得session回话对象
        SqlSession sqlSession = sqlSessionFactory.openSession();

        //执行操作
        int row = sqlSession.insert("userMapper.add", user);

        System.out.println(row);

        //mybatis执行更新操作  提交事务
        sqlSession.commit();

        //释放资源
        sqlSession.close();
    }

    /**
     * 修改操作
     * */
    @Test
    public void test3() throws IOException {
        //模拟user对象
        User user = new User();
        user.setId(3);
        user.setUsername("haha");
        user.setPassword("5555");

        //获得核心配置文件
        InputStream  resourceAsStream = Resources.getResourceAsStream("sqlMapConfig.xml");
        //获得session工厂对象
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);
        //获得session回话对象
        SqlSession sqlSession =  sqlSessionFactory.openSession();

        //执行操作
        int row = sqlSession.update("userMapper.update", user);

        System.out.println(row);

        //mybatis执行更新操作  提交事务
        sqlSession.commit();
        //释放资源
        sqlSession.close();
    }

    /**
     * 删除操作
     */
    @Test
    public void test4() throws IOException {
        //获得核心配置文件
        InputStream resourceAsStream = Resources.getResourceAsStream("SqlMapConfig.xml");
        //获得session工厂对象
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);
        //获得session回话对象
        SqlSession sqlSession = sqlSessionFactory.openSession();

        //执行操作
        int row = sqlSession.delete("userMapper.delete", 3);

        System.out.println(row);
        //mybatis执行更新操作  提交事务
        sqlSession.commit();
        //释放资源
        sqlSession.close();
    }
}
