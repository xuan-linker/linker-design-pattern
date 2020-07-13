package com.xlccc.decorator;

/**
 * @author Linker
 * @date 2020/7/13 11:22
 * @Description:实现接口的实体类 2-3
 */
public class Dog implements Animal {
    @Override
    public void say() {
        System.out.println("Animal: Dog -> WangWang");
    }
}
