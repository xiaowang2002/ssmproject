package com.atwzs.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Arrays;

/**
 * @ClassName TestParamController
 * @Description
 * @Author WangZhisheng
 * @Date 14:17 2022/11/26
 * @Version 11.0.15
 */
@Controller
public class TestParamController {

    @PostMapping("/param/servletAPI")
    public String testParamOne(HttpServletRequest request,String username,String password) {
        HttpSession session = request.getSession();
        /*String username = request.getParameter("username");
        String password = request.getParameter("password");*/
        System.out.println("username:" + username + ",password:" + password);
        return "success";
    }

    @RequestMapping("/test/requestParams")
    public String testParamTwo(String username, String password) {
        System.out.println("username:" + username + ",password:" + password);
//        System.out.println("username:"+ Arrays.toString(username)+",password:"+password);
        return "success";
    }

    @RequestMapping("/test/requestParamsTwo")
    public String testParamThree(@RequestParam(value = "username", required = true, defaultValue = "smqy") String name,
                                 String password,
                                 @RequestHeader(value = "referer") String referer,
                                 @CookieValue(value = "JSESSIONID") String jSessionId) {
        System.out.println("username: " + name + ",password: " + password);
        System.out.println(referer);
        System.out.println(jSessionId);
        return "success";
    }
}
