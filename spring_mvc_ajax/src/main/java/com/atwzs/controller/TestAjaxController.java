package com.atwzs.controller;

import com.atwzs.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @ClassName TestAjaxController
 * @Description
 * @Author WangZhisheng
 * @Date 22:38 2022/11/17
 * @Version 11.0.15
 */
@Controller
public class TestAjaxController {

    @RequestMapping("/test/ajax")
    public void testAjax(Integer id, @RequestBody String requestBody, HttpServletResponse response) throws IOException {   //DispatcherServlet给response赋值
        System.out.println("requestBody" + requestBody);
        System.out.println("id:   " + id);
        response.getWriter().write("hello,axios");
    }

    /*//使用@RequestBody获取json格式的请求参数,有实体类接收
    @RequestMapping("/test/RequestBody/json")
    public void testRequestBody(@RequestBody User user, HttpServletResponse response) throws IOException {
        System.out.println(user);
        response.getWriter().write("RequestBody");
    }*/

    @RequestMapping("/test/RequestBody/json")
    public void testRequestBody(@RequestBody Map<String, Object> map, HttpServletResponse response) throws IOException {
        System.out.println(map);
        response.getWriter().write("RequestBody");
    }

    @RequestMapping("/test/ResponseBody")
    @ResponseBody
    public String testResponseBody() {
        return "success";
    }

    @RequestMapping("/test/ResponseBody/json")
    @ResponseBody
    public Map<String, Object> testResponseBodyJson() {
        User user1 = new User(1001, "admin1", "1234546", 34, "女");
        User user2 = new User(1001, "admin2", "1234546", 34, "女");
        User user3 = new User(1001, "admin3", "1234546", 34, "女");
        Map<String, Object> map =new HashMap<>();
        map.put("1001",user1);
        map.put("1002",user2);
        map.put("1003",user3);
        return map;
    }
    /*public User testResponseBodyJson(){
        User user = new User(1001,"admin","1234546",34,"女");
        return user;
    }*/

}
