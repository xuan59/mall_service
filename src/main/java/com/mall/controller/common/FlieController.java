package com.mall.controller.common;

import com.mall.service.common.FileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Map;

/**
 * @author lx
 * @date 2021-06-17 19:33
 * 文件控制层
 */
@Controller
@CrossOrigin
@RequestMapping("file")
public class FlieController {

    @Autowired
    FileService fileService;

    @RequestMapping("/upload")
    @ResponseBody
    public String uploadFile(MultipartFile file) throws IOException {
        return fileService.uploadFile(file);
    }

    @RequestMapping("/download")
    public Map<String, Object> downloadFile(@RequestBody Map<String, Object> context, HttpServletResponse response) {
        fileService.downloadFile(context, response);
        return null;
    }

    @RequestMapping("/delete")
    public Map<String, Object> deleteFile(@RequestBody Map<String, Object> context) {
        return fileService.deleteFile(context);
    }
}
