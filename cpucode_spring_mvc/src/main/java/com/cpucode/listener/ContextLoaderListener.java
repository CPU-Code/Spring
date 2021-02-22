package com.cpucode.listener;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * @author : cpucode
 * @date : 2021/2/21
 * @time : 23:17
 * @github : https://githfub.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class ContextLoaderListener implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        ServletContext servletContext = sce.getServletContext();
        String contextConfigLocation = servletContext.getInitParameter("contextConfigLocation");

        //读取web.xml中的全局参数
        ClassPathXmlApplicationContext app = new ClassPathXmlApplicationContext(contextConfigLocation);

        //将Spring的应用上下文对象存储到ServletContext域中
        servletContext.setAttribute("app", app);

        System.out.println("spring容器创建完毕....");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {

    }
}
