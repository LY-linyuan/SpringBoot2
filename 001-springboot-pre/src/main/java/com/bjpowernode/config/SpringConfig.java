package com.bjpowernode.config;

import com.bjpowernode.vo.Student;
import org.springframework.context.annotation.*;

/**
 * @Author 临渊
 * @Date 2022-08-18 23:03
 */

/**
 *  Configuration : 表示当前类是作为配置文件使用的, 就是用来配置容器的
 *      位置 : 在类的上面
 *
 *      SpringConfig这个类就相当于 beans.xml
 */
@Configuration
@ImportResource(value = {"classpath:applicationContext.xml", "classpath:beans.xml"})
@PropertySource(value = "classpath:config.properties")
@ComponentScan(basePackages = "com.bjpowernode.vo")
public class SpringConfig {

    /**
     * 创建方法, 方法的返回值是对象 在方法的上面加入@Bean
     *          方法的返回值对象就注入到容器中
     *
     *   @Bean 把对象注入到spring容器中, 作业相当于<bean></bean>
     *         位置 : 方法的上面
     *
     *         说明 : @Bean 如果不指定对象的名称 默认方法名是 id
     *
     */

    @Bean
    public Student createStudent() {
        Student student = new Student();
        student.setName("张三");
        student.setAge(20);
        student.setSex("男");
        return student;
    }

    /**
     * 指定对象在容器中的名称 (指定<bean>的id属性)
     *     @Bean 的 name 属性, 指定对象的名称 (id)
     */

    @Bean(name = "lisiStudent")
    public Student makeStudent() {
        Student student = new Student();
        student.setName("李四");
        student.setAge(25);
        student.setSex("男");
        return student;
    }



}
