package com.example.demo.dao;

import com.example.demo.bean.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserMapper extends JpaRepository<User , String> {

    void findByUserName(String userName);

    int countByUserName(String userName);

    int countByCellPhoneNumber(String cellPhoneNumber);

    int countByMailbox(String mailbox);
}