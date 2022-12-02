package com.atwzs.mybatis.pojo;

/**
 * @ClassName Phone
 * @Description
 * @Author WangZhisheng
 * @Date 22:06 2022/11/20
 * @Version 11.0.15
 */
public class Phone {

    private Integer phoneId;

    private String phoneName;

    private Float phonePrice;

    private String CPU;

    private String phoneWeight;

    public Phone() {
    }

    public Phone(Integer phoneId, String phoneName, Float phonePrice, String CPU, String phoneWeight) {
        this.phoneId = phoneId;
        this.phoneName = phoneName;
        this.phonePrice = phonePrice;
        this.CPU = CPU;
        this.phoneWeight = phoneWeight;
    }

    public Integer getPhoneId() {
        return phoneId;
    }

    public void setPhoneId(Integer phoneId) {
        this.phoneId = phoneId;
    }

    public String getPhoneName() {
        return phoneName;
    }

    public void setPhoneName(String phoneName) {
        this.phoneName = phoneName;
    }

    public Float getPhonePrice() {
        return phonePrice;
    }

    public void setPhonePrice(Float phonePrice) {
        this.phonePrice = phonePrice;
    }

    public String getCPU() {
        return CPU;
    }

    public void setCPU(String CPU) {
        this.CPU = CPU;
    }

    public String getPhoneWeight() {
        return phoneWeight;
    }

    public void setPhoneWeight(String phoneWeight) {
        this.phoneWeight = phoneWeight;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "phoneId=" + phoneId +
                ", phoneName='" + phoneName + '\'' +
                ", phonePrice=" + phonePrice +
                ", CPU='" + CPU + '\'' +
                ", phoneWeight='" + phoneWeight + '\'' +
                '}';
    }
}
