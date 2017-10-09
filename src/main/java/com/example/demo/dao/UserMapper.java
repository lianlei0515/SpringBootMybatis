package com.example.demo.dao;

import com.example.demo.bean.User;
import com.example.demo.bean.UserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserMapper extends JpaRepository<User , String> {

    User findOneByName(String asa);

}