package com.mall.service;

import com.mall.entity.AdvertInfo;

import java.util.Map;

/**
 * 广告信息(AdvertInfo)表服务接口
 *
 * @author lx
 * @since 2021-03-24 17:32:37
 */
public interface AdvertInfoService {

    /**
     * 查询数据
     * @param sqlId 查询sqlid
     * @param advertInfo  查询参数
     * @param pageNum 当前页
     * @param pageSize 每页大小
     * @return 对象列表
     */
    Map<String, Object> selectList(String sqlId, AdvertInfo advertInfo, Integer pageNum, Integer pageSize);

    /**
     * 新增数据
     * @param advertInfo 实例对象
     * @return 实例对象
     */
    AdvertInfo insert(AdvertInfo advertInfo);

    /**
     * 修改数据
     *
     * @param advertInfo 实例对象
     * @return 实例对象
     */
    AdvertInfo update(AdvertInfo advertInfo);

}