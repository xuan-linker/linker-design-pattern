package com.xlccc.template;

/**
 * @author Linker
 * @date 2020/7/14 18:48
 */
public class Telegram extends Program {
    @Override
    void initialize() {
        System.out.println("TG Init");
    }

    @Override
    void startRun() {
        System.out.println("TG Start");
    }

    @Override
    void stopRun() {
        System.out.println("TG End");
    }
}
