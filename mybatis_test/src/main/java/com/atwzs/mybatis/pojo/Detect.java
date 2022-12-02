package com.atwzs.mybatis.pojo;

/**
 * @ClassName Detect
 * @Description
 * @Author WangZhisheng
 * @Date 11:09 2022/11/21
 * @Version 11.0.15
 */
public class Detect {

    private Integer id;

    private String name;

    private String gender;

    private String kind;

    private Kind kinds;

    public Detect() {
    }

    public Detect(Integer id, String name, String gender, String kind, Kind kinds) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.kind = kind;
        this.kinds = kinds;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public Kind getKinds() {
        return kinds;
    }

    public void setKinds(Kind kinds) {
        this.kinds = kinds;
    }

    @Override
    public String toString() {
        return "Detect{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", kind='" + kind + '\'' +
                ", kinds=" + kinds +
                '}';
    }
}
