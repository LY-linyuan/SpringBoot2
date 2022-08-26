package com.bjpowernode.vo;

/**
 * @Author 临渊
 * @Date 2022-08-26 13:03
 */
public class Cat {

    private String name;

    @Override
    public String toString() {
        return "Cat{" +
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
