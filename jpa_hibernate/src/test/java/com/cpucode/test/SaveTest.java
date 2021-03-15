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
 * @time : 15:57
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class SaveTest {
    @Autowired
    private CustomerDao customerDao;

    /**
     * 保存客户：调用save(obj)方法
     */
    @Test
    public void test1(){
        Customer customer = new Customer();

        customer.setCustName("cpu");

        customerDao.save(customer);
    }
}
