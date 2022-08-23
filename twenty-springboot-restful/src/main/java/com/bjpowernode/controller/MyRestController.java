package com.bjpowernode.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * @Author 临渊
 * @Date 2022-08-23 8:16
 */

@Controller
public class MyRestController {

    // 学习注解的使用

    // 查询id = 1001 的学生

    /**
     * @PathVariable : 路径变量 : 获取url中的数据
     *      属性 : value : 路径变量名
     *      位置 : 放在控制方法的形参前面
     *  http://localhost:8080/myboot/student/1002
     */
    @GetMapping("/student/{stuId}")
    @ResponseBody
    public String queryStudent(@PathVariable(value = "stuId") Integer studentId) {
        return "查询学生studentId = " + studentId;
    }
    /**
     * 创建资源 Post请求方式
     *  http://localhost:8080/myboot/student/zhangsan/17
     */

    @PostMapping("/student/{name}/{age}")
    @ResponseBody
    public String createStudent(@PathVariable(value = "name") String name,
                                @PathVariable(value = "age") Integer age) {
        return "创建学生student = " + name + age;
    }

    /**
     * 更新资源
     *  当路径变量名和形参名一样 @PathVariable的value可以省略
     */
    @PutMapping("/student/{id}/{age}")
    @ResponseBody
    public String modifyStudent(@PathVariable Integer id,
                                @PathVariable Integer age) {
        return "更新资源 执行put请求方式 id  age " + id + age;
    }


    /**
     * 删除学生
     */
    @DeleteMapping("/student/{id}")
    @ResponseBody
    public String removeStudent(@PathVariable Integer id) {
        return "删除学生student  id = " + id;
    }


    @PutMapping("/student/test")
    // @RequestMapping(value = "/student/test", method = RequestMethod.PUT)
    @ResponseBody
    public String test() {
        return "执行student、test  使用post  put";
    }

    @DeleteMapping("/student/testdelete")
    @ResponseBody
    public String testDelete() {
        return "执行student、test delete  ";
    }
}
