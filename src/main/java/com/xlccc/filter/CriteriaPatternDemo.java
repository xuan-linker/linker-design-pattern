package com.xlccc.filter;


import java.util.ArrayList;
import java.util.List;

/**
 * @author Linker
 * @date 2020/7/11 18:11
 * @Description:过滤器模式（Filter Pattern）或标准模式（Criteria Pattern）
 * 允许使用不同的标准来过滤一组对象，通过逻辑运算解耦方式连接。
 * <p>
 * 结构型模式。
 */
public class CriteriaPatternDemo {
    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();

        animals.add(new Animal("Lily1", "Dog", "Dead"));
        animals.add(new Animal("Lily2", "Dog", "Dead"));
        animals.add(new Animal("Lily3", "Dog", "Dead"));
        animals.add(new Animal("Lily4", "Dog", "Dead"));
        animals.add(new Animal("Kim", "Dog", "NotDead"));
        animals.add(new Animal("Tom", "Cat", "NotDead"));
        animals.add(new Animal("Jack", "Cat", "Dead"));
        animals.add(new Animal("Time", "Snake", "Dead"));

        Criteria dead = new CriteriaDead();
        Criteria dog = new CriteriaDog();
        Criteria snake = new CriteriaSnake();
        Criteria deadDog = new AndCriteria(dead, dog);
        Criteria snakeOrDead = new OrCriteria(snake, dead);

        System.out.println("Dead:");
        printAnimals(dead.meetCriteria(animals));

        System.out.println("Dogs:");
        printAnimals(dog.meetCriteria(animals));

        System.out.println("DeadDog:");
        printAnimals(deadDog.meetCriteria(animals));

        System.out.println("SnakeOrDead:");
        printAnimals(snakeOrDead.meetCriteria(animals));


    }

    public static void printAnimals(List<Animal> animals) {
        for (Animal animal : animals
        ) {
            System.out.println("Animal : [ Name:" + animal.getName() +
                    ", Type:" + animal.getType() +
                    ", Death:" + animal.getDeath() +
                    " ]");
        }
    }
}
