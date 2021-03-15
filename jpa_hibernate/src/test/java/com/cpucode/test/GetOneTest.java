package com.cpucode.test;

import com.cpucode.dao.CustomerDao;
import com.cpucode.domain.Customer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author : cpucode
 * @date : 2021/3/15
 * @time : 16:50
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class GetOneTest {
    @Autowired
    private CustomerDao customerDao;

    /**
     * 根据id从数据库查询
     *      @Transactional : 保证getOne正常运行
     * findOne:
     *      em.find() :立即加载
     * getOne:
     *      em.getReference :延迟加载
     */
    @Test
    @Transactional
    public void test1(){
        Customer one = customerDao.getOne(2L);

        System.out.println(one);
    }
}
