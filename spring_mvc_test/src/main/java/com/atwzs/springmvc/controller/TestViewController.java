package com.atwzs.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @ClassName TestViewController
 * @Description
 * @Author WangZhisheng
 * @Date 20:26 2022/11/26
 * @Version 11.0.15
 */
@Controller
public class TestViewController {

    @RequestMapping("/testForward")
    public String testForward(){
        return "forward:/testModel";
    }

    @RequestMapping("/testRedirect")
    public String testRedirect(){
        return "redirect:/testModel";
    }
}
