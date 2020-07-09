package com.xlccc.prototype;

/**
 * @author Linker
 * @date 2020/7/10 0:44
 * @Description：创建扩展抽象类的实体类
 */
public class Snake extends Animal {
    public Snake() {
        type = "Snake";
    }

    @Override
    void birth() {
        System.out.println("Snake : Birth()");
    }
}
