package com.atwzs.springmvc.controller;

import com.fasterxml.jackson.annotation.JsonCreator;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @ClassName TestInterceptor
 * @Description
 * @Author WangZhisheng
 * @Date 17:43 2022/11/28
 * @Version 11.0.15
 */
@ControllerAdvice
public class TestInterceptor {

    //表示异常处理的方法
    @ExceptionHandler(ArithmeticException.class)
    //ex表示当前处理异常中出现的异常对象
    public String testException(Throwable ex, Model model) {
        model.addAttribute("ex", ex);
        return "error";
    }
}
