package com.atwzs.controller;

import com.atwzs.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.UnsupportedEncodingException;

/**
 * @ClassName TestParamController
 * @Description
 * @Author WangZhisheng
 * @Date 20:15 2022/11/16
 * @Version 11.0.15
 */
@Controller
public class TestParamController {

    @RequestMapping("/hello/servletAPI")
    public String getParamByServletAPI(HttpServletRequest request) throws UnsupportedEncodingException {
        HttpSession session = request.getSession();
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        System.out.println("username: "+username+"password: "+password);
        return "success";
    }

    @RequestMapping("/param")
    public String getParam(@RequestParam(value = "userName",required = false,defaultValue = "hello") String username,
                           @RequestParam("password") String password,
                           @RequestHeader("referer") String referer,
                           @CookieValue("JSESSIONID") String jsessionId){
        System.out.println("username: "+username+"password: "+password);
        System.out.println(referer);
        System.out.println(jsessionId);
        return "success";
    }

    @RequestMapping("/param/pojo")
    public String getParamByPojo(User user){
        System.out.println(user);
        return "success";
    }

}
