package com.mall.common.utils;

/**
 * @author lx
 * @date 2021-06-18 13:14
 */
public class StringUtil {
    public static String getAsString(Object key){
        if(key == null){
            return null;
        }
        return key.toString();
    }
}
