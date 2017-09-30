package com.example.demo.dao;

import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

/**
 * Created by Tony on 2017/9/30.
 * com.example.demo.dao.SpringBootMybatis
 */
public interface DefauleMapper {

    @Select("select * from user where deteledstatus = 1")
    public List<Map> getUsers();

}
