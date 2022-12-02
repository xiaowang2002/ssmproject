package com.atwzs.springmvc.controller;

import com.atwzs.springmvc.dao.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @ClassName TestAjaxController
 * @Description
 * @Author WangZhisheng
 * @Date 9:00 2022/11/28
 * @Version 11.0.15
 */
@Controller
public class TestAjaxController {

    @RequestMapping(value = "/test/requestBody",method = RequestMethod.POST)
    public String testRequestBody(@RequestBody String body){
        System.out.println(body);
        return "success";
    }

    @RequestMapping(value = "/test/ajax",method = RequestMethod.POST)
    public void testAjax(Integer id,HttpServletResponse response,@RequestBody String body) throws IOException {    //因为是局部刷新，不能有返回值
        System.out.println(id);   //输出请求参数
        System.out.println(body);  //输出json格式
        response.getWriter().write("hello axios");
    }

    /*@RequestMapping(value = "/test/requestBody/jsonTest",method = RequestMethod.POST)
    public void testRequestBodyOne(@RequestBody User user,HttpServletResponse response) throws IOException {
        System.out.println(user);
        response.getWriter().write("hello requestBody");
    }*/

    @RequestMapping(value = "/test/requestBody/jsonTest",method = RequestMethod.POST)
    public void testRequestBodyOne(@RequestBody Map<String,Object> map, HttpServletResponse response) throws IOException {
        System.out.println(map);
        response.getWriter().write("hello requestBody");
    }

    /*@RequestMapping(value = "/test/ResponseBody/jsonTest",method = RequestMethod.POST)
    public String testResponseBody(){
        return "success";
    }*/

    /*@RequestMapping(value = "/test/ResponseBody/jsonTest",method = RequestMethod.POST)
    @ResponseBody
    public String testResponseBody(){
        return "success";
    }*/

    //响应浏览器list集合
    @RequestMapping("/test/ResponseBody/jsonTest")
    @ResponseBody
    public List<User> testResponseBody(){
        User user1 = new User(1001,"admin1","123456",23,"男");
        User user2 = new User(1002,"admin2","123456",23,"男");
        User user3 = new User(1003,"admin3","123456",23,"男");
        return Arrays.asList(user1, user2, user3);
    }

    @RequestMapping("/test/ResponseBody/json")
    @ResponseBody
    public Map<String, Object> testResponseBody2(){
        User user1 = new User(1001,"admin1","123456",23,"男");
        User user2 = new User(1002,"admin2","123456",23,"男");
        User user3 = new User(1003,"admin3","123456",23,"男");
        Map<String, Object> map = new HashMap<>();
        map.put("1001", user1);
        map.put("1002", user2);
        map.put("1003", user3);
        return map;
    }
}
