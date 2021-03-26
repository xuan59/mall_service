package com.mall.controller.goods;

import com.mall.service.goods.GoodsCatalog2Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * 二级分类(GoodsCatalog2)表控制层
 *
 * @author lx
 * @since 2021-03-24 17:35:37
 */
@RestController
@RequestMapping("goodsCatalog2")
public class GoodsCatalog2Controller {
    /**
     * 服务对象
     */
    @Resource
    private GoodsCatalog2Service goodsCatalog2Service;


}