package com.mall.service.common;

import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Map;

/**
 * @author lx
 * @date 2021-06-17 19:36
 * 文件服务接口
 */
public interface FileService {

    /**
     * 上传文件
     *
     * * @param map 参数
     * @return 返回数据
     * */
    String uploadFile(MultipartFile file) throws IOException;

    /**
     * 下载文件
     *
     * * @param map 参数
     * @return 返回数据
     * */
     void downloadFile(Map<String, Object> context, HttpServletResponse response);

    /**
     * 删除文件
     *
     * * @param map 参数
     * @return 返回数据
     * */
    Map<String, Object> deleteFile(Map<String, Object> context);
}
