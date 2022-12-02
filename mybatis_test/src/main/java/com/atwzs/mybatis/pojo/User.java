package com.atwzs.mybatis.pojo;

/**
 * @ClassName User
 * @Description
 * @Author WangZhisheng
 * @Date 20:29 2022/11/20
 * @Version 11.0.15
 */
public class User {

    private Integer userId;

    private String userName;

    private Integer balance;

    public User() {
    }

    public User(Integer userId, String userName, Integer balance) {
        this.userId = userId;
        this.userName = userName;
        this.balance = balance;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Integer getBalance() {
        return balance;
    }

    public void setBalance(Integer balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", balance=" + balance +
                '}';
    }
}
