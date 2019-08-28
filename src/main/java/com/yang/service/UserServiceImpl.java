package com.yang.service;

import com.yang.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class UserServiceImpl {

    @Autowired
    private UserMapper userMapper;


    public void register(String username, String password) {
        userMapper.save(username,password);
    }

    public void del(int id){
        userMapper.delete(id);
    }

}
