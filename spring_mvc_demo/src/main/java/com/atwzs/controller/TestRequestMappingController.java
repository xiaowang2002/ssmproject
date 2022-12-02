package com.atwzs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @ClassName TestRequestMappingController
 * @Description
 * @Author WangZhisheng
 * @Date 12:40 2022/11/16
 * @Version 11.0.15
 */
//@RequestMapping("/test")
@Controller
public class TestRequestMappingController {

    //此时控制器方法所匹配的请求路径是/test/hello
//    @RequestMapping("/hello")
    @RequestMapping(value = {"/hello","/abc"},
            method = {RequestMethod.GET,RequestMethod.POST},
//            params = {"username"},
            headers = {"referer"}
    )
    public String hello(){
        return "success";
    }

    @RequestMapping("/**/test/ant")
    public String testAnt(){
        return "success";
    }

    @RequestMapping("/test/rest/{username}/{id}")
    public String testRest(@PathVariable("id") Integer id,@PathVariable("username") String username){
        System.out.println("username:  "+username);
        System.out.println("id:  "+id);
        return "success";
    }
}
