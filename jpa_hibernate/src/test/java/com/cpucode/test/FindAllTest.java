package com.cpucode.test;

import com.cpucode.dao.CustomerDao;
import com.cpucode.domain.Customer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * @author : cpucode
 * @date : 2021/3/15
 * @time : 16:13
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class FindAllTest {
    @Autowired
    private CustomerDao customerDao;

    /**
     * 查询所有
     */
    @Test
    public void test1(){
        List<Customer> all = customerDao.findAll();

        for (Customer customer1 : all) {
            System.out.println(customer1);
        }

    }
}
