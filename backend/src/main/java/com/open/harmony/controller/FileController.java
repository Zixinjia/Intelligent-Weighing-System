package com.open.harmony.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("/test")
public class FileController {

    @PostMapping("/12345")
    public ResponseEntity<String> uploadFile(FileUploadRequest request) {
        MultipartFile file = request.getFile();

        if (file.isEmpty()) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("No file uploaded");
        }

        // 处理接收到的文件，例如保存到磁盘或进行其他操作
        // 这里只是简单地打印文件名和大小
        String fileName = file.getOriginalFilename();
        long fileSize = file.getSize();
        System.out.println("Received file: " + fileName);
        System.out.println("File size: " + fileSize + " bytes");

        return ResponseEntity.ok("File uploaded successfully");
    }

    public static class FileUploadRequest {
        private MultipartFile file;

        public MultipartFile getFile() {
            return file;
        }

        public void setFile(MultipartFile file) {
            this.file = file;
        }
    }
}