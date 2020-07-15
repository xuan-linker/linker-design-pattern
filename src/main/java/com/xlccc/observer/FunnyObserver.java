package com.xlccc.observer;

/**
 * @author Linker
 * @date 2020/7/14 11:30
 */
public class FunnyObserver extends Observer {
    public FunnyObserver(Subject subject) {
        this.subject = subject;
        this.subject.add(this);
    }

    @Override
    public void update() {
        System.out.println("Funny:" + subject.getMessage());
    }
}
