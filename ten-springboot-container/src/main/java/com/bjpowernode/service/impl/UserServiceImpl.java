package com.bjpowernode.service.impl;

import com.bjpowernode.service.UserService;
import org.springframework.stereotype.Service;

/**
 * @Author 临渊
 * @Date 2022-08-21 14:15
 */

@Service("userService")
public class UserServiceImpl implements UserService {

    @Override
    public void sayHello(String name) {
        System.out.println("执行了业务方法的sayHello + " + name);
    }
}
