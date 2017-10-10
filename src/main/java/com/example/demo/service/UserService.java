package com.example.demo.service;

import com.example.demo.bean.User;
import com.example.demo.utils.restMessage.ResultMsg;

import java.util.List;

/**
 * Created by Tony on 2017/8/23.
 * com.example.demo.service.SpringBootMybatis
 */
public interface UserService {
    List<User> find(String id);

    ResultMsg register(User user);
}
