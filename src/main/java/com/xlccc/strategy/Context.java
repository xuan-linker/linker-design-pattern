package com.xlccc.strategy;

/**
 * @author Linker
 * @date 2020/7/15 13:57
 * @Description：为了使用某种策略
 */
public class Context {
    Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public int executeStrategy(int num1, int num2) {
        return strategy.doOperation(num1, num2);
    }
}
