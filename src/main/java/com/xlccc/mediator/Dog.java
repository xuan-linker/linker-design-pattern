package com.xlccc.mediator;

/**
 * @author Linker
 * @date 2020/7/14 8:58
 * @Description：实体类
 */
public class Dog {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Dog(String name) {
        this.name = name;
    }

    public void action(String word) {
        Action.say(this, word);
    }
}
