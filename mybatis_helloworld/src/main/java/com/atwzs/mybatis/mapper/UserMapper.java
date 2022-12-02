package com.atwzs.mybatis.mapper;

import com.atwzs.mybatis.pojo.User;

import java.util.List;

public interface UserMapper {

    int insertUser();

    void updateUser();

    void deleteUser();

    User getUserById();  //根据id查询用户信息

    List<User> getAllUser();  //查询所有的用户信息
}
