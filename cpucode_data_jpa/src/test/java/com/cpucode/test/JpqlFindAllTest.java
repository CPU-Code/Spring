package com.cpucode.test;

import com.cpucode.utils.JpaUtils;
import org.junit.Test;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;
import java.util.List;

/**
 * 查询所有客户
 *
 * @author : cpucode
 * @date : 2021/3/14
 * @time : 21:56
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class JpqlFindAllTest {
    @Test
    public void test1(){
        //获取实体管理对象
        EntityManager entityManager = JpaUtils.getEntityManager();
        //获取事务对象
        EntityTransaction transaction = entityManager.getTransaction();

        transaction.begin();

        String jpql = "from com.cpucode.domain.Customer";
        Query query = entityManager.createQuery(jpql);

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
