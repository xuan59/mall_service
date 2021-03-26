package com.mall.controller.goods;

import com.mall.service.goods.GoodsCatalog1Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * 一级分类(GoodsCatalog1)表控制层
 *
 * @author lx
 * @since 2021-03-24 17:45:37
 */
@RestController
@RequestMapping("goodsCatalog1")
public class GoodsCatalog1Controller {
    /**
     * 服务对象
     */
    @Autowired
    private GoodsCatalog1Service goodsCatalog1Service;

}