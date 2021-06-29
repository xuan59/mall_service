package com.mall.entity.goods;

import java.io.Serializable;

/**
 * 商品销售属性信息表 实体类
 *
 * @author lx
 * @date 2021-06-29 20:33:38
 **/
public class GoodsSpuSaleAttributeInfo implements Serializable {

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
     * 销售属性名称
     */
    private String saleAttributeName;


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

    public String getSaleAttributeName() {
        return saleAttributeName;
    }

    public void setSaleAttributeName(String saleAttributeName) {
        this.saleAttributeName = saleAttributeName;
    }

}