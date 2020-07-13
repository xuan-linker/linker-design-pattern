package com.xlccc.decorator;

/**
 * @author Linker
 * @date 2020/7/13 11:24
 * @Description:实现接口的实体类 2-2
 */
public class Cow implements Animal {
    @Override
    public void say() {
        System.out.println("Animal : Cow -> Mu Mu");
    }
}
