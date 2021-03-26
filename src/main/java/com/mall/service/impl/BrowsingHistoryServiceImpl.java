package com.mall.service.impl;

import com.mall.entity.BrowsingHistory;
import com.mall.service.BrowsingHistoryService;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * 浏览记录(BrowsingHistory)表服务实现类
 *
 * @author lx
 * @since 2021-03-24 17:35:37
 */
@Service("browsingHistoryService")
public class BrowsingHistoryServiceImpl implements BrowsingHistoryService {

    @Override
    public Map<String, Object> selectList(String sqlId, BrowsingHistory browsingHistory, Integer pageNum, Integer pageSize) {
        return null;
    }

    @Override
    public BrowsingHistory insert(BrowsingHistory browsingHistory) {
        return null;
    }

    @Override
    public BrowsingHistory update(BrowsingHistory browsingHistory) {
        return null;
    }
}