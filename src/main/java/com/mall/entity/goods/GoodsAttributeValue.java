package com.mall.entity.goods;

import java.io.Serializable;

/**
 * spu筛选属性值 实体类
 *
 * @author lx
 * @date 2021-06-29 20:27:55
 **/
public class GoodsAttributeValue implements Serializable {

    /**
     * spu属性值id
     */
    private Integer id;
    /**
     * spu属性值名称
     */
    private String valueName;
    /**
     * spu属性id
     */
    private Long attributeId;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getValueName() {
        return valueName;
    }

    public void setValueName(String valueName) {
        this.valueName = valueName;
    }

    public Long getAttributeId() {
        return attributeId;
    }

    public void setAttributeId(Long attributeId) {
        this.attributeId = attributeId;
    }

}