package com.xlccc.facade;

/**
 * @author Linker
 * @date 2020/7/13 13:37
 */
public class Cow implements Animal{
    @Override
    public void say() {
        System.out.println("Animal : Cow -> mu mu");
    }
}
