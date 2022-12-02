package com.atwzs.mybatis.mapper;

import com.atwzs.mybatis.pojo.Detect;
import com.atwzs.mybatis.pojo.Kind;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @ClassName DetectMapper
 * @Description
 * @Author WangZhisheng
 * @Date 11:11 2022/11/21
 * @Version 11.0.15
 */
public interface DetectMapper {

    /**
    * @description: 根据id查询用户id
    * @author: WangZhisheng
    * @date: 2022/11/21 11:13
    * @param: [id]
    * @return: com.atwzs.mybatis.pojo.Detect
    **/
    Detect getDetectById(Integer id);

    /**
    * @description: 根据id查询人物以及他的阵容信息
    * @author: WangZhisheng
    * @date: 2022/11/21 13:12
    * @param: [id]
    * @return: com.atwzs.mybatis.pojo.Detect
    **/
    Detect getDetectAndKindById(@Param("id") Integer id);

    /**
    * @description: 通过分步查询获取人物以及阵容信息，第一步：获取人物信息
    * @author: WangZhisheng
    * @date: 2022/11/21 14:09
    * @param: [id]
    * @return: com.atwzs.mybatis.pojo.Detect
    **/
    Detect getDetectByIdStepOne(@Param("id") Integer id);
    /**
    * @description: 通过分步查询获取人物以及阵容信息，第一步：获取人物阵容信息
    * @author: WangZhisheng
    * @date: 2022/11/21 14:18
    * @param: [kind]
    * @return: com.atwzs.mybatis.pojo.Kind
    **/
    Kind getDetectByIdStepTwo(@Param("kind") String kind);

    /**
    * @description: 通过collection获取阵容以及阵容内的人物
    * @author: WangZhisheng
    * @date: 2022/11/21 14:49
    * @param: [id]
    * @return: com.atwzs.mybatis.pojo.Kind
    **/
    Kind getKindAndDetectById(@Param("kind") String kind);

    /**
    * @description: 通过分步查询获取阵容
    * @author: WangZhisheng
    * @date: 2022/11/21 15:33
    * @param: [mean]
    * @return: com.atwzs.mybatis.pojo.Kind
    **/
    Kind getKindAndDetectByStepOne(@Param("mean") String mean);

    /**
    * @description: 通过分步查询获取人物
    * @author: WangZhisheng
    * @date: 2022/11/21 15:42
    * @param: [kind]
    * @return: com.atwzs.mybatis.pojo.Detect
    **/
    Detect getKindAndDetectByStepTwo(@Param("kind") String kind);

    /**
    * @description: 根据id和名字查询人物信息
    * @author: WangZhisheng
    * @date: 2022/11/21 16:13
    * @param: [id, name]
    * @return: com.atwzs.mybatis.pojo.Detect
    **/
    List<Detect> getDetectByIdAndName(@Param("id") Integer id,@Param("name") String name);

    /**
    * @description: 批量删除1
    * @author: WangZhisheng
    * @date: 2022/11/21 18:59
    * @param: [ints]
    * @return: void
    **/
    void deleteDetectManyOne(@Param("ids") Integer[] ids);
}
