package com.cpucode.test;

import com.cpucode.dao.CustomerDao;
import com.cpucode.dao.LinkManDao;
import com.cpucode.domain.Customer;
import com.cpucode.domain.LinkMan;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;


/**
 * @author : cpucode
 * @date : 2021/3/18
 * @time : 10:57
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class OneToManyTest {

    @Autowired
    private CustomerDao customerDao;

    @Autowired
    private LinkManDao linkManDao;


    /**
     * 保存一个客户,保存一个联系人
     * 效果:客户和联系人作为独立的数据保存到数据库中
     *      联系人的外键为空
     * 原因?
     *      实体类中没有配置关系
     */
    @Test
    @Transactional
    @Rollback(false)
    public void test1(){
        Customer customer = new Customer();

        customer.setCustName("cpu");

        LinkMan linkMan = new LinkMan();
        linkMan.setLkmName("cpucode");

        customer.getLinkmans().add(linkMan);

        customerDao.save(customer);
        linkManDao.save(linkMan);
    }
}
