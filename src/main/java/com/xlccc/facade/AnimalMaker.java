package com.xlccc.facade;

/**
 * @author Linker
 * @date 2020/7/13 13:38
 */
public class AnimalMaker {
    private Animal cat;
    private Animal cow;
    private Animal dog;

    public AnimalMaker() {
        this.cat = new Cat();
        this.cow = new Cow();
        this.dog = new Dog();
    }

    public void catSay() {
        cat.say();
    }

    public void dogSay() {
        dog.say();
    }

    public void cowSay() {
        cow.say();
    }
}
