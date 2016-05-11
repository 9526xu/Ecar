package com.Ecar.dto.Common;

import org.springframework.web.multipart.MultipartFile;

/**
 * Created by xiaohei on 16/5/11.
 */
public class UpLoadForm {
    private MultipartFile[] file;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public MultipartFile[] getFile() {
        return file;
    }

    public void setFile(MultipartFile[] file) {
        this.file = file;
    }
}
