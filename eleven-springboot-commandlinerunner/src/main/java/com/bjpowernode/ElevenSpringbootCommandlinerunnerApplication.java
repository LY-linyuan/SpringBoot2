package com.bjpowernode;

import com.bjpowernode.service.HelloService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.Resource;

@SpringBootApplication
public class ElevenSpringbootCommandlinerunnerApplication implements CommandLineRunner {

    @Resource
    private HelloService helloService;

    public static void main(String[] args) {
        System.out.println("创建了容器对象");
        // 创建了容器对象
        SpringApplication.run(ElevenSpringbootCommandlinerunnerApplication.class, args);
        // 容器对象创建之后
        System.out.println("容器对象创建之后");
    }

    @Override
    public void run(String... args) throws Exception {
        String str = helloService.sayHello("T");
        System.out.println(str);
        // 可以做一些自定义的操作 读取文件  读取数据库
        System.out.println("容器对象床架好之后, 执行的方法");
    }
}
