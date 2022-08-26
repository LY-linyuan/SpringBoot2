package com.bjpowernode.vo;

/**
 * @Author 临渊
 * @Date 2022-08-26 13:04
 */
public class Dog {

    String name;

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
