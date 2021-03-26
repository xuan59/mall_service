package com.mall.controller;

import com.mall.entity.BrowsingHistory;
import com.mall.service.BrowsingHistoryService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * 浏览记录(BrowsingHistory)表控制层
 *
 * @author makejava
 * @since 2020-12-03 17:44:55
 */
@RestController
@RequestMapping("browsingHistory")
public class BrowsingHistoryController {
    /**
     * 服务对象
     */
    @Resource
    private BrowsingHistoryService browsingHistoryService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public BrowsingHistory selectOne(Integer id) {
        return this.browsingHistoryService.queryById(id);
    }

}