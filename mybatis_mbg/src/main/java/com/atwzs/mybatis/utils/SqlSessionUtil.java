package com.atwzs.mybatis.utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * @ClassName SqlSessionUtil
 * @Description
 * @Author WangZhisheng
 * @Date 12:35 2022/11/6
 * @Version 11.0.15
 */
public class SqlSessionUtil {
    public static SqlSession getSqlSession(){
        SqlSession sqlSession=null;
//        获取核心配置文件的输入流
        try {
            InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
//        获取SqlSessionFactoryBuilder对象
            SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
//        获取SqlSessionFactory对象
            SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(is);
//        获取sql会话的对象SqlSession,是MyBatis 提供的操作数据库的对象，会自动提交事务
            sqlSession = sqlSessionFactory.openSession(true);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return sqlSession;
    }
}
