package com.xlccc.normal_factory;

/**
 * @author Linker
 * @date 2020/7/9 1:22
 *
 *
 */
public class AnimalFactory {
    public Animal getAnimal(String kind) {
        if (kind == null) {
            return null;
        }

        if (kind.equalsIgnoreCase("CAT")) {
            return new Cat();
        }
        if (kind.equalsIgnoreCase("DOG")) {
            return new Dog();
        }
        if (kind.equalsIgnoreCase("RABBIT")) {
            return new Rabbit();
        }
        return null;
    }
}
