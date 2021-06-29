package com.mall.controller.promote;

import com.mall.service.promote.AdvertInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * 广告信息(AdvertInfo)表控制层
 *
 * @author lx
 * @since 2021-06-24 19:59:41
 */
@RestController
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
     * @param map 接收的参数
     * @return 返回数据
     */
    @RequestMapping("/selectList")
    public Map<String, Object> selectList(@RequestBody Map<String, Object> map) {
        return advertInfoService.selectList(map);
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