package com.xlccc.singleton.lazy;

/**
 * @author Linker
 * @date 2020/7/7 20:44
 *
 * 懒汉式，线程不安全
 *
 * 是否Lazy初始化：是
 * 是否多线程安全：否
 * 实现难度：易
 * @Description： 最基本的实现方式。最大问题，不支持多线程。因为没有加锁synchronized，所以严格意义上并不算单例。
 *
 * 不建议使用
 */
public class Singleton1 {
    private static Singleton1 instance;

    private Singleton1() {
    }

    public static Singleton1 getInstance() {
        if (instance == null) {
            instance = new Singleton1();
        }
        return instance;
    }
}
