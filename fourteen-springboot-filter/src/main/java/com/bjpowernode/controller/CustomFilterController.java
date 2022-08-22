package com.bjpowernode.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * @Author 临渊
 * @Date 2022-08-22 11:00
 */

@Controller
public class CustomFilterController {

    @RequestMapping("/user/account")
    @ResponseBody
    public String userAccount() {
        return "/user/account";
    }

    @RequestMapping("/query")
    @ResponseBody
    public String queryAccount() {
        return "/query";
    }
}
