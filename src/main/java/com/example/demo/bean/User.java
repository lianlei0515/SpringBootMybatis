package com.example.demo.bean;

import com.example.demo.bean.publiclasss.UserPublic;
import com.example.demo.utils.md5util.Md5Util;

import javax.persistence.*;
import java.io.Serializable;
import java.util.UUID;

/**
 * Created by Tony on 2017/10/9.
 * com.example.demo.bean.SpringBootMybatis
 */
@Entity
@Table(name = "user")
public class User extends UserPublic implements Serializable {

    private Integer state;

    private String password;

    @Column(columnDefinition = "tinyint(2) NULL COMMENT '用户状态，0:冻结；1：正常'")
    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state == null ? 1 : state;
    }
    @Column(columnDefinition = "VARCHAR(35) NULL COMMENT '登录密码'")
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : Md5Util.getMd5(password);
    }

}
