package com.xlccc.flyweight;

/**
 * @author Linker
 * @date 2020/7/13 14:17
 * @Description:创建实现接口的实体类
 */
public class Dog implements Animal {

    private String type;

    private String name;
    private String age;

    public Dog(String type) {
        this.type = type;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(String age) {
        this.age = age;
    }

    @Override
    public void say() {
        System.out.println("Animal: Dog() [Type:" + type +
                ", Name:" + name + " , Age:" + age +
                "]");
    }
}
