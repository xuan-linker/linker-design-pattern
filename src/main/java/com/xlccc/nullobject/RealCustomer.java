package com.xlccc.nullobject;

/**
 * @author Linker
 * @date 2020/7/14 17:13
 * @Description:扩展了抽象类的实体类
 */
public class RealCustomer extends AbstractCustomer {

    public RealCustomer(String name) {
        this.name = name;
    }

    @Override
    public boolean isNil() {
        return false;
    }

    @Override
    public String getName() {
        return name;
    }
}
