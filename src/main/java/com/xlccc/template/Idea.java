package com.xlccc.template;

/**
 * @author Linker
 * @date 2020/7/14 18:47
 */
public class Idea extends Program {
    @Override
    void initialize() {
        System.out.println("Idea Init");
    }

    @Override
    void startRun() {
        System.out.println("Idea Start");
    }

    @Override
    void stopRun() {
        System.out.println("Idea End");
    }
}
