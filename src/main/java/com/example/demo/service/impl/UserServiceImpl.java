package com.example.demo.service.impl;

import com.example.demo.bean.User;
import com.example.demo.dao.UserMapper;
import com.example.demo.service.UserService;
import com.example.demo.utils.ExceptionResult;
import com.example.demo.utils.restMessage.RestCode;
import com.example.demo.utils.restMessage.ResultMsg;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.UUID;

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
        List<User> all = userMapper.findAll();
        System.out.println(all.size());
        return all;
    }

    @Override
    public ResultMsg register(User user) {
        ResultMsg resultMsg = new ResultMsg();
        resultMsg.setCode(RestCode.EXISTENCE);
        //根据用户名称或手机号或邮箱查看是否存在
        try {
            int userCount = 0;
            userCount = userMapper.countByUserName(user.getUserName());
            if (userCount == 0){
                userCount = userMapper.countByCellPhoneNumber(user.getCellPhoneNumber());
                if (userCount == 0){
                    userCount = userMapper.countByMailbox(user.getMailbox());
                    if (userCount == 0){
                        user.setId(UUID.randomUUID().toString().replace("-",""));
                        user.setCreateTime(new Date());
                        User user1 = userMapper.save(user);
                        resultMsg.setD(user1);
                        resultMsg.setCode(RestCode.SUCCESSCODE);
                        resultMsg.setMessage(RestCode.SUCCESSMESSAGE_CN);
                    }else {
                        resultMsg.setMessage(RestCode.MAILBOX_EXISTENCE_CN);
                    }
                }else {
                    resultMsg.setMessage(RestCode.CELLPHONENUMBER_EXISTENCE_CN);
                }
            }else {
                resultMsg.setMessage(RestCode.USERNAME_EXISTENCE_CN);
            }
        }catch (Exception e){
            e.printStackTrace();
            resultMsg = ExceptionResult.exceptionResult(e.getCause().toString());
        }
        return resultMsg;
    }

    @Override
    public ResultMsg user(String id) {
        ResultMsg resultMsg = new ResultMsg();
        resultMsg.setCode(RestCode.SUCCESSCODE);
        try {
            if (StringUtils.isBlank(id)){
                throw new NullPointerException();
            }else {
                User user = userMapper.findById(id);
                if (user == null){
                    resultMsg.setMessage(RestCode.NODATA_CN);
                }
                resultMsg.setD(user);
            }
        }catch (Exception e){
            e.printStackTrace();
            resultMsg = ExceptionResult.exceptionResult(e.getCause().toString());
        }
        return resultMsg;
    }

    @Override
    public ResultMsg users(Pageable pageable, String userName) {
        if ("".equals(userName) ||userName==null){
            return ResultMsg.getNew().setD(userMapper.findAll(pageable));
        }else {
            return ResultMsg.getNew().setD(userMapper.findAllByUserNameLike(pageable,"%"+userName+"%"));
        }
    }
}
