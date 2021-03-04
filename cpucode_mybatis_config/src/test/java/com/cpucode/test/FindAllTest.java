package com.cpucode.test;

import com.cpucode.domain.User;
import com.cpucode.mapper.UserMapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
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
 * @date : 2021/3/4
 * @time : 14:33
 * @github : https://githfub.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class FindAllTest {
    @Test
    public void test1() throws IOException {
        InputStream resourceAsStream = Resources.getResourceAsStream("sqlMapConfig.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);

        SqlSession sqlSession = sqlSessionFactory.openSession();

        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        //设置分页相关参数   当前页+每页显示的条数
        PageHelper.startPage(2, 2);

        List<User> userall = mapper.findAll();

        for(User user : userall){
            System.out.println(user);
        }

        //获得与分页相关参数
        PageInfo<User> userPageInfo = new PageInfo<User>(userall);

        System.out.println("当前页：" + userPageInfo.getPageNum());
        System.out.println("每页显示条数：" + userPageInfo.getPageSize());
        System.out.println("总条数：" + userPageInfo.getTotal());
        System.out.println("总页数：" + userPageInfo.getPages());
        System.out.println("上一页：" + userPageInfo.getPrePage());
        System.out.println("下一页：" + userPageInfo.getNextPage());
        System.out.println("是否是第一个：" + userPageInfo.isIsFirstPage());
        System.out.println("是否是最后一个：" + userPageInfo.isIsLastPage());

        sqlSession.close();

    }

}
