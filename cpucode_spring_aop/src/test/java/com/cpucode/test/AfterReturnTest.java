package com.cpucode.test;

import com.cpucode.aop.TargetInterface;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author : cpucode
 * @date : 2021/2/18
 * @time : 18:55
 * @github : https://githfub.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:afterReturning.xml")
public class AfterReturnTest {
    @Autowired
    private TargetInterface target;

    @Test
    public void test1(){
        target.save();
    }
}
