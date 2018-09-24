package learn.file.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

/**
 * 2018/9/24 0:13
 */
@RestController
@RequestMapping("/file/")
public class FileController {

//    @PostMapping(value = "upload", consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    @GetMapping("upload")
    public String upload() {
        return "file";
    }
}
