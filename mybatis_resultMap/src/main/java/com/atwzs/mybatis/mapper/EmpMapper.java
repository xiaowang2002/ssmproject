package com.atwzs.mybatis.mapper;

import com.atwzs.mybatis.pojo.Dept;
import com.atwzs.mybatis.pojo.Emp;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @ClassName EmpMapper
 * @Description
 * @Author WangZhisheng
 * @Date 11:16 2022/11/8
 * @Version 11.0.15
 */
public interface EmpMapper {

    /**
    * @description: 根据id查询员工信息
    * @author: WangZhisheng
    * @date: 2022/11/8 17:15
    * @param: [id]
    * @return: com.atwzs.mybatis.pojo.Emp
    **/
    Emp getEmpByEmpId(@Param("empId") Integer id);

    /**
    * @description: 获取员工以及所对应的部门信息
    * @author: WangZhisheng
    * @date: 2022/11/8 19:20
    * @param: [empId]
    * @return: com.atwzs.mybatis.pojo.Emp
    **/
    Emp getEmpAndDeptByEmpId(@Param("empId") Integer empId);

    /**
    * @description: 通过分步查询员工以及所对应的部门信息的第一步
    * @author: WangZhisheng
    * @date: 2022/11/8 22:14
    * @param: [empId]
    * @return: com.atwzs.mybatis.pojo.Emp
    **/
    Emp getEmpAndDeptByStepOne(@Param("empId") Integer empId);

    /**
     * @description: 通过分步查询部门以及部门中员工信息的第二步
     * @author: WangZhisheng
     * @date: 2022/11/9 14:37
     * @param: [deptId]
     * @return: java.util.List<com.atwzs.mybatis.pojo.Dept>
     **/
    Dept getDeptAndEmpByStepTwo(@Param("deptId") Integer deptId);
}
