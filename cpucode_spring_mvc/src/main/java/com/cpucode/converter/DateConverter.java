package com.cpucode.converter;

import org.springframework.core.convert.converter.Converter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author : cpucode
 * @date : 2021/2/22
 * @time : 17:11
 * @github : https://githfub.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class DateConverter implements Converter<String, Date> {
    public Date convert(String dateStr){
        //将日期字符串转换成日期对象 返回
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");

        Date date = null;

        try{
            date = format.parse(dateStr);
        }catch (ParseException e){
            e.printStackTrace();
        }

        return date;
    }
}
