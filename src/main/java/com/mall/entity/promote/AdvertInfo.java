package com.mall.entity.promote;

import java.io.Serializable;
import java.util.Date;

/**
 * 广告信息 实体类
 *
 * @author lx
 * @date 2021-06-23 20:48:16
 **/
public class AdvertInfo implements Serializable {

    /**
     * uuid
     */
    private String uuid;
    /**
     * 广告类型
     */
    private String advertType;
    /**
     * 图片地址
     */
    private String imgUrl;
    /**
     * 生效状态
     */
    private String takeEffect;
    /**
     * 删除标志
     */
    private String deleteSign;
    /**
     * 创建时间
     */
    private Date createTimestamp;
    /**
     * 创建用户
     */
    private String createUserNo;
    /**
     * 更新时间
     */
    private Date updateTimestamp;
    /**
     * 更新用户
     */
    private String updateUserNo;


    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getAdvertType() {
        return advertType;
    }

    public void setAdvertType(String advertType) {
        this.advertType = advertType;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public String getTakeEffect() {
        return takeEffect;
    }

    public void setTakeEffect(String takeEffect) {
        this.takeEffect = takeEffect;
    }

    public String getDeleteSign() {
        return deleteSign;
    }

    public void setDeleteSign(String deleteSign) {
        this.deleteSign = deleteSign;
    }

    public Date getCreateTimestamp() {
        return createTimestamp;
    }

    public void setCreateTimestamp(Date createTimestamp) {
        this.createTimestamp = createTimestamp;
    }

    public String getCreateUserNo() {
        return createUserNo;
    }

    public void setCreateUserNo(String createUserNo) {
        this.createUserNo = createUserNo;
    }

    public Date getUpdateTimestamp() {
        return updateTimestamp;
    }

    public void setUpdateTimestamp(Date updateTimestamp) {
        this.updateTimestamp = updateTimestamp;
    }

    public String getUpdateUserNo() {
        return updateUserNo;
    }

    public void setUpdateUserNo(String updateUserNo) {
        this.updateUserNo = updateUserNo;
    }

}