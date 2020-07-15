package com.xlccc.strategy;

/**
 * @author Linker
 * @date 2020/7/15 13:55
 * @Description：实现接口的实体类
 */
public class OperationPlus implements Strategy {

    @Override
    public int doOperation(int num1, int num2) {
        return num1 + num2;
    }
}
