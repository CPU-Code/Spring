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
 * @time : 22:41
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class JpqlFindPagedTest {
    @Test
    public void test1(){
        //获取实体管理对象
        EntityManager entityManager = JpaUtils.getEntityManager();
        //获取事务对象
        EntityTransaction transaction = entityManager.getTransaction();

        transaction.begin();
        //创建query对象
        String jpql = "from Customer";

        Query query  = entityManager.createQuery(jpql);
        //起始索引
        query.setFirstResult(0);
        //每页显示条数
        query.setMaxResults(1);

        //查询并得到返回结果
        List list = query.getResultList();

        for (Object o : list) {
            System.out.println(o);
        }

        transaction.commit();

        // 释放资源
        entityManager.close();
    }
}
