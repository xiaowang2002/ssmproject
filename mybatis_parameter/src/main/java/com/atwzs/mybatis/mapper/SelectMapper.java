package com.atwzs.mybatis.mapper;

import com.atwzs.mybatis.pojo.User;
import org.apache.ibatis.annotations.MapKey;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * @ClassName SelectMapper
 * @Description
 * @Author WangZhisheng
 * @Date 11:51 2022/11/7
 * @Version 11.0.15
 */
public interface SelectMapper {

    /**
    * @description: 根据id查询用户信息
    * @author: WangZhisheng
    * @date: 2022/11/7 11:54
    * @param: [id]
    * @return: com.atwzs.mybatis.pojo.User
    **/
    User getUserById(@Param("id") Integer id);

    /**
    * @description: 查询所有的用户信息
    * @author: WangZhisheng
    * @date: 2022/11/7 11:54
    * @param: []
    * @return: java.util.List<com.atwzs.mybatis.pojo.User>
    **/
    List<User> getAllUser();

    /*
    注意：若sql语句查询的结果为多条时，一定不能以实体类类型作为方法的返回值，可以用list集合类
    否则会抛出tooManyResultsException异常
    若sql语句查询的结果只有一条时，此时可以使用实体类类型或list集合类型作为方法的返回值
    */

    /**
    * @description: 查询用户的总数量
    * @author: WangZhisheng
    * @date: 2022/11/7 12:49
    * @param: []
    * @return: java.lang.Integer
    **/
    Integer getCount();

    /**
    * @description: 根据id查询用户信息为map集合，不需要用到实体类
     * 查询的结果没有对应的实体类的时候，就可以使用Map集合。
    * @author: WangZhisheng
    * @date: 2022/11/7 13:05
    * @param: [id]
    * @return: java.util.Map<java.lang.String,java.lang.Object>
    **/
    Map<String,Object> getUserByIdToMap(@Param("id") Integer id);

    /**
    * @description: 查询所有的用户信息为map集合
     * 若查询的数据有多条时，并且要将每条数据转换为map集合，此时有两种方法
     * 1.将mapper接口方法的返回值设置为泛型是map的list集合
     * List<Map<String,Object>> getAllUserToMap();
     * 注意：就算是返回list，resultType也是map
     * 2.可以将每条数据转换的map集合放在一个大的map中，但是必须要通过@MapKey注解将查询的某个字段的值作为大的map的键
     * @MapKey("id")
     *     Map<String, Object> getAllUserToMap();
    * @author: WangZhisheng
    * @date: 2022/11/7 13:26
    * @param: []
    * @return: java.util.Map<java.lang.String,java.lang.Object>
    **/
    List<Map<String,Object>> getAllUserToMap();
//    @MapKey("id")
//    Map<String,Object> getAllUserToMap();
}
