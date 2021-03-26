package com.mall.common.dao;

import com.github.pagehelper.PageHelper;
import com.mall.common.utils.BaseConstant;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class ControlledDaoImpl implements ControlledDao{

    @Autowired
    private SqlSessionTemplate sqlSessionTemplate;

    @Override
    public <E> int insert(E entity) {
        try{
            String sqlId = entity.getClass().getName() + "." + "insert";
            sqlSessionTemplate.insert(sqlId, entity);
        }catch (Exception e){
            e.printStackTrace();
        }
        return 0;
    }

    @Override
    public <E> int insert(String sqlId, E entity) {
        try {
            sqlSessionTemplate.insert(sqlId, entity);
        }catch (Exception e){
            e.printStackTrace();
        }
        return 0;
    }

    @Override
    public <E> int update(E entity) {
        try{
            String sqlId = entity.getClass().getName() + "." + "update";
            sqlSessionTemplate.update(sqlId, entity);
        }catch (Exception e){
            e.printStackTrace();
        }
        return 0;
    }

    @Override
    public <E> int update(String sqlId, E entity) {
        try{
            sqlSessionTemplate.update(sqlId, entity);
        }catch (Exception e){
            e.printStackTrace();
        }
        return 0;
    }

    @Override
    public <E> List<E> selectList(String sqlId, Object param) {
        return sqlSessionTemplate.selectList(sqlId, param);
    }

    @Override
    public <E> List<E> selectList(String sqlId, Object param, Integer pageNum, Integer pageSize) {
        try{
            if(pageNum == null){
                pageNum = BaseConstant.pageNum;
            }
            if(pageSize == null){
                pageSize = BaseConstant.pageSize;
            }
            PageHelper.startPage(pageNum, pageSize);
            return sqlSessionTemplate.selectList(sqlId, param);
        }catch (Exception e){
            e.printStackTrace();
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
