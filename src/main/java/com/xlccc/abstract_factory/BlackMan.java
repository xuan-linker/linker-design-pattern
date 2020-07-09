package com.xlccc.abstract_factory;

/**
 * @author Linker
 * @date 2020/7/9 22:46
 * @Description:实现接口的实体类
 */
public class BlackMan implements People {
    @Override
    public void Say() {
        System.out.println("Hello : Black People");
    }
}
