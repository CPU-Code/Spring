package com.cpucode.test;

import com.cpucode.domain.Customer;
import com.cpucode.utils.JpaUtils;
import org.junit.Test;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

/**
 * @author : cpucode
 * @date : 2021/3/14
 * @time : 21:30
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class JpaUtilsRemoveTest {
    @Test
    public void test1(){
        // 获取实体管理对象
        EntityManager entityManager = JpaUtils.getEntityManager();
        // 获取事务对象
        EntityTransaction transaction = entityManager.getTransaction();
        // 开启事务
        transaction.begin();

        // 执行操作
        Customer customer = entityManager.find(Customer.class, 1L);
        entityManager.remove(customer);

        // 提交事务
        transaction.commit();

        // 释放资源
        entityManager.close();
    }
}
