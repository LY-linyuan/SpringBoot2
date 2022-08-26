package com.bjpowernode.vo;

/**
 * @Author 临渊
 * @Date 2022-08-26 13:05
 */
public class Zoo {

    private Cat cat;
    private Dog dog;

    @Override
    public String toString() {
        return "Zoo{" +
                "cat=" + cat +
                ", dog=" + dog +
                '}';
    }

    public Cat getCat() {
        return cat;
    }

    public void setCat(Cat cat) {
        this.cat = cat;
    }

    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }
}
