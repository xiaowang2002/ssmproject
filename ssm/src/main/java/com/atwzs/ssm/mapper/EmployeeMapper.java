package com.atwzs.ssm.mapper;

import com.atwzs.ssm.pojo.Employee;

import java.util.List;

/**
 * @ClassName EmployeeMapper
 * @Description
 * @Author WangZhisheng
 * @Date 19:47 2022/11/29
 * @Version 11.0.15
 */
public interface EmployeeMapper {

    /**
    * @description: 查询员工的所有信息
    * @author: WangZhisheng
    * @date: 2022/11/29 21:38
    * @param: []
    * @return: java.util.List<com.atwzs.ssm.pojo.Employee>
    **/
    List<Employee> getAllEmployee();
}
