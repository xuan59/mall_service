package com.mall.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.mall.common.dao.ControlledDao;
import com.mall.entity.AdvertInfo;
import com.mall.service.AdvertInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 广告信息(AdvertInfo)表控制层
 *
 * @author makejava
 * @since 2020-12-03 17:32:40
 */
@CrossOrigin
@Controller
@RequestMapping("/advertInfo")
public class AdvertInfoController {
    /**
     * 服务对象
     */
    @Autowired
    private AdvertInfoService advertInfoService;

    /**
     * 通过参数查询数据
     *
     * @param advertInfo 查询参数
     * @return advertInfo数据
     */
    @ResponseBody
    @RequestMapping("/selectList")
    public Map<String, Object> selectList(@RequestBody AdvertInfo advertInfo, Integer pageNum, Integer pageSize) {
        return advertInfoService.selectList("AdvertInfo.selectList", advertInfo, pageNum, pageSize);
    }

}