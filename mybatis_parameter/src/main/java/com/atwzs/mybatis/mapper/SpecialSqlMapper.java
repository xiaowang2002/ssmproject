package com.atwzs.mybatis.mapper;

import com.atwzs.mybatis.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @ClassName SpecialSqlMapper
 * @Description
 * @Author WangZhisheng
 * @Date 8:32 2022/11/8
 * @Version 11.0.15
 */
public interface SpecialSqlMapper {

    /**
    * @description: 通过用户名模糊查询用户信息
    * @author: WangZhisheng
    * @date: 2022/11/8 8:36
    * @param: [param]
    * @return: java.util.List<com.atwzs.mybatis.pojo.User>
    **/
    List<User> getUserByLike(@Param("param") String param);

    /**
    * @description: 批量删除
    * @author: WangZhisheng
    * @date: 2022/11/8 9:22
    * @param: [ids]
    * @return: void
    **/
    void deleteMoreUser(@Param("ids") String ids); //可变参数

    /**
    * @description: 动态设置表名，查询当前用户信息
    * @author: WangZhisheng
    * @date: 2022/11/8 9:50
    * @param: [table]
    * @return: java.util.List<com.atwzs.mybatis.pojo.User>
    **/
    List<User> getUserList(@Param("tableName") String table);

    /**
    * @description: 添加用户信息并获取自增的主键
    * @author: WangZhisheng
    * @date: 2022/11/8 10:13
    * @param: [user]
    * @return: void
    **/
    void insertUser(User user);
}
