package com.atwzs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

/**
 * @ClassName ExceptionController
 * @Description
 * @Author WangZhisheng
 * @Date 10:19 2022/11/19
 * @Version 11.0.15
 */
//将当前类标识为异常处理的组件
@ControllerAdvice
public class ExceptionController {

    @ExceptionHandler(ArithmeticException.class)
    public String handleException(Throwable ex,Model model){
        model.addAttribute("ex",ex);
        return "error";
    }
}
