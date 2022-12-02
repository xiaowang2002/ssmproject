package com.atwzs.controller;

import com.atwzs.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * @ClassName HelloController
 * @Description
 * @Author WangZhisheng
 * @Date 16:41 2022/11/29
 * @Version 11.0.15
 */
@Controller
public class HelloController {

    @Autowired
    private HelloService helloService;
}
