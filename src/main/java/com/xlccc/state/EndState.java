package com.xlccc.state;

/**
 * @author Linker
 * @date 2020/7/15 11:15
 */
public class EndState implements State {
    @Override
    public void doAction(Context context) {
        System.out.println("Player is in stop state");
        context.setState(this);
    }

    public String toString() {
        return "Stop State";
    }
}
