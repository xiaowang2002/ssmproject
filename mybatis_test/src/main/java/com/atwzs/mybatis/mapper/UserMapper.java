package com.atwzs.mybatis.mapper;


import com.atwzs.mybatis.pojo.User;

import java.util.List;

/**
 * @ClassName UserMapper
 * @Description
 * @Author WangZhisheng
 * @Date 20:07 2022/11/20
 * @Version 11.0.15
 */
public interface UserMapper {

    /**
    * @description: 插入一个用户
    * @author: WangZhisheng
    * @date: 2022/11/20 20:07
    * @param: []
    * @return: void
    **/
    void insertUser();

    /**
    * @description: 删除一个用户
    * @author: WangZhisheng
    * @date: 2022/11/20 20:14
    * @param: []
    * @return: void
    **/
    void deleteUser();

    /**
    * @description: 修改一个用户的balance
    * @author: WangZhisheng
    * @date: 2022/11/20 20:17
    * @param: []
    * @return: void
    **/
    void updateUser();

    /**
    * @description: 根据一个id查用户
    * @author: WangZhisheng
    * @date: 2022/11/20 20:24
    * @param: []
    * @return: com.atwzs.pojo.User
    **/
    User selectUserById();

    /**
    * @description:
    * @author: WangZhisheng
    * @date: 2022/11/20 20:33
    * @param: []
    * @return: java.util.List<com.atwzs.mybatis.pojo.User>
    **/
    List<User> selectAllUser();
}
