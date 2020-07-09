package com.xlccc.abstract_factory;

/**
 * @author Linker
 * @date 2020/7/9 20:32
 * @Description:实现接口的实体类
 */
public class Cat implements Animal {
    @Override
    public void birth() {
        System.out.println("Init Cat :: Animal Birth");
    }
}
