package com.xlccc.mvc;

/**
 * @author Linker
 * @date 2020/7/14 11:43
 */
public class AnimalView {

    public void toViewString(String name, String action) {
        System.out.println("Animal: ");
        System.out.println("Name:" + name);
        System.out.println("Action: " + action);
    }
}
