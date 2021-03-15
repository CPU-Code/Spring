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
 * @time : 16:07
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class DeleteTest {
    @Autowired
    private CustomerDao customerDao;

    /**
     * 根据id删除：调用delete(id)方法
     */
    @Test
    public void test1(){
        customerDao.delete(3L);
    }
}
