package com.mall.service.goods;

import com.mall.entity.goods.GoodsCatalog1;
import java.util.Map;

/**
 * 一级分类(GoodsCatalog1)表服务接口
 *
 * @author lx
 * @since 20201-03-24 17:15:23
 */
public interface GoodsCatalog1Service {

    /**
     * 查询数据
     * @param sqlId 查询sqlid
     * @param goodsCatalog1  查询参数
     * @param pageNum 当前页
     * @param pageSize 每页大小
     * @return 对象列表
     */
    Map<String, Object> selectList(String sqlId, GoodsCatalog1 goodsCatalog1, Integer pageNum, Integer pageSize);

    /**
     * 新增数据
     *
     * @param goodsCatalog1 实例对象
     * @return 实例对象
     */
    GoodsCatalog1 insert(GoodsCatalog1 goodsCatalog1);

    /**
     * 修改数据
     *
     * @param goodsCatalog1 实例对象
     * @return 实例对象
     */
    GoodsCatalog1 update(GoodsCatalog1 goodsCatalog1);


}