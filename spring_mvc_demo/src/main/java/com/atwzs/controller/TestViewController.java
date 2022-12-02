package com.atwzs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @ClassName TestViewController
 * @Description
 * @Author WangZhisheng
 * @Date 10:59 2022/11/17
 * @Version 11.0.15
 */
@Controller
public class TestViewController {

    @RequestMapping("/test/view/thymeleaf")
    public String testThymeleafView(){
        return "success";
    }

    @RequestMapping("/test/view/forward")
    public String testInternalResourceView(){
        return "forward:/test/model";
    }

    @RequestMapping("/test/view/redirect")
    public String testRedirectView(){
        return "redirect:/test/model";
    }
}
