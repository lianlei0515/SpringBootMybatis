package com.example.demo.controller;

import com.example.demo.bean.User;
import com.example.demo.service.UserService;
import com.example.demo.utils.createExce.DownloadExcel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Tony on 2017/8/23.
 * com.example.demo.controller.SpringBootMybatis
 */
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/find.do/{id}")
    public List<User> find(HttpServletRequest request , HttpServletResponse response , @PathVariable("id") String id){
        List<User> users = userService.find(id);
        return users;
    }

    @RequestMapping("/getFile.do")
    public void getFile(HttpServletRequest request , HttpServletResponse response){
        try {
            String[] titleRowS = {"姓名","年龄","性别"};
            Object[] dataObject = new Object[titleRowS.length];
            dataObject[0] = "张三";
            dataObject[1] = "18";
            dataObject[2] = "男";
            List<Object[]> dataList = new ArrayList<>();
            dataList.add(dataObject);
            DownloadExcel.export(response,"文件名","测试导出",titleRowS,dataList);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}
