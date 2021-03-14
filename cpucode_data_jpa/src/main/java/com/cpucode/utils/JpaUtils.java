package com.cpucode.utils;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * 解决实体管理器工厂的浪费资源和耗时问题
 *      通过静态代码块的形式,当程序第一次访问此工具类时,创建一个公共的实体管理器工厂对象
 * 第一次访问 getEntityManager 方法:经过静态代码块创建一个 factory 对象,再调用方法创建个 EntityManager 对象
 * 第二次方法 getEntityManager方法:直接通过一个已经创建好的 factory 对象,创建 EntityManager 对象
 *
 * @author : cpucode
 * @date : 2021/3/14
 * @time : 20:55
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class JpaUtils {
    private static EntityManagerFactory factory;

    static{
        //1.加载配置文件,创建entityManagerFactory
        factory = Persistence.createEntityManagerFactory("myJpa");
    }

    /**
     * 获取EntityManager对象
     * @return
     */
    public static EntityManager getEntityManager(){
        return factory.createEntityManager();
    }
}
