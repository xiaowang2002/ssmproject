package com.atwzs.mybatis.test;

import com.atwzs.mybatis.mapper.UserMapper;
import com.atwzs.mybatis.pojo.User;
import com.atwzs.mybatis.utils.SqlSessionUtil;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * @ClassName MybatisTest
 * @Description
 * @Author WangZhisheng
 * @Date 11:04 2022/11/6
 * @Version 11.0.15
 */
public class MybatisTest {

    @Test
    public void testInsert() throws IOException {
//        获取核心配置文件
        InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
//        获取SqlSessionFactoryBuilder对象
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
//        获取SqlSessionFactory对象
        SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(is);
        /*获取sql会话的对象SqlSession,是MyBatis 提供的操作数据库的对象，不会自动提交事务
        SqlSession sqlSession = sqlSessionFactory.openSession();*/
//        获取sql会话的对象SqlSession,是MyBatis 提供的操作数据库的对象，会自动提交事务
        SqlSession sqlSession = sqlSessionFactory.openSession(true);
//        获得UserMapper的代理实现类对象 -> 操纵Mapper类执行数据库操作(常用)
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);   //返回一个UserMapper的实例化对象
//        调用mapper接口中的方法，实现添加用户信息的功能
        int result = mapper.insertUser();
//        提供sql以及的唯一标识找到sql并执行，唯一标识是namespace.sqlId
//        int result = sqlSession.insert("com.atwzs.mybatis.mapper.UserMapper.insertUser");
        System.out.println("结果：" + result);
//        sqlSession.commit();  //手动提交会话内的事务
        sqlSession.close();   //关闭SqlSession
    }

    @Test
    public void testUpdate() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        mapper.updateUser();
        sqlSession.close();
    }

    @Test
    public void testDelete() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        mapper.deleteUser();
        sqlSession.close();
    }

    @Test
    public void testGetUserById() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = mapper.getUserById();
        System.out.println(user);
    }

    @Test
    public void testGetAllUser() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<User> list = mapper.getAllUser();
        list.forEach(System.out::println);
    }
}
