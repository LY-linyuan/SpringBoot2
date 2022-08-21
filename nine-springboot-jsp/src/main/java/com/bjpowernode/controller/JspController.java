package com.bjpowernode.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * @Author 临渊
 * @Date 2022-08-21 13:18
 */

@Controller
public class JspController {

    /*private String doJsp(HttpServletRequest request) {
        request.setAttribute("data", "SpringBoot使用Jsp");
        // 视图的逻辑名称
        return "index";
    }*/


    @RequestMapping("/myjsp")
    private String doJsp(Model model) {
        // 把数据放入到request作用域
        model.addAttribute("data", "SpringBoot使用Jsp");
        // request.setAttribute("data", "SpringBoot使用Jsp");
        // 视图的逻辑名称
        return "index";
    }
}
