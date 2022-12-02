package com.atwzs.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @ClassName HelloController
 * @Description
 * @Author WangZhisheng
 * @Date 22:03 2022/11/25
 * @Version 11.0.15
 */
@Controller
public class HelloController {

    @RequestMapping("/hello")
    public String helloWorld(){
        return "success";
    }
}
