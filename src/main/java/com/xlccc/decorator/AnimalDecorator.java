package com.xlccc.decorator;

/**
 * @author Linker
 * @date 2020/7/13 11:27
 */
public abstract class AnimalDecorator implements Animal {
    protected Animal decoratorAnimal;

    public AnimalDecorator(Animal decoratorAnimal) {
        this.decoratorAnimal = decoratorAnimal;
    }

    public void say() {
        decoratorAnimal.say();
    }
}
