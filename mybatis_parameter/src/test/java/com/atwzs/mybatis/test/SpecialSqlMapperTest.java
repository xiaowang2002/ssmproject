package com.atwzs.mybatis.test;

import com.atwzs.mybatis.mapper.SpecialSqlMapper;
import com.atwzs.mybatis.pojo.User;
import com.atwzs.mybatis.utils.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

/**
 * @ClassName SpecialSqlMapperTest
 * @Description
 * @Author WangZhisheng
 * @Date 8:52 2022/11/8
 * @Version 11.0.15
 */
public class SpecialSqlMapperTest {

    @Test
    public void testGetUserByLike(){
        SqlSession session = SqlSessionUtil.getSqlSession();
        //获取代理类实现类对象
        SpecialSqlMapper mapper = session.getMapper(SpecialSqlMapper.class);
        List<User> list = mapper.getUserByLike("o");
        //list集合迭代方式，不止有forEach()方法，还有foreach循环，迭代器
        list.forEach(System.out::println);
    }

    @Test
    public void testDeleteMoreUser(){
        SqlSession session = SqlSessionUtil.getSqlSession();
        //获取代理类实现类对象
        SpecialSqlMapper mapper = session.getMapper(SpecialSqlMapper.class);
        mapper.deleteMoreUser("2,3");
    }

    @Test
    public void testInsertUser(){
        SqlSession session = SqlSessionUtil.getSqlSession();
        //获取代理类实现类对象
        SpecialSqlMapper mapper = session.getMapper(SpecialSqlMapper.class);
        User user = new User(null, "cgd", "135456", 20, "男", "3517139394@qq.com");
        mapper.insertUser(user);
        System.out.println(user);
    }
}
