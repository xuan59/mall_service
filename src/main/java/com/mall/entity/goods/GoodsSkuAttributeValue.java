package com.mall.entity.goods;

import java.io.Serializable;

/**
 * sku商品参数值表 实体类
 *
 * @author lx
 * @date 2021-06-29 20:32:17
 **/
public class GoodsSkuAttributeValue implements Serializable {

    /**
     * 主键，自增
     */
    private Long id;
    /**
     * 销售属性id
     */
    private Long attributeId;
    /**
     * 销售属性值id
     */
    private Long valueId;
    /**
     * sku id
     */
    private Long skuId;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getAttributeId() {
        return attributeId;
    }

    public void setAttributeId(Long attributeId) {
        this.attributeId = attributeId;
    }

    public Long getValueId() {
        return valueId;
    }

    public void setValueId(Long valueId) {
        this.valueId = valueId;
    }

    public Long getSkuId() {
        return skuId;
    }

    public void setSkuId(Long skuId) {
        this.skuId = skuId;
    }

}