package com.xlccc.decorator;

/**
 * @author Linker
 * @date 2020/7/13 11:23
 * @Description:实现接口的实体类 2-1
 */
public class Cat implements Animal {
    @Override
    public void say() {
        System.out.println("Animal : Cat -> mm");
    }
}
