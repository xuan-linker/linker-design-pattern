package com.xlccc.Observer;

/**
 * @author Linker
 * @date 2020/7/14 11:27
 */
public class BoringObserver extends Observer {
    public BoringObserver(Subject subject) {
        this.subject = subject;
        this.subject.add(this);
    }

    @Override
    public void update() {
        System.out.println("Boring : " + subject.getMessage());
    }
}
