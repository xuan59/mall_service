package com.mall.service.impl.goods;

import com.mall.entity.goods.GoodsCatalog2;
import com.mall.service.goods.GoodsCatalog2Service;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * 二级分类(GoodsCatalog2)表服务实现类
 *
 * @author lx
 * @since 20201-03-24 17:15:23
 */
@Service("goodsCatalog2Service")
public class GoodsCatalog2ServiceImpl implements GoodsCatalog2Service {

    @Override
    public Map<String, Object> selectList(String sqlId, GoodsCatalog2 goodsCatalog2, Integer pageNum, Integer pageSize) {
        return null;
    }

    @Override
    public GoodsCatalog2 insert(GoodsCatalog2 goodsCatalog2) {
        return null;
    }

    @Override
    public GoodsCatalog2 update(GoodsCatalog2 goodsCatalog2) {
        return null;
    }
}