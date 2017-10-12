package com.example.demo.dao;

import com.example.demo.bean.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserMapper extends JpaRepository<User , String> {

    int countByUserName(String userName);

    int countByCellPhoneNumber(String cellPhoneNumber);

    int countByMailbox(String mailbox);

    User findById(String id);

    Page<User> findAllByUserNameLike(Pageable pageable, String userName);
}