package com.mall.service.impl.goods;
import com.mall.entity.goods.GoodsCatalog3;
import com.mall.service.goods.GoodsCatalog3Service;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * 三级分类(GoodsCatalog3)表服务实现类
 *
 * @author lx
 * @since 2021-03-24 17:36:58
 */
@Service("goodsCatalog3Service")
public class GoodsCatalog3ServiceImpl implements GoodsCatalog3Service {

    @Override
    public Map<String, Object> selectList(String sqlId, GoodsCatalog3 goodsCatalog3, Integer pageNum, Integer pageSize) {
        return null;
    }

    @Override
    public GoodsCatalog3 insert(GoodsCatalog3 goodsCatalog3) {
        return null;
    }

    @Override
    public GoodsCatalog3 update(GoodsCatalog3 goodsCatalog3) {
        return null;
    }
}