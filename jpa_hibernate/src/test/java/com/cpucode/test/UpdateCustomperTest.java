package com.cpucode.test;

import com.cpucode.dao.CustomerDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author : cpucode
 * @date : 2021/3/15
 * @time : 20:53
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class UpdateCustomperTest {
    @Autowired
    private CustomerDao customerDao;

    /**
     * 测试jpq1的更新操作
     *   springDataJpa 中使用 jpql 完成 更新/珊除 操作
     *  需要手动添加事务的支持
     *  默认会执行结束之后,回滚事务
     */
    @Test
    @Transactional
    @Rollback(value = false)
    public void test1(){
        customerDao.updateCustomper(2L, "haha");
    }
}
