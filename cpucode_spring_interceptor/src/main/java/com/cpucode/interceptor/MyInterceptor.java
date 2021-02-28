package com.cpucode.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author : cpucode
 * @date : 2021/2/22
 * @time : 20:15
 * @github : https://githfub.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class MyInterceptor implements HandlerInterceptor {

    /**
     * 在目标方法执行之前 执行
     */
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println("preHandle ... ");

        String param = request.getParameter("param");

        if ("yes".equals(param)){
            return true;
        }else {
            request.getRequestDispatcher("/jsp/error.jsp");

            //返回true代表放行  返回false代表不放行
            return false;
        }

    }

    /**
     * 在目标方法执行之后 视图对象返回之前执行
     * */
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        System.out.println("postHandle .. ");
    }

    /**
     * 在流程都执行完毕后 执行
     * */
    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        System.out.println("afterCompletion ... ");
    }
}
