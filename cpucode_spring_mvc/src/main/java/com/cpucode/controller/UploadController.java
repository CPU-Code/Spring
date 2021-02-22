package com.cpucode.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

/**
 * @author : cpucode
 * @date : 2021/2/22
 * @time : 18:22
 * @github : https://githfub.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
@RequestMapping("/uploadController")
@Controller
public class UploadController {

    @RequestMapping("/save")
    @ResponseBody
    public void save(String username, MultipartFile uploadFile, MultipartFile uploadFile2) throws IOException {
        System.out.println(username);
        System.out.println(uploadFile);
        System.out.println(uploadFile2);

        //获得上传文件的名称
        String originalFilename = uploadFile.getOriginalFilename();
        uploadFile.transferTo(new File("D:\\Date\\github\\Spring\\cpucode_spring_mvc\\src\\main\\resources\\" + originalFilename));

        String  originalFilename2 = uploadFile2.getOriginalFilename();
        uploadFile2.transferTo(new File("D:\\Date\\github\\Spring\\cpucode_spring_mvc\\src\\main\\resources\\" + originalFilename2));
    }

    @RequestMapping("save2")
    @ResponseBody
    public void save2(String username, MultipartFile[] uploadFile) throws IOException {
        System.out.println(username);

        for(MultipartFile multipartFile : uploadFile){
            System.out.println(multipartFile);

            String  originalFilename = multipartFile.getOriginalFilename();
            multipartFile.transferTo(new File(new File("D:\\Date\\github\\Spring\\cpucode_spring_mvc\\src\\main\\resources\\") + originalFilename));
        }
    }
}
