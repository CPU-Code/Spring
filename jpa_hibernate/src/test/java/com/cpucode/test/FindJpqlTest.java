package com.cpucode.test;

import com.cpucode.dao.CustomerDao;
import com.cpucode.domain.Customer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


/**
 * @author : cpucode
 * @date : 2021/3/15
 * @time : 17:23
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class FindJpqlTest {
    @Autowired
    private CustomerDao customerDao;

    @Test
    public void test1(){
        Customer cpu = customerDao.findJpql("cpu");

        System.out.println(cpu);
    }
}
