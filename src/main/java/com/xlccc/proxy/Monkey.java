package com.xlccc.proxy;

import java.sql.Time;
import java.util.Timer;

/**
 * @author Linker
 * @date 2020/7/13 14:57
 * @Description：创建实现接口的实体类。
 */
public class Monkey implements Animal {
    private String name;

    public Monkey(String name) {
        this.name = name;
        //假装从远程加载，有延迟
        try {
            System.out.println("Load Start");
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        loadFromLongDistance(name);
    }

    @Override
    public void say() {
        System.out.println("Animal:Monkey " + name + " say hello");
    }

    private void loadFromLongDistance(String name) {
        System.out.println("Loading Final :" + name);
    }
}
