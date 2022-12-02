package com.atwzs.mybatis.mapper;

import com.atwzs.mybatis.pojo.Phone;
import com.atwzs.mybatis.pojo.User;
import org.apache.ibatis.annotations.MapKey;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * @ClassName PhoneMapper
 * @Description
 * @Author WangZhisheng
 * @Date 22:18 2022/11/20
 * @Version 11.0.15
 */
public interface PhoneMapper {

    /**
    * @description: 根据id查询手机
    * @author: WangZhisheng
    * @date: 2022/11/20 22:27
    * @param: []
    * @return: com.atwzs.mybatis.pojo.Phone
    **/
    Phone selectPhoneById(Integer id);

    /**
    * @description: 根据手机价格和重量查询手机
    * @author: WangZhisheng
    * @date: 2022/11/20 22:33
    * @param: []
    * @return: com.atwzs.mybatis.pojo.Phone
    **/
    Phone selectPhoneByPhoneWeightAndPhonePrice(Float price,String weight);

    /**
    * @description: 根据map集合查Phone
    * @author: WangZhisheng
    * @date: 2022/11/20 22:42
    * @param: [map]
    * @return: com.atwzs.mybatis.pojo.Phone
    **/
    Phone selectPhoneByMap(Map<String,Object> map);

    /**
    * @description: 插入一条手机数据
    * @author: WangZhisheng
    * @date: 2022/11/20 22:53
    * @param: [phone]
    * @return: void
    **/
    void insertPhone(Phone phone);

    /**
    * @description: 通过价格查询手机
    * @author: WangZhisheng
    * @date: 2022/11/21 8:14
    * @param: [price, weight]
    * @return: com.atwzs.mybatis.pojo.Phone
    **/
    Phone selectPhoneByPrice(@Param("pric")Float price,@Param("weigh") String weight);

    /**
    * @description: 通过手机名称查询手机价格
    * @author: WangZhisheng
    * @date: 2022/11/21 8:16
    * @param: [phoneName]
    * @return: java.lang.Float
    **/
    Float selectPhonePriceByPhoneName(@Param("phoneName") String phoneName);

    /**
    * @description: 查询所有手机信息
    * @author: WangZhisheng
    * @date: 2022/11/21 8:28
    * @param: []
    * @return: java.util.List<com.atwzs.mybatis.pojo.Phone>
    **/
    List<Phone> selectAllPhone();

    /**
    * @description: 查询手机类的个数
    * @author: WangZhisheng
    * @date: 2022/11/21 8:32
    * @param: []
    * @return: java.lang.Integer
    **/
    Integer getPhoneCount();

    /**
    * @description: 根据id查询手机，放进一个map集合，因为查询出来的数据没有实体类封装
    * @author: WangZhisheng
    * @date: 2022/11/21 8:51
    * @param: [id]
    * @return: java.util.Map<java.lang.String,java.lang.Object>
    **/
    Map<String,Object> getPhoneMapById(@Param("id") Integer id);

    /**
    * @description: 查询所有手机为list集合
    * @author: WangZhisheng
    * @date: 2022/11/21 8:58
    * @param: []
    * @return: java.util.List<java.util.Map<java.lang.String,java.lang.Object>>
    **/
    List<Map<String,Object>> getAllPhoneMap();

    /**
    * @description: 查询所有手机为map集合
    * @author: WangZhisheng
    * @date: 2022/11/21 9:16
    * @param: []
    * @return: java.util.Map<java.lang.String,java.lang.Object>
    **/
    @MapKey("phone_name")
    Map<String,Object> getAllPhoneToMap();

    /**
    * @description: 模糊查询一个手机
    * @author: WangZhisheng
    * @date: 2022/11/21 9:20
    * @param: [phoneName]
    * @return: java.util.Map<java.lang.String,java.lang.Object>
    **/
    @MapKey("phone_name")
    Map<String,Object> getPhoneByVaguePhoneName(@Param("phoneName") String phoneName);

    /**
    * @description: 批量添加手机数据
    * @author: WangZhisheng
    * @date: 2022/11/21 9:48
    * @param: [phoneList]
    * @return: void
    **/
    void insertManyPhone(@Param("list") List<Phone> phoneList);

    /**
    * @description: 批量删除
    * @author: WangZhisheng
    * @date: 2022/11/21 10:07
    * @param: [ids]
    * @return: void
    **/
    void deleteManyPhone(@Param("ids") String ids);

    /**
    * @description: 动态查询表中所有的数据
    * @author: WangZhisheng
    * @date: 2022/11/21 10:20
    * @param: [tableName]
    * @return: java.util.List<java.lang.Object>
    **/
    List<Phone> getAllByTableName(@Param("tableName") String tableName);


    /**
    * @description: 获取自增的主键
    * @author: WangZhisheng
    * @date: 2022/11/21 10:43
    * @param: [phone]
    * @return: void
    **/
    void insertPhoneToGetKey(@Param("phone") Phone phone);
}
