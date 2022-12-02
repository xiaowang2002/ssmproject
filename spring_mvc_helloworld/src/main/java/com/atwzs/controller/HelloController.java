package com.atwzs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @ClassName HelloController
 * @Description
 * @Author WangZhisheng
 * @Date 8:40 2022/11/16
 * @Version 11.0.15
 */
@Controller
public class HelloController {

    //处理请求的方法
    @RequestMapping("/") //此时的"/"被服务器解析成localhost:8080/上下文路径/,我们要处理这个地址的请求
    public String protal(){
        //将逻辑视图返回
        return "index";
    }

    @RequestMapping("/hello")
    public String hello(){
        return "success";
    }
}
