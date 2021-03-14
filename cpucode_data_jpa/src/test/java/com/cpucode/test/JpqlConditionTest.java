package com.cpucode.test;

import com.cpucode.utils.JpaUtils;
import org.junit.Test;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;
import java.util.List;

/**
 * @author : cpucode
 * @date : 2021/3/14
 * @time : 22:49
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class JpqlConditionTest {
    @Test
    public void test1(){
        //获取实体管理对象
        EntityManager entityManager = JpaUtils.getEntityManager();
        //获取事务对象
        EntityTransaction transaction = entityManager.getTransaction();

        transaction.begin();

        //创建query对象
        String jpql = "from Customer where custName like ?";
        Query query = entityManager.createQuery(jpql);

        //对占位符赋值，从1开始
        query.setParameter(1, "cpu%");

        //查询并得到返回结果
        // 查询并得到返回结果
        List resultList = query.getResultList();

        for (Object o : resultList) {
            System.out.println(o);
        }
        transaction.commit();
        // 释放资源
        entityManager.close();

    }
}
