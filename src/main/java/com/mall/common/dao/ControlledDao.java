package com.mall.common.dao;

import java.util.List;

/**
 * @author lx
 * @date 2021-03-24 10:10
 * @Deprecated 公共操作数据库接口
 * */
public interface ControlledDao {

    <E> int insert(E entity);

    <E> int insert(String sqlId, E entity);

    <E> int update(E entity);

    <E> int update(String sqlId, E entity);

    <E> List<E> selectList(String sqlId, Object param);

    <E> List<E> selectList(String sqlId, Object param, Integer pageNum, Integer pageSize);

    <E> int insertBatch(String sqlId, List<E> list);

    <E> int updateBatch(String sqlId, List<E> list);
}

