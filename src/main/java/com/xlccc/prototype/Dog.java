package com.xlccc.prototype;

/**
 * @author Linker
 * @date 2020/7/10 0:42
 * @Description：创建扩展抽象类的实体类
 */
public class Dog extends Animal {
    public Dog() {
        type = "Dog";
    }

    @Override
    void birth() {
        System.out.println("Dog :: Birth()");
    }
}
