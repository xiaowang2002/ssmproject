package com.atwzs.mybatis.mapper;

import com.atwzs.mybatis.pojo.Emp;
import org.apache.ibatis.annotations.Param;

/**
 * @ClassName CacheMapper
 * @Description
 * @Author WangZhisheng
 * @Date 20:13 2022/11/9
 * @Version 11.0.15
 */
public interface CacheMapper {

    /**
    * @description: 根据员工id查询员工信息
    * @author: WangZhisheng
    * @date: 2022/11/9 20:14
    * @param: [empId]
    * @return: com.atwzs.mybatis.pojo.Emp
    **/
    Emp getEmpById(@Param("empId") Integer empId);

    /**
    * @description: 添加一条员工信息
    * @author: WangZhisheng
    * @date: 2022/11/9 21:12
    * @param: [emp]
    * @return: void
    **/
    void insertEmp(Emp emp);  //这里不能用@Param
}
