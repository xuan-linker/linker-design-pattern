package com.xlccc.nullobject;

/**
 * @author Linker
 * @date 2020/7/14 17:15
 * @Description:工厂类，演示是否生成空对象
 */
public class CustomerFactory {
    public static final String[] names = {"Kim" , "Tom" , "Linker"};

    public static AbstractCustomer getCustomer(String name){
        for (int i = 0; i < names.length; i++) {
            if (names[i].equalsIgnoreCase(name)){
                return new RealCustomer(name);
            }
        }
        return new NullCustomer();
    }
}
