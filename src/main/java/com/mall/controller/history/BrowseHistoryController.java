package com.mall.controller.history;

import com.mall.service.history.BrowseHistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * 浏览历史记录(BrowseHistory)表控制层
 *
 * @author lx
 * @since 2021-06-17 13:56:46
 */
@RestController
@RequestMapping("/browseHistory")
public class BrowseHistoryController {
    /**
     * 服务对象
     */
    @Autowired
    private BrowseHistoryService browseHistoryService;

    /**
     * 通过参数查询数据
     *
     * @param map 接收的参数
     * @return 返回数据
     */
    @RequestMapping("/selectList")
    public Map<String, Object> selectList(@RequestBody Map<String, Object> map) {
        return null;
    }

    /**
     * 添加数据
     *
     * @param map 接收的参数
     * @return 返回数据
     */
    @RequestMapping("/insert")
    public Map<String, Object> insert(@RequestBody Map<String, Object> map) {
        return null;
    }

    /**
     * 通过参数查询数据
     *
     * @param map 接收的参数
     * @return 返回数据
     */
    @RequestMapping("/update")
    public Map<String, Object> update(@RequestBody Map<String, Object> map) {
        return null;
    }

}