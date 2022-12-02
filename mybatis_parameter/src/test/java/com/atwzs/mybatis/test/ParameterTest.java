package com.atwzs.mybatis.test;

import com.atwzs.mybatis.mapper.UserMapper;
import com.atwzs.mybatis.pojo.User;
import com.atwzs.mybatis.utils.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;


/**
 * @ClassName ParameterTest
 * @Description
 * @Author WangZhisheng
 * @Date 16:56 2022/11/6
 * @Version 11.0.15
 */
public class ParameterTest {

    @Test
    public void testGetUserByUsername(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = mapper.getUserByUsername("root");
        System.out.println(user);
    }

    @Test
    public void testCheckLogin(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = mapper.checkLogin("root", "123");
        System.out.println(user);
    }

    @Test
    public void testCheckLoginByMap(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        Map<String,Object> map=new HashMap<>();
        map.put("username","wzs");
        map.put("password","123456");
        User user = mapper.checkLoginByMap(map);
        System.out.println(user);
    }

    @Test
    public void testInsertUser(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = new User(null, "汤俊杰", "123456", 33, "女", "123@qq.com");
        mapper.insertUser(user);
    }

    @Test
    public void testCheckLoginByParam(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = mapper.checkLoginByParam("root", "123");
        System.out.println(user);
    }

}
