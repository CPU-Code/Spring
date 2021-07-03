package com.cpucode.security.password.encoder;

import org.junit.jupiter.api.Test;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

/**
 * @author : cpucode
 * @date : 2021/7/2
 * @time : 17:19
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class PasswordEncoderTest {
    /**
     * 密码解析器
     */
    @Test
    public void passwordEncoderTest(){
        // 创建密码解析器
        BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
        // 对密码进行加密
        String cpuCode = bCryptPasswordEncoder.encode("cpuCode");
        // 打印加密之后的数据
        System.out.println("加密之后数据： \t" + cpuCode);

        //判断原字符加密后和加密之前是否匹配
        boolean result = bCryptPasswordEncoder.matches("cpuCode", cpuCode);

        // 打印比较结果
        System.out.println("比较结果： \t"+result);
    }
}
