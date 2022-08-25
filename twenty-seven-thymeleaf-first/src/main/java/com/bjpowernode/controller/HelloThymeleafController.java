package com.bjpowernode.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * @Author 临渊
 * @Date 2022-08-24 22:08
 */

@Controller
public class HelloThymeleafController {

    @GetMapping("/hello")
    public String helloThymeleaf(Model model, HttpServletRequest request) {
        // 添加数据到request作用域, 模板引擎可以从request中获取数据
        request.setAttribute("data", "欢迎使用Thymeleaf模板引擎");
        // 使用model来存放数据
        model.addAttribute("data2", "model中的数据");
        // 指定视图 (模板引擎使用的(html))
        // 逻辑名称
        return  "hello";
    }
}
