package com.atwzs.mybatis.test;

import com.atwzs.mybatis.mapper.DynamicSQLMapper;
import com.atwzs.mybatis.pojo.Emp;
import com.atwzs.mybatis.utils.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

/**
 * @ClassName DynamicMapperTest
 * @Description
 * @Author WangZhisheng
 * @Date 16:24 2022/11/9
 * @Version 11.0.15
 */
public class DynamicMapperTest {

    @Test
    public void testGetEmpByCondition(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        DynamicSQLMapper mapper = sqlSession.getMapper(DynamicSQLMapper.class);
        Emp emp = new Emp(null, "三梦奇缘", 35, "");
        List<Emp> list = mapper.getEmpByCondition(emp);
        list.forEach(System.out::println);
    }

    @Test
    public void testGetEmpByChoose(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        DynamicSQLMapper mapper = sqlSession.getMapper(DynamicSQLMapper.class);
        Emp emp = new Emp(null, "三梦奇缘", 35, "");
        List<Emp> list = mapper.getEmpByChoose(emp);
        list.forEach(System.out::println);
    }

    @Test
    public void testInsertMoreEmp(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        DynamicSQLMapper mapper = sqlSession.getMapper(DynamicSQLMapper.class);
        Emp emp1 = new Emp(null, "a", 20, "男");
        Emp emp2 = new Emp(null, "b", 20, "男");
        Emp emp3 = new Emp(null, "c", 20, "男");
        Emp emp4 = new Emp(null, "d", 20, "男");
        List<Emp> emps = Arrays.asList(emp1, emp2, emp3, emp4);  //记住此方法
        mapper.insertMoreEmp(emps);
    }

    @Test
    public void testDeleteMoreEmp(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        DynamicSQLMapper mapper = sqlSession.getMapper(DynamicSQLMapper.class);
        Integer[] integers = new Integer[]{5,6,7};
        mapper.deleteMoreEmp(integers);
    }
}
