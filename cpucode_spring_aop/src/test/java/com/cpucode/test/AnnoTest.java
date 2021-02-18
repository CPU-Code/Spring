package com.cpucode.test;

import com.cpucode.anno.TargetInterface;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author : cpucode
 * @date : 2021/2/18
 * @time : 20:23
 * @github : https://githfub.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext-anno.xml")
public class AnnoTest {
    @Autowired
    private TargetInterface target;

    @Test
    public void tesg1(){
        target.save();
        target.exce();
    }
}
