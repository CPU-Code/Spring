package com.cpucode.handler;

import org.apache.ibatis.type.BaseTypeHandler;
import org.apache.ibatis.type.JdbcType;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

/**
 * @author : cpucode
 * @date : 2021/3/4
 * @time : 14:09
 * @github : https://githfub.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class DateTypeHandler extends BaseTypeHandler<Date> {

    /**
     * 将java类型 转换成 数据库需要的类型
     * */
    @Override
    public void setNonNullParameter(PreparedStatement ps, int i, Date parameter, JdbcType jdbcType) throws SQLException {
        Long time = parameter.getTime();

        ps.setLong(i, time);
    }

    /**
     * 将数据库中类型 转换成java类型
     * String参数  要转换的字段名称
     * ResultSet 查询出的结果集
     * */
    @Override
    public Date getNullableResult(ResultSet rs, String columnName) throws SQLException {
        long aLong = rs.getLong(columnName);
        Date date = new Date(aLong);

        return date;
    }

    /**
     * 将数据库中类型 转换成java类型
     * */
    @Override
    public Date getNullableResult(ResultSet rs, int columnIndex) throws SQLException {
        long aLong = rs.getLong(columnIndex);
        Date date = new Date(aLong);

        return date;
    }

    /**
     * 将数据库中类型 转换成java类型
     * */
    @Override
    public Date getNullableResult(CallableStatement cs, int columnIndex) throws SQLException {
        long aLong = cs.getLong(columnIndex);
        Date date = new Date(aLong);

        return date;
    }
}
