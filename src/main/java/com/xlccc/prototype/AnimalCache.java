package com.xlccc.prototype;

import java.util.Hashtable;

/**
 * @author Linker
 * @date 2020/7/10 0:45
 * @Description:创建一个类，从数据库中获取实体类，并把他们存储在一个HashTable中
 */
public class AnimalCache {
    private static Hashtable<String, Animal> animalMap
            = new Hashtable<String, Animal>();

    public static Animal getAnimal(String animalId) {
        Animal cacheAnimal = animalMap.get(animalId);

        return (Animal) cacheAnimal.clone();
    }

    //对每种Animal都运行数据库查询，并创建该Animal
    //animalMap.put(animalKey , animal)
    //例如，我们添加三种动物
    public static void loadCache() {
        Cat cat = new Cat();
        cat.setId("1");
        animalMap.put(cat.getId(), cat);

        Dog dog = new Dog();
        dog.setId("2");
        animalMap.put(dog.getId(), dog);

        Snake snake = new Snake();
        snake.setId("3");
        animalMap.put(snake.getId(), snake);
    }
}
