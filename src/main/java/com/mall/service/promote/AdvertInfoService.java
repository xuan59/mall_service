package com.mall.service.promote;

import java.util.Map;

/**
 * 广告信息服务接口
 *
 * @author lx
 * @since 2021-06-23 20:00:33
 */
public interface AdvertInfoService {

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