package com.mall.service.history.impl;

import com.mall.service.history.BrowseHistoryService;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * 浏览历史记录服务实现类
 *
 * @author lx
 * @since 2021-06-17 13:55:18
 */
@Service
public class BrowseHistoryServiceImpl implements BrowseHistoryService {

    /**
     * 查询多条数据
     *
     * @param map 查询参数
     * @return 返回数据
     */
    @Override
    public Map<String, Object> selectList(Map<String, Object> map) {
        return null;
    }

    /**
     * 新增数据
     *
     * @param map 参数
     * @return 返回数据
     */
    @Override
    public Map<String, Object> insert(Map<String, Object> map) {
        return null;
    }

    /**
     * 修改数据
     *
     * @param map 参数
     * @return 返回数据
     */
    @Override
    public Map<String, Object> update(Map<String, Object> map) {
        return null;
    }


}