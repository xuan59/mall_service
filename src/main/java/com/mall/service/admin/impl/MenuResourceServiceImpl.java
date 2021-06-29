package com.mall.service.admin.impl;

import com.alibaba.fastjson.JSON;
import com.mall.common.dao.ControlledDao;
import com.mall.common.utils.*;
import com.mall.entity.admin.MenuResource;
import com.mall.service.admin.MenuResourceService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

/**
 * 菜单资源服务实现类
 *
 * @author lx
 * @since 2021-06-23 16:29:52
 */
@Service
public class MenuResourceServiceImpl implements MenuResourceService {

    @Autowired
    ControlledDao dao;
    Logger logger = LoggerFactory.getLogger(MenuResourceServiceImpl.class);
    /**
     * 查询多条数据
     *
     * @param context 查询参数
     * @return 返回数据
     */
    @Override
    public Map<String, Object> selectList(Map<String, Object> context) {
        try {
            Map<String, Object> requestBody = ContextUtil.getRequestBody(context);
            Map<String, Object> requestHeader = ContextUtil.getRequestHeader(context);
            MenuResource menuResource = JSON.parseObject(JSON.toJSONString(requestBody), MenuResource.class);

            if(requestHeader.get("systemNo") == null){
                throw new Exception("系统编号不能为空");
            }
            menuResource.setSystemNo(StringUtil.getAsString(requestHeader.get("systemNo")));
            menuResource.setDeleteSign(CacheEnum.DELETE_SIGN_2.getCode());
            menuResource.setParentMenuNo("");
            List<MenuResource> parentList = dao.selectList("MenuResource.selectList", menuResource);
            List<Map<String, Object>> resList = new ArrayList<>();
            for (MenuResource resource : parentList) {
                menuResource.setParentMenuNo(resource.getMenuNo());
                List<MenuResource> list = dao.selectList("MenuResource.selectList", menuResource);
                List<Map<String, Object>> mapList2 = new ArrayList<>();
                for (MenuResource resource2 : list) {
                    Map map2 = JSON.parseObject(JSON.toJSONString(resource2), Map.class);
                    menuResource.setParentMenuNo(resource2.getMenuNo());
                    List<MenuResource> list2 = dao.selectList("MenuResource.selectList", menuResource);
                    map2.put("child", list2);
                    mapList2.add(map2);
                }
                Map map1 = JSON.parseObject(JSON.toJSONString(resource), Map.class);
                map1.put("child", mapList2);
                resList.add(map1);
            }
            Map<String, Object> map = new HashMap<>();
            map.clear();
            map.put("resList", resList);
            map.put("status", BaseConstant.SUCCESS);
            return map;
        }catch (Exception e){
            e.printStackTrace();
            logger.error(e.getMessage());
            return ContextUtil.setResponseError(BaseConstant.ERROR, e.getMessage());
        }
    }

    /**
     * 新增数据
     *
     * @param context 参数
     * @return 返回数据
     */
    @Override
    public Map<String, Object> insert(Map<String, Object> context) {
        try {
            Map<String, Object> requestBody = ContextUtil.getRequestBody(context);
            Map<String, Object> requestHeader = ContextUtil.getRequestHeader(context);
            MenuResource menuResource = JSON.parseObject(JSON.toJSONString(requestBody), MenuResource.class);
            menuResource.setCreateUserNo(StringUtil.getAsString(requestHeader.get("userNo")));
            if(menuResource.getMenuName() == null && !"".equals(menuResource.getMenuName())){
                throw new Exception("菜单名称不能为空");
            }
            if(menuResource.getMenuPath() == null && !"".equals(menuResource.getMenuPath())){
                throw new Exception("菜单路径不能为空");
            }
            AutoCreateNo autoCreateNo = new AutoCreateNo();
            String menuNo = autoCreateNo.getMenuNo(menuResource.getParentMenuNo(), menuResource.getSystemNo());
            if(menuNo == null){
                throw new Exception("创建菜单编号失败");
            }
            menuResource.setUuid(UUID.randomUUID().toString().replaceAll("-", ""));
            menuResource.setMenuNo(menuNo);
            menuResource.setCreateTimestamp(DateUtil.getTimestamp());
            menuResource.setDeleteSign(CacheEnum.DELETE_SIGN_2.getCode());
            dao.insert(menuResource);
            return ContextUtil.setResponseBody(null);
        }catch (Exception e){
            e.printStackTrace();
            logger.error(e.getMessage());
            return ContextUtil.setResponseError(BaseConstant.ERROR, e.getMessage());
        }
    }

    /**
     * 修改数据
     *
     * @param context 参数
     * @return 返回数据
     */
    @Override
    public Map<String, Object> update(Map<String, Object> context) {
        try {
            Map<String, Object> requestBody = ContextUtil.getRequestBody(context);
            Map<String, Object> requestHeader = ContextUtil.getRequestHeader(context);
            MenuResource menuResource = JSON.parseObject(JSON.toJSONString(requestBody), MenuResource.class);
            menuResource.setUpdateUserNo(StringUtil.getAsString(requestHeader.get("userNo")));
            menuResource.setUpdateTimestamp(DateUtil.getTimestamp());
            dao.update(menuResource);
            return ContextUtil.setResponseBody(null);
        }catch (Exception e){
            e.printStackTrace();
            logger.error(e.getMessage());
            return ContextUtil.setResponseError(BaseConstant.ERROR, e.getMessage());
        }
    }


}