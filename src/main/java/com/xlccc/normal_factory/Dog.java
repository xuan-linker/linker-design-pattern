package com.xlccc.normal_factory;

/**
 * @author Linker
 * @date 2020/7/9 1:21
 */
public class Dog implements Animal {
    @Override
    public void birth() {
        System.out.println("Init Dog :: Animal Birth");
    }
}
