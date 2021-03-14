package com.cpucode.test;

import com.cpucode.utils.JpaUtils;
import org.junit.Test;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

/**
 * @author : cpucode
 * @date : 2021/3/14
 * @time : 22:25
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class JpqlCountTest {
    @Test
    public void test1(){
        //获取实体管理对象
        EntityManager entityManager = JpaUtils.getEntityManager();
        //获取事务对象
        EntityTransaction transaction = entityManager.getTransaction();

        transaction.begin();

        // 查询全部客户
        // 1.创建query对象
        String jpql = "select count(custId) from Customer";
        Query query = entityManager.createQuery(jpql);

        // 2.查询并得到返回结果
        Object singleResult = query.getSingleResult();

        System.out.println(singleResult);

        transaction.commit();

        // 释放资源
        entityManager.close();
    }
}
