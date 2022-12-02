package com.atwzs.springmvc.controller;

import com.atwzs.springmvc.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * @ClassName RequestMappingController
 * @Description
 * @Author WangZhisheng
 * @Date 10:50 2022/11/26
 * @Version 11.0.15
 */
@Controller
//@RequestMapping("/test")
public class RequestMappingController {

    //    @RequestMapping(value = "/testRequestMapping",method = {RequestMethod.GET,RequestMethod.POST})
    @RequestMapping(value = {"/param"},
            params = {"username", "password=123456"})
    public String testRequestMapping() {
        return "success";
    }

        @RequestMapping(value = "/**/ant")
//    @RequestMapping(value = "/aa?/test/ant")
    public String testRequestMappingTwo() {
        return "success";
    }

    @RequestMapping(value ="/test/{id}/{username}" )
    public String testRest(@PathVariable("id") Integer id,@PathVariable("username") String name){
        System.out.println("id:"+id+",name:"+name);
        return "success";
    }

    @PostMapping("/testpojo")
    public String testPojo(User user){
        System.out.println(user);
        return "success";
    }
}
