package com.xlccc.prototype;

/**
 * @author Linker
 * @date 2020/7/10 0:43
 * @Description：创建扩展抽象类的实体类
 */
public class Cat extends Animal {
    public Cat() {
        type = "Cat";
    }

    @Override
    void birth() {
        System.out.println("Cat : Birth() ");
    }
}
