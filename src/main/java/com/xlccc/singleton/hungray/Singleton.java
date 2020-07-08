package com.xlccc.singleton.hungray;

/**
 * @author Linker
 * @date 2020/7/9 0:51
 * <p>
 * 饿汉式
 * <p>
 * 是否Lazy初始化：否
 * 是否多线程安全：是
 * 实现难度：易
 * @Description：这种方式比较常用，比较容易产生垃圾对象。
 * 优点：没有加锁，执行效率提高。
 * 缺点：类加载时就初始化，浪费内存。
 * <p>
 * 基于classloader机制，避免多线程的同步问题。
 * 但是也许有其他方式导致类装载，这时候初始化instance显然没有达到lazy loading效果。。。
 *
 * 建议使用
 */
public class Singleton {
    private static Singleton instance = new Singleton();

    private Singleton() {
    }

    public static Singleton getInstance() {
        return instance;
    }
}
