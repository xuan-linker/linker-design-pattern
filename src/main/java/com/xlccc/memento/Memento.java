package com.xlccc.memento;

/**
 * @author Linker
 * @date 2020/7/14 9:45
 * @Description: Memento 最小记录单元
 */
public class Memento {
    private String state;

    public Memento(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }
}
