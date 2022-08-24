package com.bjpowernode.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @Author 临渊
 * @Date 2022-08-24 12:53
 */

@Controller
public class HelloController {


    @RequestMapping("/hello")
    public ModelAndView hello() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("data", "SpringBoot打包为jar");
        modelAndView.setViewName("main");
        return modelAndView;
    }
}
