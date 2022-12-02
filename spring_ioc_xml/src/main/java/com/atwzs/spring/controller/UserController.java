package com.atwzs.spring.controller;

import com.atwzs.spring.service.UserService;

/**
 * @ClassName UserController
 * @Description
 * @Author WangZhisheng
 * @Date 15:42 2022/11/12
 * @Version 11.0.15
 */
public class UserController {

    private UserService userService;

    public UserService getUserService() {
        return userService;
    }

    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    public void saveUser(){
        userService.saveUser();
    }
}
