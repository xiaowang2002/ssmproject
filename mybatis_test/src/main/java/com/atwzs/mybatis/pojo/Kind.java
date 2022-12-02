package com.atwzs.mybatis.pojo;

import java.util.List;

/**
 * @ClassName Kind
 * @Description
 * @Author WangZhisheng
 * @Date 13:08 2022/11/21
 * @Version 11.0.15
 */
public class Kind {

    private String kind;

    private String mean;

    private List<Detect> detects;

    public Kind() {
    }

    public Kind(String kind, String mean, List<Detect> detects) {
        this.kind = kind;
        this.mean = mean;
        this.detects = detects;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public String getMean() {
        return mean;
    }

    public void setMean(String mean) {
        this.mean = mean;
    }

    public List<Detect> getDetects() {
        return detects;
    }

    public void setDetects(List<Detect> detects) {
        this.detects = detects;
    }

    @Override
    public String toString() {
        return "Kind{" +
                "kind='" + kind + '\'' +
                ", mean='" + mean + '\'' +
                ", detects=" + detects +
                '}';
    }
}
