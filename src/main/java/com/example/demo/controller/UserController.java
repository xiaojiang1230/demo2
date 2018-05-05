package com.example.demo.controller;

import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by xiaojiang on 2018/5/5.
 */
@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/user")
    public String se(int cid){
        return userService.select(cid);
    }

}
