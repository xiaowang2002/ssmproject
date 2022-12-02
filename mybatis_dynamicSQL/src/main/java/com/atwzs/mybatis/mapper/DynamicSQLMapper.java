package com.atwzs.mybatis.mapper;

import com.atwzs.mybatis.pojo.Emp;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @ClassName DynamicSQLMapper
 * @Description
 * @Author WangZhisheng
 * @Date 16:08 2022/11/9
 * @Version 11.0.15
 */
public interface DynamicSQLMapper {

    /**
    * @description: 根据条件查询员工信息
    * @author: WangZhisheng
    * @date: 2022/11/9 16:12
    * @param: [emp]
    * @return: java.util.List<com.atwzs.mybatis.pojo.Emp>
    **/
    List<Emp> getEmpByCondition(Emp emp);

    /**
    * @description: 使用choose查询用户信息
    * @author: WangZhisheng
    * @date: 2022/11/9 17:19
    * @param: [emp]
    * @return: java.util.List<com.atwzs.mybatis.pojo.Emp>
    **/
    List<Emp> getEmpByChoose(Emp emp);

    /**
    * @description: 批量添加员工的信息
    * @author: WangZhisheng
    * @date: 2022/11/9 19:08
    * @param: [emps]
    * @return: void
    **/
    void insertMoreEmp(@Param("emps") List<Emp> emps);

    /**
    * @description: 批量删除员工的信息
    * @author: WangZhisheng
    * @date: 2022/11/9 19:33
    * @param: [emps]
    * @return: void
    **/
    void deleteMoreEmp(@Param("empIds") Integer[] empIds);
}
