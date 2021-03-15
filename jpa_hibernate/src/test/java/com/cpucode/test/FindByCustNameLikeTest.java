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
 * @time : 21:42
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class FindByCustNameLikeTest {
    @Autowired
    private CustomerDao customerDao;

    @Test
    public void test1(){
        List<Customer> byCustNameLike = customerDao.findByCustNameLike("cpu%");

        for (Customer customer : byCustNameLike) {
            System.out.println(customer);
        }

    }
}
