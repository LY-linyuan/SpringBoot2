package com.bjpowernode.controller;

import com.bjpowernode.vo.SchoolInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * @Author 临渊
 * @Date 2022-08-21 12:22
 */

@Controller
public class HelloController {

    @Value("${server.port}")
    private Integer port;

    @Value("${server.servlet.context-path}")
    private String contextPath;


    @Value("${like.name}")
    private String name;

    @Value("${like.website}")
    private String website;

    @Value("${like.address}")
    private String address;

    @Value("${site}")
    private String site;

    @Resource
    private SchoolInfo schoolInfo;

    @RequestMapping("/data")
    @ResponseBody
    public String queryData() {
        return "port = " + port + " contextPath = " + contextPath +
                " name = " + name + " website = " + website + " address = " + address +
                " site = " + site;
    }

    @RequestMapping("/info")
    @ResponseBody
    public String queryInfo() {
        return "SchoolInfo = " + schoolInfo.toString();
    }
}
