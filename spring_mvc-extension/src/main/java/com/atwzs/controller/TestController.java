package com.atwzs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @ClassName TestController
 * @Description
 * @Author WangZhisheng
 * @Date 22:20 2022/11/18
 * @Version 11.0.15
 */
@Controller
public class TestController {

    @RequestMapping("/test/hello")
    public String testHello(){
        System.out.println(1/0);
        return "success";
    }
}

