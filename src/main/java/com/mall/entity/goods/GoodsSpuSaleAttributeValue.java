package com.mall.entity.goods;

import java.io.Serializable;

/**
 * 商品销售属性值表 实体类
 *
 * @author lx
 * @date 2021-06-29 20:36:24
 **/
public class GoodsSpuSaleAttributeValue implements Serializable {

    /**
     * id
     */
    private Long id;
    /**
     * spu id
     */
    private Long spuId;
    /**
     * 销售属性id
     */
    private Long saleAttributeId;
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

    public Long getSpuId() {
        return spuId;
    }

    public void setSpuId(Long spuId) {
        this.spuId = spuId;
    }

    public Long getSaleAttributeId() {
        return saleAttributeId;
    }

    public void setSaleAttributeId(Long saleAttributeId) {
        this.saleAttributeId = saleAttributeId;
    }

    public String getSaleAttributeValueName() {
        return saleAttributeValueName;
    }

    public void setSaleAttributeValueName(String saleAttributeValueName) {
        this.saleAttributeValueName = saleAttributeValueName;
    }

}