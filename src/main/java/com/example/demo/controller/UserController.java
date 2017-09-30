package com.example.demo.controller;

import com.example.demo.bean.User;
import com.example.demo.service.UserService;
import com.example.demo.utils.createExce.DownloadExcel;
import com.example.demo.utils.restMessage.RestCode;
import com.example.demo.utils.restMessage.ResultMsg;
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
    public ResultMsg find(HttpServletRequest request , HttpServletResponse response , @PathVariable("id") String id){
        List<User> users = userService.find(id);
        ResultMsg resultMsg = new ResultMsg().setD(users);
        if (users.size()==0){
            resultMsg.setM(RestCode.NODATA_CN);
        }
        return resultMsg;
    }

    @RequestMapping("/getFile.do")
    public void getFile(HttpServletRequest request , HttpServletResponse response){

    }


}
