package com.mall.controller.goods;

import com.mall.service.goods.GoodsSpuSaleAttributeValueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * 商品销售属性值表(GoodsSpuSaleAttributeValue)表控制层
 *
 * @author lx
 * @since 2021-06-29 20:36:25
 */
@RestController
@RequestMapping("/goodsSpuSaleAttributeValue")
public class GoodsSpuSaleAttributeValueController {
    /**
     * 服务对象
     */
    @Autowired
    private GoodsSpuSaleAttributeValueService goodsSpuSaleAttributeValueService;

    /**
     * 通过参数查询数据
     *
     * @param context 接收的参数
     * @return 返回数据
     */
    @RequestMapping("/selectList")
    public Map<String, Object> selectList(@RequestBody Map<String, Object> context) {
        return null;
    }

    /**
     * 添加数据
     *
     * @param context 接收的参数
     * @return 返回数据
     */
    @RequestMapping("/insert")
    public Map<String, Object> insert(@RequestBody Map<String, Object> context) {
        return null;
    }

    /**
     * 通过参数查询数据
     *
     * @param context 接收的参数
     * @return 返回数据
     */
    @RequestMapping("/update")
    public Map<String, Object> update(@RequestBody Map<String, Object> context) {
        return null;
    }

}