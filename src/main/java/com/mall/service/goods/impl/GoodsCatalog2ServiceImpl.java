package com.mall.service.goods.impl;

import com.alibaba.fastjson.JSON;
import com.mall.common.dao.ControlledDao;
import com.mall.common.utils.BaseConstant;
import com.mall.common.utils.ContextUtil;
import com.mall.entity.goods.GoodsCatalog2;
import com.mall.service.goods.GoodsCatalog2Service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * 二级分类服务实现类
 *
 * @author lx
 * @since 2021-06-23 08:50:11
 */
@Service
public class GoodsCatalog2ServiceImpl implements GoodsCatalog2Service {
    @Autowired
    ControlledDao dao;
    Logger logger = LoggerFactory.getLogger(GoodsCatalog2ServiceImpl.class);
    /**
     * 查询多条数据
     *
     * @param map 查询参数
     * @return 返回数据
     */
    @Override
    public Map<String, Object> selectList(Map<String, Object> map) {
        logger.info("商品分类2查询");
        try {
            GoodsCatalog2 goodsCatalog2 = JSON.parseObject(JSON.toJSONString(map), GoodsCatalog2.class);
            List<Object> selectList = new ArrayList<>();
            if(map.get("pageNum") == null || "".equals(map.get("pageNum"))){
                selectList = dao.selectList("GoodsCatalog2.selectList", goodsCatalog2);
            }else{
                Integer pageNum = (Integer) map.get("pageNum");
                Integer pageSize = (Integer) map.get("pageSize");
                selectList = dao.selectList("GoodsCatalog2.selectList", goodsCatalog2, pageNum, pageSize);
            }
            return ContextUtil.setResponseBody(selectList);
        }catch (Exception e){
            e.printStackTrace();
            logger.error(e.getMessage());
            return ContextUtil.setResponseError(BaseConstant.ERROR, e.getMessage());
        }
    }

    /**
     * 新增数据
     *
     * @param map 参数
     * @return 返回数据
     */
    @Override
    public Map<String, Object> insert(Map<String, Object> map) {
        return null;
    }

    /**
     * 修改数据
     *
     * @param map 参数
     * @return 返回数据
     */
    @Override
    public Map<String, Object> update(Map<String, Object> map) {
        return null;
    }


}