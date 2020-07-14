package com.xlccc.nullobject;

/**
 * @author Linker
 * @date 2020/7/14 17:14
 * @Description:扩展了抽象类的实体类
 */
public class NullCustomer extends AbstractCustomer {
    @Override
    public boolean isNil() {
        return true;
    }

    @Override
    public String getName() {
        return "Not Available is Customer Database";
    }
}
