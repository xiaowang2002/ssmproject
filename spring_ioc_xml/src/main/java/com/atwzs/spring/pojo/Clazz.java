package com.atwzs.spring.pojo;

import java.util.List;

/**
 * @ClassName Clazz
 * @Description
 * @Author WangZhisheng
 * @Date 10:19 2022/11/12
 * @Version 11.0.15
 */
public class Clazz {

    private Integer cid;

    private String cname;

    private List<Student> students;

    public Clazz() {
    }

    public Clazz(Integer cid, String cname) {
        this.cid = cid;
        this.cname = cname;
    }

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    @Override
    public String toString() {
        return "Clazz{" +
                "cid=" + cid +
                ", cname='" + cname + '\'' +
                ", students=" + students +
                '}';
    }
}
