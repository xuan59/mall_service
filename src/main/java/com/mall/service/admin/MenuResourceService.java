package com.mall.service.admin;

import java.util.Map;

/**
 * 菜单资源服务接口
 *
 * @author lx
 * @since 2021-06-23 16:29:52
 */
public interface MenuResourceService {

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