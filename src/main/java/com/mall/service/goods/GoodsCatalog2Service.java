package com.mall.service.goods;

import com.mall.entity.goods.GoodsCatalog2;
import java.util.Map;

/**
 * 二级分类(GoodsCatalog2)表服务接口
 *
 * @author lx
 * @since 20201-03-24 17:15:23
 */
public interface GoodsCatalog2Service {

    /**
     * 查询数据
     * @param sqlId 查询sqlid
     * @param goodsCatalog2  查询参数
     * @param pageNum 当前页
     * @param pageSize 每页大小
     * @return 对象列表
     */
    Map<String, Object> selectList(String sqlId, GoodsCatalog2 goodsCatalog2, Integer pageNum, Integer pageSize);

    /**
     * 新增数据
     *
     * @param goodsCatalog2 实例对象
     * @return 实例对象
     */
    GoodsCatalog2 insert(GoodsCatalog2 goodsCatalog2);

    /**
     * 修改数据
     *
     * @param goodsCatalog2 实例对象
     * @return 实例对象
     */
    GoodsCatalog2 update(GoodsCatalog2 goodsCatalog2);

}