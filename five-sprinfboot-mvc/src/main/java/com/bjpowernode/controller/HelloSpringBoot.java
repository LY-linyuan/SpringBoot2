package com.bjpowernode.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author 临渊
 * @Date 2022-08-20 9:55
 */

@Controller
public class HelloSpringBoot {


    @RequestMapping("/hello")
    @ResponseBody
    public String helloSpringBoot() {
        return "欢迎使用SpringBoot框架";
    }
}
