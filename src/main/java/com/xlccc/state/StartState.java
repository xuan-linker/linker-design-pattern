package com.xlccc.state;

/**
 * @author Linker
 * @date 2020/7/15 11:14
 */
public class StartState implements State {
    @Override
    public void doAction(Context context) {
        System.out.println("Player is in start state");
        context.setState(this);
    }

    public String toString() {
        return "Start State";
    }
}
