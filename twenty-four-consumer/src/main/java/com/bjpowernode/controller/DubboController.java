package com.bjpowernode.controller;

import com.bjpoernode.model.Student;
import com.bjpoernode.service.StudentService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author 临渊
 * @Date 2022-08-24 8:34
 */

@RestController
public class DubboController {

    /**
     * 引用远程服务, 吧创建好的代理对象, 注入到studentService
     */
    // @DubboReference(interfaceClass = StudentService.class, version = "1.0.0")
    /**
     * 没有使用interfaceClass, 默认的就是 赢用类型的数据类型
      */
    @DubboReference(version = "1.0.0")
    private StudentService studentService;

    @GetMapping("/query")
    public String queryStudent(Integer id) {
        Student student = studentService.queryStudent(id);
        return "调用远程接口来获取对象 : " + student;
    }
}
