package com.mall.common.utils;

import com.mall.common.dao.ControlledDao;
import com.mall.entity.admin.MenuResource;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author lx
 * @date 2021-06-11 10:25
 * 自动生成编号
 */
@Component
public class AutoCreateNo {

    public String getMenuNo(String parentMentNo, String systemNo){
        ControlledDao dao = SpringUtil.getBean(ControlledDao.class);
        MenuResource menuResource = new MenuResource();
        menuResource.setParentMenuNo(parentMentNo);
        menuResource.setSystemNo(systemNo);
        try {
            List<MenuResource> selectList = dao.selectList("MenuResource.selectMaxMenuNo", menuResource);
            if (selectList == null || selectList.isEmpty()) {
                if (parentMentNo == null || "".equals(parentMentNo)) {
                    parentMentNo = "MENU001";
                } else {
                    parentMentNo = parentMentNo + "1";
                }
            } else {
                parentMentNo = selectList.get(0).getMenuNo();
                Integer max = Integer.parseInt(parentMentNo.substring(parentMentNo.length() - 2)) + 1;
                parentMentNo = parentMentNo.substring(0, parentMentNo.length() - 2);
                if (max > 9) {
                    parentMentNo = parentMentNo + max;
                } else {
                    parentMentNo = parentMentNo + "0" + max;
                }
            }
            return parentMentNo;
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }
}
