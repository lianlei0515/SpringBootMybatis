package com.example.demo.service.impl;

import com.example.demo.bean.User;
import com.example.demo.bean.UserExample;
import com.example.demo.dao.UserMapper;
import com.example.demo.service.UserService;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Tony on 2017/8/23.
 * com.example.demo.service.impl.SpringBootMybatis
 */
@Service
public class UserServiceImpl implements UserService {

    static final Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> find(String id) {
        UserExample userExample = new UserExample();
        List<User> users = new ArrayList<>();
        if (StringUtils.isNoneBlank(id) && !"null".equals(id) && !"".equals(id)){
            UserExample.Criteria criteria = userExample.createCriteria();
            criteria.andIdEqualTo(id);
            users = userMapper.selectByExample(userExample);
        }else {
            users = userMapper.selectByExample(userExample);
        }
        logger.info("...................");
        return users;
    }
}
