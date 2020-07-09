package com.xlccc.abstract_factory;

/**
 * @author Linker
 * @date 2020/7/9 22:54
 * @Description：Animal的实体类创建工厂
 */
public class AnimalFactory extends AbstractFactory {
    @Override
    public People getPeople(String people) {
        return null;
    }

    @Override
    public Animal getAnimal(String animal) {
        if (animal == null) {
            return null;
        }
        if (animal.equalsIgnoreCase("DOG")) {
            return new Dog();
        } else if (animal.equalsIgnoreCase("CAT")) {
            return new Cat();
        } else if (animal.equalsIgnoreCase("SNAKE")) {
            return new Snake();
        }
        return null;
    }
}
