package com.xlccc.state;

/**
 * @author Linker
 * @date 2020/7/15 11:13
 */
public class Context {
    private State state;

    public Context() {
        state = null;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }
}
