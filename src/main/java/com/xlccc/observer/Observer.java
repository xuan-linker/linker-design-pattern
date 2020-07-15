package com.xlccc.observer;

/**
 * @author Linker
 * @date 2020/7/14 11:15
 */
public abstract class Observer {
    protected Subject subject;

    public abstract void update();
}
