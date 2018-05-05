package com.example.demo.service;

import com.example.demo.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.Serializable;


/**
 * Created by xiaojiang on 2018/5/5.
 */
@Service
public class UserService implements Serializable{
    @Autowired
    private UserMapper userMapper;

    public String select(int cid){
        return userMapper.selectByPrimaryKey(cid);
    }
}
