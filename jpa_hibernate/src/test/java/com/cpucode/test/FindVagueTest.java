package com.cpucode.test;

import com.cpucode.dao.CustomerDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Arrays;
import java.util.List;

/**
 * @author : cpucode
 * @date : 2021/3/15
 * @time : 21:24
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class FindVagueTest {
    @Autowired
    private CustomerDao customerDao;

    @Test
    public void test1(){
        List<Object[]> vague = customerDao.findVague("cpu%");

        for (Object[] objects : vague) {
            System.out.println(Arrays.toString(objects));
        }
    }
}
