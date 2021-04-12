package com.cpucode.mybatis_plus;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.cpucode.mybatis_plus.entity.User;
import com.cpucode.mybatis_plus.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

/**
 * @author : cpucode
 * @date : 2021/4/12
 * @time : 22:43
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
@SpringBootTest
public class SelectPageTest {
    @Autowired
    private UserMapper userMapper;

    /**
     * selectPage分页
     */
    @Test
    public void test1() {
        Page<User> page = new Page(1,3);
        Page<User> userPage = userMapper.selectPage(page, null);

        //返回对象得到分页所有数据

        //总页数
        long pages = userPage.getPages();

        //当前页
        long current = userPage.getCurrent();
        //查询数据集合
        List<User> records = userPage.getRecords();
        //总记录数
        long total = userPage.getTotal();
        //下一页
        boolean hasNext = userPage.hasNext();
        //上一页
        boolean hasPrevious = userPage.hasPrevious();

        System.out.println("pages : " + pages);
        System.out.println("current : " + current);
        System.out.println("records : " + records);
        System.out.println("total : " + total);
        System.out.println("hasNext : " + hasNext);
        System.out.println("hasPrevious : " + hasPrevious);
    }



}
