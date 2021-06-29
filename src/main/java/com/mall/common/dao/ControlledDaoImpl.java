package com.mall.common.dao;

import com.github.pagehelper.PageHelper;
import com.mall.common.utils.BaseConstant;
import org.mybatis.spring.SqlSessionTemplate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
/**
 * 数据库公共调用接口
 * @author lx
 * @date 2021-06-02 20:28
 * */

@Service
public class ControlledDaoImpl implements ControlledDao{

    @Autowired
    private SqlSessionTemplate sqlSessionTemplate;
    Logger logger = LoggerFactory.getLogger(ControlledDao.class);

    @Override
    public <E> int insert(E entity) {
        try{
            String name = entity.getClass().getName();
            String[] split = name.split("\\.");
            String sqlId = split[split.length - 1] + "." + "insert";
            sqlSessionTemplate.insert(sqlId, entity);
        }catch (Exception e){
            e.printStackTrace();
            logger.error(e.getMessage());
        }
        return 0;
    }

    @Override
    public <E> int insert(String sqlId, E entity) {
        try {
            sqlSessionTemplate.insert(sqlId, entity);
        }catch (Exception e){
            e.printStackTrace();
            logger.error(e.getMessage());
        }
        return 0;
    }

    @Override
    public <E> int update(E entity) {
        try{
            String name = entity.getClass().getName();
            String[] split = name.split("\\.");
            String sqlId = split[split.length - 1] + "." + "update";
            sqlSessionTemplate.update(sqlId, entity);
        }catch (Exception e){
            e.printStackTrace();
            logger.error(e.getMessage());
        }
        return 0;
    }

    @Override
    public <E> int update(String sqlId, E entity) {
        try{
            sqlSessionTemplate.update(sqlId, entity);
        }catch (Exception e){
            e.printStackTrace();
            logger.error(e.getMessage());
        }
        return 0;
    }

    @Override
    public <E> List<E> selectList(String sqlId, E entity) {
        try {
            return sqlSessionTemplate.selectList(sqlId, entity);
        }catch (Exception e){
            e.printStackTrace();
            logger.error(e.getMessage());
        }
        return null;
    }

    @Override
    public <E> List<E> selectList(String sqlId, E entity, Integer pageNum, Integer pageSize) {
        try{
            if(pageNum == null){
                pageNum = BaseConstant.PAGENUM;
            }
            if(pageSize == null){
                pageSize = BaseConstant.PAGESIZE;
            }
            PageHelper.startPage(pageNum, pageSize);
            return sqlSessionTemplate.selectList(sqlId, entity);
        }catch (Exception e){
            e.printStackTrace();
            logger.error(e.getMessage());
        }
        return null;
    }

    @Override
    public <E> int insertBatch(String sqlId, List<E> list) {
        return 0;
    }


    @Override
    public <E> int updateBatch(String sqlId, List<E> list) {
        return 0;
    }
}
