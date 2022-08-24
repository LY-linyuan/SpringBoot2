package com.bjpowernode.service.impl;

import com.bjpoernode.model.Student;
import com.bjpoernode.service.StudentService;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.stereotype.Component;

/**
 * @Author 临渊
 * @Date 2022-08-24 8:10
 */

/**
 * 使用dubbo中的注解暴露服务
 */

// @Component  可以不用加
@DubboService(interfaceClass = StudentService.class, version = "1.0.0", timeout = 5000)
public class StudentServiceImpl implements StudentService {


    @Override
    public Student queryStudent(Integer id) {
        Student student = new Student();
        if (1001 == id) {
            student.setId(1001);
            student.setName("=== 1001-T ===");
            student.setAge(17);
        } else if (1002 == id){
            student.setId(1002);
            student.setName("*** 1002-T ***");
            student.setAge(17);
        }
        return student;
    }
}
