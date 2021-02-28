package com.cpucode.service.impl;

import com.cpucode.exception.MyException;
import com.cpucode.service.DemoService;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

/**
 * @author : cpucode
 * @date : 2021/2/28
 * @time : 21:57
 * @github : https://githfub.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class DemoServiceImpl implements DemoService {
    @Override
    public void show1() {
        System.out.println("抛出类型转换异常");

        Object str = "cpuCode";
        Integer num = (Integer) str;
    }

    @Override
    public void show2() {
        System.out.println("抛出除零异常");

        int i = 1/0;
    }

    @Override
    public void show3() throws FileNotFoundException {
        System.out.println("文件找不到异常");

        InputStream in = new FileInputStream("C:/xx/xxx.txt");
    }

    @Override
    public void show4() {
        System.out.println("空指针异常");

        String str = null;
        str.length();
    }

    @Override
    public void show5() throws MyException {
        System.out.println("自定义异常");

        throw new MyException();
    }
}
