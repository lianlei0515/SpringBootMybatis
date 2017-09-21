package com.example.demo.controller;

import com.example.demo.bean.User;
import com.example.demo.service.UserService;
import com.example.demo.service.impl.UserServiceImpl;
import com.example.demo.utils.ExcelUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;
import java.util.Map;

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



}
