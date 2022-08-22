package com.bjpowernode.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author 临渊
 * @Date 2022-08-22 10:23
 */

@Controller
public class BootController {

    @RequestMapping("/user/account")
    @ResponseBody
    public String userAccount() {
        return "访问use/account地址";
    }

    @RequestMapping("/user/login")
    @ResponseBody
    public String userLogin() {
        return "访问use/login地址";
    }
}
