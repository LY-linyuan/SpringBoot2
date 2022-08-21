package com.bjpowernode.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * @Author 临渊
 * @Date 2022-08-21 10:27
 */

@Controller
public class BootController {

    @RequestMapping("/hello")
    @ResponseBody
    public String doSome(HttpServletRequest request) {
        return "SpringBoot多环境配置" + request.getContextPath();
    }
}
