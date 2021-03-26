package com.mall.service.goods;

import com.mall.entity.goods.GoodsCatalog3;

import java.util.Map;

/**
 * 三级分类(GoodsCatalog3)表服务接口
 *
 * @author lx
 * @since 2021-03-24 17:36:58
 */
public interface GoodsCatalog3Service {

    /**
     * 查询数据
     * @param sqlId 查询sqlid
     * @param goodsCatalog3  查询参数
     * @param pageNum 当前页
     * @param pageSize 每页大小
     * @return 对象列表
     */
    Map<String, Object> selectList(String sqlId, GoodsCatalog3 goodsCatalog3, Integer pageNum, Integer pageSize);


    /**
     * 新增数据
     *
     * @param goodsCatalog3 实例对象
     * @return 实例对象
     */
    GoodsCatalog3 insert(GoodsCatalog3 goodsCatalog3);

    /**
     * 修改数据
     *
     * @param goodsCatalog3 实例对象
     * @return 实例对象
     */
    GoodsCatalog3 update(GoodsCatalog3 goodsCatalog3);

}