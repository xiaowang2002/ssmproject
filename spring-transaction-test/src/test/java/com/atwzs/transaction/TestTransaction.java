package com.atwzs.transaction;

import com.atwzs.transaction.pojo.Emp;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * @ClassName TestTransaction
 * @Description
 * @Author WangZhisheng
 * @Date 16:41 2022/11/24
 * @Version 11.0.15
 */
@RunWith(SpringJUnit4ClassRunner.class)  //让你有资格使用Autowired
@ContextConfiguration(locations = {"classpath:application-Context.xml","classpath:transaction-Context.xml"}) //Autowired配置在哪
//@ContextConfiguration("classpath:transaction-Context.xml") //Autowired配置在哪
public class TestTransaction {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    //测试增删改功能
    @Test
    public void testUpdate() {
        String sql = "insert into t_emp values(null,?,?,?,?)";
        int result = jdbcTemplate.update(sql, "杨幂", 45, "男", null);
        System.out.println(result);
    }

    @Test
    public void testSelectEmpById() {
        String sql = "select * from t_emp where emp_id=?";
        //引用类型用new BeanPropertyRowMapper<>(类.class)
        //queryForObject返回单个
        Emp emp = jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<>(Emp.class), 4);  //列名和字段名相同
        System.out.println(emp);
    }

    @Test
    public void testSelectList() {
        String sql = "select * from t_emp";
        //query返回多个
        List<Emp> list = jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(Emp.class));
        list.forEach(System.out::println);
    }

    //查询单行单列
    @Test
    public void testSelectCount() {
        String sql = "select Count(age) from t_emp";
        Integer count = jdbcTemplate.queryForObject(sql, Integer.class);
        System.out.println(count);
    }

    //查询单行单列
    @Test
    public void testSelectAge() {
        String sql = "select age from t_emp where emp_name=?";
        Integer age = jdbcTemplate.queryForObject(sql, Integer.class,"杨幂");
        System.out.println(age);
    }
}
