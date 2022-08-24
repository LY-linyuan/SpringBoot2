package com.bjpoernode.model;

import java.io.Serializable;

/**
 * @Author 临渊
 * @Date 2022-08-24 7:51
 */
public class Student implements Serializable {

    private static final long serialVersionUID = 4014961170715483361L;

    private Integer id;
    private String name;
    private Integer age;



    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
