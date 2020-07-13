package com.xlccc.command;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Linker
 * @date 2020/7/13 16:00
 * @Description:创建命令调用类 4-1
 */
public class Broker {
    private List<Order> orderList = new ArrayList<>();

    public void takeOrder(Order order) {
        orderList.add(order);
    }

    //执行批量操作
    public void placeOrders() {
        for (Order order : orderList
        ) {
            order.execute();
        }
        orderList.clear();
    }
}
