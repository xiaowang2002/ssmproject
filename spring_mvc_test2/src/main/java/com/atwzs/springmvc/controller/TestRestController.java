package com.atwzs.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * @ClassName TestRestController
 * @Description
 * @Author WangZhisheng
 * @Date 21:50 2022/11/26
 * @Version 11.0.15
 */
@Controller
public class TestRestController {

    @RequestMapping("/user")
    public String getAllUser(){
        System.out.println("查询所有的用户信息-->/user-->get");
        return "success";
    }

    @RequestMapping("/user/{id}")
    public String getUserById(@PathVariable("id") Integer id){
        System.out.println("查询根据id查询用户信息-->/user/"+id+"-->get");
        return "success";
    }

    @RequestMapping(value = "/user",method = RequestMethod.POST)
    public String addUser(String username,String password){
        System.out.println("添加用户信息-->/user,用户名为"+username+",密码为"+password+"-->post");
        return "success";
    }

    @PutMapping("/user")
    public String updateUser(){
        System.out.println("修改用户信息-->/user"+"-->put");
        return "success";
    }

    @DeleteMapping("/user")
    public String deleteUser(){
        System.out.println("删除用户信息-->/user"+"-->delete");
        return "success";
    }
}
