package com.example.demo.bean;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by Tony on 2017/10/9.
 * com.example.demo.bean.SpringBootMybatis
 */
@Entity
@Table(name = "user")
public class User extends UserPublic implements Serializable {

    private int state;

    private String password;

    @Column(columnDefinition = "int(2) NULL COMMENT '用户状态，0:冻结；1：正常'")
    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }
    @Column(columnDefinition = "VARCHAR(35) NULL COMMENT '登录密码'")
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
