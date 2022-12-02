package com.atwzs.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * @ClassName TestAttributeObject
 * @Description
 * @Author WangZhisheng
 * @Date 18:08 2022/11/26
 * @Version 11.0.15
 */
@Controller
public class TestAttributeObject {

    @RequestMapping("/testRequestAttribute")
    public String testRequestAttribute(HttpServletRequest request) {
        request.setAttribute("testRequestAttribute", "hello requestAttribute");
        return "success";
    }

    @RequestMapping("/testModelAndView")
    public ModelAndView testModelAndView() {
        /*
         * ModelAndView有Model和View的功能
         * Model主要用于向请求域共享数据
         * View主要用于设置视图，实现页面跳转
         */
        ModelAndView mav = new ModelAndView();
//        向request域中共享数据
        mav.addObject("testScope", "hello ModelAndView");
//        设置视图
        mav.setViewName("success");
        return mav;
    }

    @RequestMapping("/testModel")
    public String testModel(Model model){
        model.addAttribute("testModel","hello Model");
        return "success";
    }

    @RequestMapping("/testSession")
    public String testSession(HttpSession session){
        session.setAttribute("testSession","hello Session");
        return "success";
    }

    @RequestMapping("/testApplication")
    public String testApplication(HttpSession session){
        ServletContext application = session.getServletContext();
        application.setAttribute("testApplication","hello Application");
        return "success";
    }
}
