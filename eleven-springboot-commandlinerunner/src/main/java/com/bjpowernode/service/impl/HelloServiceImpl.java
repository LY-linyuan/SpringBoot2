package com.bjpowernode.service.impl;

import com.bjpowernode.service.HelloService;
import org.springframework.stereotype.Service;

/**
 * @Author 临渊
 * @Date 2022-08-22 9:54
 */

@Service
public class HelloServiceImpl implements HelloService {
    @Override
    public String sayHello(String name) {
        return "您好 : " + name;
    }
}
