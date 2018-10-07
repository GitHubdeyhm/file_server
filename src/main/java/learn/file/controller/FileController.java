package learn.file.controller;

import learn.file.service.FileService;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 2018/9/24 0:13
 */
@Controller
@RequestMapping("/file/")
public class FileController {

    @Resource(name = "localFileService")
    private FileService fileService;

    @ResponseBody
    @PostMapping(value = "upload", consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    public String upload() {
        return "file";
    }

    @GetMapping("download/{fileId}")
    public String download(@PathVariable String fileId) {
        return fileId;
    }
}
