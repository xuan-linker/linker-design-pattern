package com.xlccc.Observer;

/**
 * @author Linker
 * @date 2020/7/14 11:36
 */
public class DullObserver extends Observer {
    public DullObserver(Subject subject) {
        this.subject = subject;
        this.subject.add(this);
    }

    @Override
    public void update() {
        System.out.println("Dull: " + subject.getMessage());
    }
}
