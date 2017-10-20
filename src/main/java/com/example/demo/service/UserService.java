package com.example.demo.service;

import com.example.demo.bean.User;
import com.example.demo.utils.restMessage.ResultMsg;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * Created by Tony on 2017/8/23.
 * com.example.demo.service.SpringBootMybatis
 */
public interface UserService {
    List<User> find(String id);

    ResultMsg register(User user);

    ResultMsg user(String id);

    ResultMsg users(Pageable pageable, String userName);

    ResultMsg userLogin(User user);
}
