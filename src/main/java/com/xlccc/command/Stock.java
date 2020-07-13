package com.xlccc.command;

/**
 * @author Linker
 * @date 2020/7/13 15:53
 * @Description:创建一个请求类 2-1
 */
public class Stock {
    private String name = "AAA";
    private int quantity = 10;

    public void buy() {
        quantity += 1;
        System.out.println("Stock [ Name: " + name +
                ", Quantity: " + quantity +
                "] bought");
    }

    public void sell() {
        quantity -= 1;

        System.out.println("Stock [ Name: " + name +
                ", Quantity: " + quantity +
                "] sold");
    }
}
