package com.xlccc.command;

/**
 * @author Linker
 * @date 2020/7/13 15:58
 * @Description:创建实现了Order接口的实体类 3-1
 */
public class BuyStock implements Order {
    private Stock aaaStock;

    public BuyStock(Stock aaaStock) {
        this.aaaStock = aaaStock;
    }

    @Override
    public void execute() {
        aaaStock.buy();
    }
}
