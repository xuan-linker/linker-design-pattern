package com.xlccc.strategy;

/**
 * @author Linker
 * @date 2020/7/15 13:57
 * @Description：实现接口的实体类
 */
public class OperationMultiply implements Strategy {
    @Override
    public int doOperation(int num1, int num2) {
        return num1 * num2;
    }
}
