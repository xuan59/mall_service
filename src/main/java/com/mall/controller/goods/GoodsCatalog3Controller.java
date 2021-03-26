package com.mall.controller.goods;

import com.mall.entity.goods.GoodsCatalog3;
import com.mall.service.goods.GoodsCatalog3Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Map;

/**
 * 三级分类(GoodsCatalog3)表控制层
 *
 * @author lx
 * @since 2021-03-24 17:32:37
 */
@RestController
@RequestMapping("goodsCatalog3")
public class GoodsCatalog3Controller {
    /**
     * 服务对象
     */
    @Resource
    private GoodsCatalog3Service goodsCatalog3Service;

    /**
     * 通过主键查询单条数据
     *
     * @param goodsCatalog3
     * @return 单条数据
     */
    @GetMapping("selectList")
    public Map<String, Object> selectList(GoodsCatalog3 goodsCatalog3, Integer pageNum, Integer pageSize) {
        return this.goodsCatalog3Service.selectList("GoodsCatalog3.selectList", goodsCatalog3, pageNum, pageSize);
    }

}