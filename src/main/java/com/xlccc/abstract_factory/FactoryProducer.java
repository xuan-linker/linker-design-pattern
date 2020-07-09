package com.xlccc.abstract_factory;

/**
 * @author Linker
 * @date 2020/7/9 22:55
 * @Description：创建工厂的构造器/生成器，通过信息创建指定工厂
 */
public class FactoryProducer {
    public static AbstractFactory getFactory(String choice) {
        if (choice.equalsIgnoreCase("PEOPLE")) {
            return new PeopleFactory();
        } else if (choice.equalsIgnoreCase("ANIMAL")) {
            return new AnimalFactory();
        }
        return null;
    }

}
