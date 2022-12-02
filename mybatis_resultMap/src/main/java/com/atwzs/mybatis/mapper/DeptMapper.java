package com.atwzs.mybatis.mapper;

import com.atwzs.mybatis.pojo.Dept;
import com.atwzs.mybatis.pojo.Emp;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @ClassName DeptMapper
 * @Description
 * @Author WangZhisheng
 * @Date 8:21 2022/11/9
 * @Version 11.0.15
 */
public interface DeptMapper {

    /**
    * @description: 通过分步查询查询员工以及所对应的部门信息的第二步
    * @author: WangZhisheng
    * @date: 2022/11/9 8:23
    * @param: []
    * @return: com.atwzs.mybatis.pojo.Dept
    **/
    List<Emp> getDeptAndEmpByStepTwo(@Param("deptId") Integer deptId);

    /**
    * @description: 查询部门以及部门中的员工信息
    * @author: WangZhisheng
    * @date: 2022/11/9 14:02
    * @param: [deptId]
    * @return: com.atwzs.mybatis.pojo.Dept
    **/
    Dept getDeptAndEmpByDeptId(@Param("deptId") Integer deptId);

    /**
    * @description: 通过分步查询查询部门以及部门中员工信息的第一步
    * @author: WangZhisheng
    * @date: 2022/11/9 14:27
    * @param: [deptId]
    * @return: com.atwzs.mybatis.pojo.Dept
    **/
    Dept getDeptAndEmpByStepOne(@Param("deptId") Integer deptId);
}
