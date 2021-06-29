package com.mall.controller.common.impl;

import com.github.tobato.fastdfs.domain.fdfs.StorePath;
import com.github.tobato.fastdfs.domain.proto.storage.DownloadByteArray;
import com.github.tobato.fastdfs.service.FastFileStorageClient;
import com.mall.common.utils.ContextUtil;
import com.mall.common.utils.StringUtil;
import com.mall.service.common.FileService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.net.URLEncoder;
import java.util.Map;

/**
 * @author lx
 * @date 2021-06-17 19:40
 * 文件服务实现
 */
@Service
public class FileServiceImpl implements FileService {

    @Autowired
    FastFileStorageClient fastFileStorageClient;
    Logger logger = LoggerFactory.getLogger(FileServiceImpl.class);
    /**
     * 上传文件
     *
     * * @param map 参数
     * @return 返回数据
     * */
    @Override
    public String uploadFile(MultipartFile file) {
        //获取文件后缀位置
        int index = file.getOriginalFilename().lastIndexOf(".");
        //文件后缀名
        String fileSuffix = file.getOriginalFilename().substring(index + 1);
        try {
            //将文件上传到fastDFS
            StorePath storePath = fastFileStorageClient.uploadFile(file.getInputStream(), file.getSize(), fileSuffix, null);
            String filePath = storePath.getFullPath(); //获取上传文件路径
            logger.info("文件路径为：" + filePath);
            return filePath;
        }catch (Exception e){
            e.printStackTrace();
            logger.info("上传文件失败");
        }

        return null;
    }

    /**
     * 下载文件
     *
     * * @param map 参数
     * @return 返回数据
     * */
    @Override
    public void downloadFile(Map<String, Object> context, HttpServletResponse response) {
        Map<String, Object> requestBody = ContextUtil.getRequestBody(context);
        String filePath = StringUtil.getAsString(requestBody.get("filePath"));
        // 分离文件分组
        String group = filePath.substring(0, filePath.indexOf("/"));
        // 分离文件路径
        String path = filePath.substring(filePath.indexOf("/") + 1);
        String fileSuffix = filePath.substring(filePath.lastIndexOf(".") + 1);
        String fileName = filePath.substring(filePath.lastIndexOf("/") + 1, filePath.lastIndexOf("."));

        ServletOutputStream outputStream = null;
        try{
            byte[] bytes = fastFileStorageClient.downloadFile(group, path, new DownloadByteArray());
            // 这里只是为了整合fastdfs，所以写死了文件格式。需要在上传的时候保存文件名。下载的时候使用对应的格式
            response.setHeader("Content-disposition", "attachment;filename=" + URLEncoder.encode(fileName.concat(fileSuffix), "UTF-8"));
            response.setCharacterEncoding("UTF-8");
            outputStream = response.getOutputStream();
            outputStream.write(bytes);

        } catch (IOException e) {
            e.printStackTrace();
            logger.info("下载文件失败");
        } finally {
            try {
                outputStream.flush();
                outputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * 删除文件
     *
     * * @param map 参数
     * @return 返回数据
     * */
    @Override
    public Map<String, Object> deleteFile(Map<String, Object> context) {
        Map<String, Object> requestBody = ContextUtil.getRequestBody(context);
        try {
            fastFileStorageClient.deleteFile(StringUtil.getAsString(requestBody.get("filePath")));
        }catch (Exception e){
            e.printStackTrace();
            logger.info("删除文件失败");
        }
        return null;
    }
}
