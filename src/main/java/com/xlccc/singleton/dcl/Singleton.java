package com.xlccc.singleton.dcl;

/**
 * @author Linker
 * @date 2020/7/9 0:56
 * <p>
 * 双检锁/双重校验锁（DCL，即double-checked locking）
 * <p>
 * JDK版本：JDK1.5+
 * 是否Lazy初始化：是
 * 是否多线程安全：是
 * 实现难度：较复杂
 * @Description：采用双重锁机制，安全、且在多线程情况下保持高性能。 getInstance()的性能对应用程序很关键
 */
public class Singleton {
    private volatile static Singleton singleton;

    private Singleton() {
    }


    public static Singleton getSingleton() {
        if (singleton == null) {
            synchronized (Singleton.class) {
                if (singleton == null) {
                    singleton = new Singleton();
                }
            }
        }
        return singleton;
    }

}
