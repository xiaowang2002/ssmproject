package com.atwzs.spring.pojo;

import java.util.List;

/**
 * @ClassName Clazz
 * @Description
 * @Author WangZhisheng
 * @Date 16:56 2022/11/22
 * @Version 11.0.15
 */
public class Clazz {

    private Integer clazzId;

    private String clazzName;

    private List<Student> students;

    public Clazz() {
    }

    public Clazz(Integer clazzId, String clazzName) {
        this.clazzId = clazzId;
        this.clazzName = clazzName;
    }

    public Clazz(Integer clazzId, String clazzName, List<Student> students) {
        this.clazzId = clazzId;
        this.clazzName = clazzName;
        this.students = students;
    }

    public Integer getId() {
        return clazzId;
    }

    public void setClazzId(Integer clazzId) {
        this.clazzId = clazzId;
    }

    public String getClazzName() {
        return clazzName;
    }

    public Integer getClazzId() {
        return clazzId;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public void setClazzName(String clazzName) {
        this.clazzName = clazzName;
    }

    @Override
    public String toString() {
        return "Clazz{" +
                "clazzId=" + clazzId +
                ", clazzName='" + clazzName + '\'' +
                ", students=" + students +
                '}';
    }
}
