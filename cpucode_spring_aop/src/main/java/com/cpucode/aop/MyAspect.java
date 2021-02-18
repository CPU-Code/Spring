package com.cpucode.aop;

import org.aspectj.lang.ProceedingJoinPoint;

/**
 * @author : cpucode
 * @date : 2021/2/18
 * @time : 10:51
 * @github : https://githfub.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class MyAspect {
    public void before(){
        System.out.println("前置增强");
    }

    public void afterReturning(){
        System.out.println("后置增强");
    }

    /**
     * 正在执行的连接点===切点
     * @param pjp
     * @return
     * @throws Throwable
     */
    public Object around(ProceedingJoinPoint pjp) throws Throwable{
        System.out.println("环绕前增强");

        //切点方法
        Object procend = pjp.proceed();

        System.out.println("环绕后增强");

        return procend;
    }

    public void afterThrowing(){
        System.out.println("异常抛出增强");
    }

    public void after(){
        System.out.println("最终增强");
    }
}
