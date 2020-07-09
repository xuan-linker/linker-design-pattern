package com.xlccc.abstract_factory;

/**
 * @author Linker
 * @date 2020/7/9 22:50
 * @Description:为People和Animal对象创建抽象类来获取工厂
 */
public abstract class AbstractFactory {
    public abstract People getPeople(String people);

    public abstract Animal getAnimal(String animal);
}
