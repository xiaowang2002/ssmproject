package com.atwzs.spring.controller;

import com.atwzs.spring.service.UserService;
import com.atwzs.spring.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * @ClassName UserController
 * @Description
 * @Author WangZhisheng
 * @Date 22:29 2022/11/22
 * @Version 11.0.15
 */
@Controller
public class UserController {


    private UserService userService;

    @Autowired
    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    public void saveUser(){
        userService.saveUser();
    }
}
