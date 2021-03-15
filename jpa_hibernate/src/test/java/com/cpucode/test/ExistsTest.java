package com.cpucode.test;

import com.cpucode.dao.CustomerDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


/**
 * @author : cpucode
 * @date : 2021/3/15
 * @time : 16:45
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class ExistsTest {
    @Autowired
    private CustomerDao customerDao;

    /**
     * 测试 : 判断id为4的客户是否存在
     *  1.可以查询以下id为4的客户
     *      如果值为空,代表不存在,如果不为空,代表存在
     *  2.判断数据库中id为4的客户的数量
     *      如果数量为o,代表不存在,如果大于9,代表存在
     */
    @Test
    public void test1(){
        boolean exists = customerDao.exists(4L);

        System.out.println(exists);
    }
}
