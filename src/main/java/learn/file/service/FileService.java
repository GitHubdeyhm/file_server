package learn.file.service;

import org.springframework.web.multipart.MultipartFile;

import java.io.InputStream;

/**
 * 文件上传下载服务提供
 * 2018/9/24 0:06
 */
public interface FileService {

    /**
     * 上次文件的保存功能
     * 2018/10/6 22:00
     **/
    void saveUploadFile(MultipartFile file);

    /**
     * 文件下载功能
     * 2018/9/24 0:10
     **/
    InputStream download();
}
