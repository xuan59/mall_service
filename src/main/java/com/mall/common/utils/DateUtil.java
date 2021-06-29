package com.mall.common.utils;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author lx
 * @date 2021-06-11 14:33
 * 时间工具类
 */
public class DateUtil {

    /**
     *  获取当前时间
     * */
    public static Date getNowDate(){
        Date date = new Date();
        return date;
    }
    /**
     *  获取当前时间字符串
     * */
    public static String getNowDateString(Integer key){
        String dateType = "yy-MM-dd";
        switch (key){
            case 1: dateType = "yyyyMMdd";break;
            case 2: dateType = "yyyy-MM-dd"; break;
            case 3: dateType = "yyyy-MM-dd HH:mm:ss";break;
            default:break;
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(dateType);
        return simpleDateFormat.format(new Date());
    }


    /**
     *  获取当前时间戳
     * */
    public static Timestamp getTimestamp(){
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        return timestamp;
    }
}
