package com.xlccc.command;


/**
 * @author Linker
 * @date 2020/7/13 15:59
 * @Description:创建实现了Order接口的实体类 3-1
 */
public class SellStock implements Order {
    private Stock aaaStock;

    public SellStock(Stock aaaStock) {
        this.aaaStock = aaaStock;
    }

    @Override
    public void execute() {
        aaaStock.sell();
    }
}
