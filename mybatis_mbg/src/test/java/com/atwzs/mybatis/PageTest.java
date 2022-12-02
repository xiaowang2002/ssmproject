package com.atwzs.mybatis;

import com.atwzs.mybatis.mapper.EmpMapper;
import com.atwzs.mybatis.pojo.Emp;
import com.atwzs.mybatis.utils.SqlSessionUtil;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

/**
 * @ClassName PageTest
 * @Description
 * @Author WangZhisheng
 * @Date 10:19 2022/11/10
 * @Version 11.0.15
 */
public class PageTest {

    @Test
    public void testPage(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        EmpMapper mapper = sqlSession.getMapper(EmpMapper.class);
        //查询功能之前开启分页功能 （之前）
        Page<Object> page = PageHelper.startPage(1, 3);
        List<Emp> list = mapper.selectByExample(null);
        list.forEach(System.out::println);   //只能查到第一页的三条数据
        //查询功能之后可以获取分页相关的所有数据 （之后）
        PageInfo<Emp> info = new PageInfo<>(list, 5);
        list.forEach(System.out::println);   //只有第一页的三个数据
        System.out.println(page);
        System.out.println("************************");
        System.out.println(info);
    }
}
