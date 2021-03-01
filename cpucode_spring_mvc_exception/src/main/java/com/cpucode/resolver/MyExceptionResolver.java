package com.cpucode.resolver;

import com.cpucode.exception.MyException;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author : cpucode
 * @date : 2021/2/28
 * @time : 23:23
 * @github : https://githfub.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class MyExceptionResolver implements HandlerExceptionResolver {

    /**
     * 参数Exception：异常对象
     * 返回值ModelAndView：跳转到错误视图信息
     * */
    @Override
    public ModelAndView resolveException(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e){
        ModelAndView modelAndView = new ModelAndView();

        if (e instanceof MyException){
            modelAndView.addObject("info", "自定义异常");
        } else if (e instanceof ClassCastException){
            modelAndView.addObject("info", "类转换异常");
        }

        modelAndView.setViewName("error");

        return modelAndView;
    }
}
