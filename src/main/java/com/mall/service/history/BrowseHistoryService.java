package com.mall.service.history;

import java.util.Map;

/**
 * 浏览历史记录服务接口
 *
 * @author lx
 * @since 2021-06-17 13:55:18
 */
public interface BrowseHistoryService {

    /**
     * 查询数据
     *
     * @param map 参数
     * @return 返回数据
     */
    Map<String, Object> selectList(Map<String, Object> map);

    /**
     * 新增数据
     *
     * @param map 参数
     * @return 返回数据
     */
    Map<String, Object> insert(Map<String, Object> map);

    /**
     * 修改数据
     *
     * @param map 参数
     * @return 返回数据
     */
    Map<String, Object> update(Map<String, Object> map);


}