package com.bjpowernode;

import com.bjpowernode.config.SpringConfig;
import com.bjpowernode.vo.Cat;
import com.bjpowernode.vo.Student;
import com.bjpowernode.vo.Tiger;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author 临渊
 * @Date 2022-08-18 22:58
 */
public class MyTest {

    /**
     * 使用xml作为容器配置文件
     */
    @Test
    public void test01() {
        String config = "beans.xml";
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(config);
        Student student = (Student) applicationContext.getBean("myStudent");
        System.out.println(student);
    }


    /**
     *  使用JavaConfig
     */
    @Test
    public void test02() {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfig.class);
        Student student = (Student) applicationContext.getBean("createStudent");
        System.out.println(student);
    }

    @Test
    public void test03() {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfig.class);
        Student student = (Student) applicationContext.getBean("lisiStudent");
        System.out.println(student);
    }

    @Test
    public void test04() {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfig.class);
        Cat cat = (Cat) applicationContext.getBean("myCat");
        System.out.println(cat);
    }

    @Test
    public void test05() {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfig.class);
        Tiger tiger = (Tiger) applicationContext.getBean("tiger");
        System.out.println(tiger);
    }
}
