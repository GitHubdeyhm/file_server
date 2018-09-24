package file.service;

import org.springframework.web.multipart.MultipartFile;

import java.io.InputStream;

/**
 * 文件上传下载服务提供
 * 2018/9/24 0:06
 */
public interface FileService {

    void saveUploadFile(MultipartFile file);

    /**
     * 文件下载功能
     * 2018/9/24 0:10
     **/
    InputStream download();
}
