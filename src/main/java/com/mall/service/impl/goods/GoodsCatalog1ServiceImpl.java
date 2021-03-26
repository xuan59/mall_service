package com.mall.service.impl.goods;

import com.mall.entity.goods.GoodsCatalog1;
import com.mall.service.goods.GoodsCatalog1Service;
import org.springframework.stereotype.Service;
import java.util.Map;

/**
 * 一级分类(GoodsCatalog2)表服务实现类
 *
 * @author lx
 * @since 20201-03-24 17:15:23
 */
@Service
public class GoodsCatalog1ServiceImpl implements GoodsCatalog1Service {

    @Override
    public Map<String, Object> selectList(String sqlId, GoodsCatalog1 goodsCatalog1, Integer pageNum, Integer pageSize) {
        return null;
    }

    @Override
    public GoodsCatalog1 insert(GoodsCatalog1 goodsCatalog1) {
        return null;
    }

    @Override
    public GoodsCatalog1 update(GoodsCatalog1 goodsCatalog1) {
        return null;
    }
}
