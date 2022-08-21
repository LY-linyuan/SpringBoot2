package com.bjpowernode;

import com.bjpowernode.vo.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class FiveSprinfbootMvcApplication {

    public static void main(String[] args) {
        SpringApplication.run(FiveSprinfbootMvcApplication.class, args);
    }

    // 声明对象, 对象注入到容器
    @Bean
    public Student myStudent() {
        return new Student();
    }
}
