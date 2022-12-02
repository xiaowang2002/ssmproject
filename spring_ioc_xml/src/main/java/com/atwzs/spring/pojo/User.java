package com.atwzs.spring.pojo;

/**
 * @ClassName User
 * @Description
 * @Author WangZhisheng
 * @Date 14:15 2022/11/12
 * @Version 11.0.15
 */
public class User {

    private String username;

    public User() {
        System.out.println("生命周期1: 反射创建对象默认使用无参构造,实例化");
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
        System.out.println("生命周期2: 依赖注入");
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                '}';
    }

    public void initMethod() {
        System.out.println("生命周期3: 初始化");
    }

    public void destroyMethod() {
        System.out.println("生命周期4: 销毁");
    }
}
