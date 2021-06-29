package com.mall.controller.admin;

import com.mall.service.admin.MenuResourceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * 菜单资源(MenuResource)表控制层
 *
 * @author lx
 * @since 2021-06-10 16:29:52
 */
@CrossOrigin
@RestController
@RequestMapping("/menuResource")
public class MenuResourceController {
    /**
     * 服务对象
     */
    @Autowired
    private MenuResourceService menuResourceService;

    /**
     * 通过参数查询数据
     *
     * @param context 接收的参数
     * @return 返回数据
     */
    @RequestMapping("/selectList")
    public Map<String, Object> selectList(@RequestBody Map<String, Object> context) {
        return menuResourceService.selectList(context);
    }

    /**
     * 添加数据
     *
     * @param context 接收的参数
     * @return 返回数据
     */
    @RequestMapping("/insert")
    public Map<String, Object> inset(@RequestBody Map<String, Object> context) {
        return menuResourceService.insert(context);
    }

    /**
     * 通过参数查询数据
     *
     * @param context 接收的参数
     * @return 返回数据
     */
    @RequestMapping("/update")
    public Map<String, Object> update(@RequestBody Map<String, Object> context) {
        return menuResourceService.update(context);
    }

}