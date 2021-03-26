package com.mall.service.impl;

import com.github.pagehelper.PageInfo;
import com.mall.common.dao.ControlledDao;
import com.mall.entity.AdvertInfo;
import com.mall.service.AdvertInfoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 广告信息(AdvertInfo)表服务实现类
 *
 * @author lx
 * @since 2021-03-24 17:32:37
 */
@Service("advertInfoService")
public class AdvertInfoServiceImpl implements AdvertInfoService {

    @Autowired
    ControlledDao controlledDao;
    Logger logger = LoggerFactory.getLogger(AdvertInfoService.class);

    @Override
    public Map<String, Object> selectList(String sqlId, AdvertInfo advertInfo, Integer pageNum, Integer pageSize) {
        try {
            List<AdvertInfo> selectList = controlledDao.selectList(sqlId, advertInfo, pageNum, pageSize);
            PageInfo<AdvertInfo> pageInfo = new PageInfo<AdvertInfo>(selectList);
            Map<String, Object> map = new HashMap<>();
            Map<String, Object> page = new HashMap<>();
            page.put("pageNum", pageInfo.getPageNum());
            page.put("pageSize", pageInfo.getPageSize());
            page.put("total", pageInfo.getTotal());
            map.put("retList", selectList);
            map.put("pageInfo", page);
            return map;
        }catch (Exception e){
            e.printStackTrace();
            logger.error(e.getMessage());
        }
        return null;
    }

    @Override
    public AdvertInfo insert(AdvertInfo advertInfo) {
        return null;
    }

    @Override
    public AdvertInfo update(AdvertInfo advertInfo) {
        return null;
    }
}