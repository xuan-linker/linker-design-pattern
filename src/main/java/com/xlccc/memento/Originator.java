package com.xlccc.memento;

/**
 * @author Linker
 * @date 2020/7/14 9:54
 * @Description: 一级缓存记录
 */
public class Originator {
    private String state;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Memento saveStateToMemento() {
        return new Memento(state);
    }

    public void getStateFromMemento(Memento memento) {
        state = memento.getState();
    }
}
