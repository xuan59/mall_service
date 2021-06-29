package com.mall.controller.goods;

import com.mall.service.goods.GoodsCatalog3Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * 三级分类(GoodsCatalog3)表控制层
 *
 * @author lx
 * @since 2021-06-23 08:50:58
 */
@CrossOrigin
@RestController
@RequestMapping("/goodsCatalog3")
public class GoodsCatalog3Controller {
    /**
     * 服务对象
     */
    @Autowired
    private GoodsCatalog3Service goodsCatalog3Service;

    /**
     * 通过参数查询数据
     *
     * @param map 接收的参数
     * @return 返回数据
     */
    @RequestMapping("/selectList")
    public Map<String, Object> selectList(@RequestBody Map<String, Object> map) {
        return goodsCatalog3Service.selectList(map);
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