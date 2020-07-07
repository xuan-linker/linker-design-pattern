package com.xlccc.singleton.lazy;

/**
 * @author Linker
 * @date 2020/7/7 20:44
 * <p>
 * 懒汉式，线程安全
 * <p>
 * 是否Lazy初始化：是
 * 是否多线程安全：是
 * 实现难度：易
 * @Description 具备很好的 lazy loading，能够在多线程中很好的工作。
 * 但是效率很低，99%情况下不需要同步。
 * 优点：第一次调用才初始化，避免来内存浪费。
 * 缺点：必须加锁synchronized才能保证单例，但加锁会影响效率。
 * getInstance()的性能对应用程序不是很关键（该方法使用不太频繁）。
 */
public class Singleton2 {
    private static Singleton2 instance;

    private Singleton2() {
    }

    public static synchronized Singleton2 getInstance() {
        if (instance == null) {
            instance = new Singleton2();
        }
        return instance;
    }
}
