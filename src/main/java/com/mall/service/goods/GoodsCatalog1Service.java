package com.mall.service.goods;

import java.util.Map;

/**
 * 一级分类服务接口
 *
 * @author lx
 * @since 2021-06-23 08:49:26
 */
public interface GoodsCatalog1Service {

    /**
     * 查询数据
     *
     * @param map 参数
     * @return 返回数据
     */
    Map<String, Object> selectList(Map<String, Object> map);

    /**
     * 新增数据
     *
     * @param map 参数
     * @return 返回数据
     */
    Map<String, Object> insert(Map<String, Object> map);

    /**
     * 修改数据
     *
     * @param map 参数
     * @return 返回数据
     */
    Map<String, Object> update(Map<String, Object> map);


}