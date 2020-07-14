package com.xlccc.mediator;

/**
 * @author Linker
 * @date 2020/7/14 9:02
 * @Description:中介类
 */
public class Action {
    public static void say(Dog dog, String word) {
        System.out.println("Dog :" + dog.getName() + " say :" + word);
    }
}
