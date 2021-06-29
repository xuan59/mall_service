package com.mall.common.utils;

import com.alibaba.fastjson.JSON;
import com.github.pagehelper.PageInfo;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 公共返回数据封装
 * @author lixuan
 * @date 2021-06-02 19:27
 */
public class ContextUtil {

    public static  Map<String , Object> getRequestBody(Map<String, Object> context){
        Object requestBody = context.get("RequestBody");
        if(requestBody == null){
            return new HashMap<>();
        }
        return JSON.parseObject(JSON.toJSONString(requestBody), Map.class);
    }

    public static  Map<String , Object> getRequestHeader(Map<String, Object> context){
        Object requestHeader = context.get("RequestHeader");
        if(requestHeader == null){
            return new HashMap<>();
        }
        return JSON.parseObject(JSON.toJSONString(requestHeader), Map.class);
    }

    public static  Map<String , Object> setResponseBody(List<Object> list){
        Map<String, Object> map = new HashMap<>();
        if(list != null) {
            PageInfo<Object> pageInfo = new PageInfo<Object>(list);
            Map<String, Object> page = new HashMap<>();
            page.put("pageNum", pageInfo.getPageNum());
            page.put("pageSize", pageInfo.getPageSize());
            page.put("total", pageInfo.getTotal());
            map.put("retList", list);
            map.put("pageInfo", page);
        }
        map.put("status", BaseConstant.SUCCESS);
        return map;
    }

    public static  Map<String , Object> setResponseError(String code, String message){
        Map<String, Object> map = new HashMap<>();
        map.put("status", code);
        map.put("resMsg", message);
        return map;
    }
}
