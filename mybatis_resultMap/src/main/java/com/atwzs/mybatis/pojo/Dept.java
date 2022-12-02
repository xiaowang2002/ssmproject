package com.atwzs.mybatis.pojo;

import java.util.List;

/**
 * @ClassName Dept
 * @Description
 * @Author WangZhisheng
 * @Date 11:13 2022/11/8
 * @Version 11.0.15
 */
public class Dept {

    private Integer deptId;

    private String deptName;

    private List<Emp>  emps;

    public Dept(Integer depId, String deptName) {
        this.deptId = depId;
        this.deptName = deptName;
    }

    public List<Emp> getEmps() {
        return emps;
    }

    public void setEmps(List<Emp> emps) {
        this.emps = emps;
    }

    public Dept() {
    }

    public Integer getDepId() {
        return deptId;
    }

    public void setDepId(Integer depId) {
        this.deptId = depId;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    @Override
    public String toString() {
        return "Dept{" +
                "deptId=" + deptId +
                ", deptName='" + deptName + '\'' +
                ", emps=" + emps +
                '}';
    }
}
