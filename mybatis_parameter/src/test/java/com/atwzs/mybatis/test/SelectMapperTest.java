package com.atwzs.mybatis.test;

import com.atwzs.mybatis.mapper.SelectMapper;
import com.atwzs.mybatis.pojo.User;
import com.atwzs.mybatis.utils.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;
import java.util.Map;

/**
 * @ClassName SelectMapperTest
 * @Description
 * @Author WangZhisheng
 * @Date 11:58 2022/11/7
 * @Version 11.0.15
 */
public class SelectMapperTest {

    @Test
    public void testGetUserById() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        SelectMapper mapper = sqlSession.getMapper(SelectMapper.class);
        User user = mapper.getUserById(1);
        System.out.println(user);
    }

    @Test
    public void testGetAllUser() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        SelectMapper mapper = sqlSession.getMapper(SelectMapper.class);
        List<User> list = mapper.getAllUser();
        list.forEach(System.out::println);
    }

    @Test
    public void testGetCount() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        SelectMapper mapper = sqlSession.getMapper(SelectMapper.class);
        Integer count = mapper.getCount();
        System.out.println(count);
    }

    @Test
    public void testGetUserByIdToMap() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        SelectMapper mapper = sqlSession.getMapper(SelectMapper.class);
        Map<String, Object> map = mapper.getUserByIdToMap(1);
//        {password=123456, gender=男, id=1, age=20, email=3517139394@qq.com, username=admin}
        System.out.println(map);
    }

    @Test
    public void testGetAllToMap() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        SelectMapper mapper = sqlSession.getMapper(SelectMapper.class);
        List<Map<String, Object>> list = mapper.getAllUserToMap();
        System.out.println(list);
//        Map<String, Object> map = mapper.getAllUserToMap();
/*        {1={password=123456, gender=男, id=1, age=20, email=3517139394@qq.com, username=admin},
        2={password=123456, gender=男, id=2, age=20, email=3517139394@qq.com, username=wzs},
        3={password=123, gender=男, id=3, age=20, email=3517139394@qq.com, username=root},
        5={password=123456, gender=女, id=5, age=33, email=123@qq.com, username=汤俊杰}}*/
//        System.out.println(map);
    }
}
