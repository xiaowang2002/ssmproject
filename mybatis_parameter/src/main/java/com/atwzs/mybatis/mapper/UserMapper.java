package com.atwzs.mybatis.mapper;

import com.atwzs.mybatis.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.Map;

/**
 * @ClassName UserMapper
 * @Description none
 * @Author WangZhisheng
 * @Date 17:11 2022/11/6
 * @Version 11.0.15
 */
public interface UserMapper {

    /**
    * @description: MyBatis获取参数值的两种方式：#{}和${},#{}的本质是占位符赋值，${}的本质是字符串拼接
     * 若mapper接口的方法的参数为单个的字面量类型，此时在映射文件中可以通过#{}和${}以任意的内容获取参数值（建议用参数名获取，见名知意），一定要注意${}的单引号问题
    * @author: WangZhisheng
    * @date: 2022/11/6 17:32
    * @param: [username]
    * @return: com.atwzs.mybatis.pojo.User
    **/
    User getUserByUsername(String username);   //根据用户名查找用户信息

    /**
    * @description: 若mapper接口方法的参数为多个的字面量类型，此时mybatis会将参数放在map集合中，以两种方式存储数据
     * 1.以arg0,arg1,...为键，以参数为值
     * 2.以param1,param2,...为键，以参数为值
     * 因此在映射文件中只需要通过#{}和${}访问map集合的键，就可以获取相应的值
    * @author: WangZhisheng
    * @date: 2022/11/6 17:22
    * @param: [username, password]
    * @return: com.atwzs.mybatis.pojo.User
    **/
    User checkLogin(String username,String password);

    /**
    * @description: 以map集合作为参数，若mapper接口方法的参数为map集合类型的参数，在映射文件中就可以以我们自己设置的键获取相对应的值，
     * 一定要注意${}的单引号问题，
    * @author: WangZhisheng
    * @date: 2022/11/6 19:12
    * @param: [map]
    * @return: com.atwzs.mybatis.pojo.User
    **/
    User checkLoginByMap(Map<String,Object> map);

    /**
    * @description: 若mapper接口方法的参数为实体类类型的参数
     * 在映射文件中只需要通过#{}和${}访问实体类中的属性名，就可以获取相对应的属性值，一定要注意${}的单引号问题，
     * 冷知识：注意实体类中的属性名不等于全员变量，是get,set方法去掉get,set后小写的单词
    * @author: WangZhisheng
    * @date: 2022/11/6 19:44
    * @param: [user]
    * @return: void
    **/
    void insertUser(User user);

    /**
    * @description: 可以在mapper接口方法的参数上设置@Param注解，此时mybatis会将这些参数以两种方式进行存储
     * 1.以@Param注解的value属性值为键，以参数为值
     * 2.以param1,param2,...为键，以参数为值
     * 在映射文件中只需要通过#{}和${}访问实体类中的属性名，就可以获取相对应的属性值，一定要注意${}的单引号问题，
    * @author: WangZhisheng
    * @date: 2022/11/6 19:58
    * @param: [username, password]
    * @return: com.atwzs.mybatis.pojo.User
    **/
    User checkLoginByParam(@Param("username") String username,@Param("password") String password);
}
