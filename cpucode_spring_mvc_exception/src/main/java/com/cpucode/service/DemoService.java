package com.cpucode.service;

import com.cpucode.exception.MyException;

import java.io.FileNotFoundException;

/**
 * @author : cpucode
 * @date : 2021/2/28
 * @time : 21:56
 * @github : https://githfub.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public interface DemoService {
    void show1();
    void show2();
    void show3() throws FileNotFoundException;
    void show4();
    void show5() throws MyException;

}
