package com.xlccc.abstract_factory;

/**
 * @author Linker
 * @date 2020/7/9 20:34
 * @Description:实现接口的实体类
 */
public class Snake implements Animal {
    @Override
    public void birth() {
        System.out.println("Init Snake :: Animal Birth");
    }
}
