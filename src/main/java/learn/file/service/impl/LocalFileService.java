package learn.file.service.impl;

import learn.file.service.FileService;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.InputStream;

/**
 * 2018/9/24 0:08
 */
@Service("localFileService")
public class LocalFileService implements FileService {

    @Override
    public void saveUploadFile(MultipartFile file) {

    }

    @Override
    public InputStream download() {
        return null;
    }
}
