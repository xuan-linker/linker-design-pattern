package com.xlccc.flyweight;

import java.util.HashMap;

/**
 * @author Linker
 * @date 2020/7/13 14:22
 * @Description:创建一个工厂，生成基于给定信息的实体类的对象。
 */
public class AnimalFactory {
    private static final HashMap<String, Animal> dogMap = new HashMap<>();

    public static Animal getDog(String type) {
        Dog dog = (Dog) dogMap.get(type);

        if (dog == null) {
            dog = new Dog(type);
            dogMap.put(type, dog);
            System.out.println("Create dog of type : " + type);
        }
        return dog;
    }
}
