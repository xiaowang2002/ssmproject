package com.atwzs.mybatis;

import com.atwzs.mybatis.mapper.EmpMapper;
import com.atwzs.mybatis.pojo.Emp;
import com.atwzs.mybatis.pojo.EmpExample;
import com.atwzs.mybatis.utils.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

/**
 * @ClassName MBGTest
 * @Description
 * @Author WangZhisheng
 * @Date 23:06 2022/11/9
 * @Version 11.0.15
 */
public class MBGTest {

    @Test
    public void testMBG(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        EmpMapper mapper = sqlSession.getMapper(EmpMapper.class);
        /*  根据id查询数据 Emp emp = mapper.selectByPrimaryKey(1);
        System.out.println(emp);*/
        /*  查询所有数据 List<Emp> list = mapper.selectByExample(null);
        list.forEach(System.out::println);*/
        /*  根据条件查询数据 EmpExample example = new EmpExample();
        example.createCriteria().andEmpNameEqualTo("王志生").andAgeGreaterThanOrEqualTo(20);
        example.or().andGenderEqualTo("男");
        List<Emp> list = mapper.selectByExample(example);
        list.forEach(System.out::println);*/
        Emp emp = new Emp(1, "傻逼", null, "女");
        /*  测试普通修改功能);
        mapper.updateByPrimaryKey(emp);*/
//        mapper.updateByPrimaryKeySelective(emp);  测试选择性修改，与测试普通性修改不一样（覆盖）
    }
}
