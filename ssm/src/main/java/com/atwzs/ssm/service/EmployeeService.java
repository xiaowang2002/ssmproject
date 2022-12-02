package com.atwzs.ssm.service;

import com.atwzs.ssm.pojo.Employee;
import com.github.pagehelper.PageInfo;

import java.util.List;

/**
 * @ClassName EmployeeService
 * @Description
 * @Author WangZhisheng
 * @Date 19:34 2022/11/29
 * @Version 11.0.15
 */
public interface EmployeeService {
    List<Employee> getAllEmployee();

    /**
    * @description: 获取员工的分页信息
    * @author: WangZhisheng
    * @date: 2022/11/29 22:06
    * @param: [pageNum]
    * @return: com.github.pagehelper.PageInfo<com.atwzs.ssm.pojo.Employee>
    **/
    PageInfo<Employee> getEmployeePage(Integer pageNum);
}
