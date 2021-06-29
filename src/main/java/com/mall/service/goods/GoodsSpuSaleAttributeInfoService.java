package com.mall.service.goods;

import java.util.Map;

/**
 * 商品销售属性信息表服务接口
 *
 * @author lx
 * @since 2021-06-29 20:33:38
 */
public interface GoodsSpuSaleAttributeInfoService {

    /**
     * 查询数据
     *
     * @param context 参数
     * @return 返回数据
     */
    Map<String, Object> selectList(Map<String, Object> context);

    /**
     * 新增数据
     *
     * @param context 参数
     * @return 返回数据
     */
    Map<String, Object> insert(Map<String, Object> context);

    /**
     * 修改数据
     *
     * @param context 参数
     * @return 返回数据
     */
    Map<String, Object> update(Map<String, Object> context);


}