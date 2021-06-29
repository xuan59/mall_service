package com.mall.entity.admin;

import java.io.Serializable;
import java.util.Date;

/**
 * 菜单资源 实体类
 *
 * @author lx
 * @date 2021-06-16 20:46:58
 **/
public class MenuResource implements Serializable {

    /**
     * uuid
     */
    private String uuid;
    /**
     * 菜单编号
     */
    private String menuNo;
    /**
     * 菜单名称
     */
    private String menuName;
    /**
     * 菜单路径
     */
    private String menuPath;
    /**
     * 系统编号
     */
    private String systemNo;
    /**
     * 菜单等级
     */
    private String menuLevel;
    /**
     * 父菜单
     */
    private String parentMenuNo;
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

    public String getMenuNo() {
        return menuNo;
    }

    public void setMenuNo(String menuNo) {
        this.menuNo = menuNo;
    }

    public String getMenuName() {
        return menuName;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }

    public String getMenuPath() {
        return menuPath;
    }

    public void setMenuPath(String menuPath) {
        this.menuPath = menuPath;
    }

    public String getSystemNo() {
        return systemNo;
    }

    public void setSystemNo(String systemNo) {
        this.systemNo = systemNo;
    }

    public String getMenuLevel() {
        return menuLevel;
    }

    public void setMenuLevel(String menuLevel) {
        this.menuLevel = menuLevel;
    }

    public String getParentMenuNo() {
        return parentMenuNo;
    }

    public void setParentMenuNo(String parentMenuNo) {
        this.parentMenuNo = parentMenuNo;
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