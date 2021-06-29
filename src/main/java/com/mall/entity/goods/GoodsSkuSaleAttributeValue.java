package com.mall.entity.goods;

import java.io.Serializable;

/**
 * 商品sku销售属性信息值表 实体类
 *
 * @author lx
 * @date 2021-06-29 20:32:53
 **/
public class GoodsSkuSaleAttributeValue implements Serializable {

    /**
     * 主键，自增
     */
    private Long id;
    /**
     * sku id
     */
    private Long skuId;
    /**
     * sku id
     */
    private Long saleAttributeId;
    /**
     * 销售属性名称
     */
    private String saleAttributeName;
    /**
     * 销售属性值id
     */
    private Long saleAttributeValueId;
    /**
     * 销售属性值名称
     */
    private String saleAttributeValueName;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getSkuId() {
        return skuId;
    }

    public void setSkuId(Long skuId) {
        this.skuId = skuId;
    }

    public Long getSaleAttributeId() {
        return saleAttributeId;
    }

    public void setSaleAttributeId(Long saleAttributeId) {
        this.saleAttributeId = saleAttributeId;
    }

    public String getSaleAttributeName() {
        return saleAttributeName;
    }

    public void setSaleAttributeName(String saleAttributeName) {
        this.saleAttributeName = saleAttributeName;
    }

    public Long getSaleAttributeValueId() {
        return saleAttributeValueId;
    }

    public void setSaleAttributeValueId(Long saleAttributeValueId) {
        this.saleAttributeValueId = saleAttributeValueId;
    }

    public String getSaleAttributeValueName() {
        return saleAttributeValueName;
    }

    public void setSaleAttributeValueName(String saleAttributeValueName) {
        this.saleAttributeValueName = saleAttributeValueName;
    }

}