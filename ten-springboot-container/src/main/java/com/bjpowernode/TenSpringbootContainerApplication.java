package com.bjpowernode;

import com.bjpowernode.service.UserService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class TenSpringbootContainerApplication {

    public static void main(String[] args) {

        // 获取容器对象
        ApplicationContext applicationContext = SpringApplication.run(TenSpringbootContainerApplication.class, args);

        // 从容器中获取对象
        UserService userService = (UserService) applicationContext.getBean("userService");
        userService.sayHello("T");
    }

}
