package com.mall.service;
import com.mall.entity.BrowsingHistory;

import java.util.Map;

/**
 * 浏览记录(BrowsingHistory)表服务接口
 *
 * @author lx
 * @since 2021-03-24 17:35:37
 */
public interface BrowsingHistoryService {

    /**
     * 查询数据
     * @param sqlId 查询sqlid
     * @param browsingHistory  查询参数
     * @param pageNum 当前页
     * @param pageSize 每页大小
     * @return 对象列表
     */
    Map<String, Object> selectList(String sqlId, BrowsingHistory browsingHistory, Integer pageNum, Integer pageSize);

    /**
     * 新增数据
     *
     * @param browsingHistory 实例对象
     * @return 实例对象
     */
    BrowsingHistory insert(BrowsingHistory browsingHistory);

    /**
     * 修改数据
     *
     * @param browsingHistory 实例对象
     * @return 实例对象
     */
    BrowsingHistory update(BrowsingHistory browsingHistory);

}