package com.xlccc.nullobject;

/**
 * @author Linker
 * @date 2020/7/14 17:03
 * @Description:空对象模式（Null Object Pattern），一个空对象取代NULL对象实例的检查。
 * NULL对象不是检查空值，而是反应一个不做任何动作的关系。这样的NULL对象也可以在数据不可用的时候提供默认的行为。
 * <p>
 * 空对象模式中，创建一个指定各种要执行的操作的抽象类和扩展该类的实体类，还创建一个未对该类做任何实现的空对象类，该空对象类将无缝地使用在需要检查空值地地方。
 */
public class NullObjectPatternDemo {
    public static void main(String[] args) {
        //通过名字是否符合条件，获取RealCustomer和NullCustomer对象
        AbstractCustomer customer0 = CustomerFactory.getCustomer("Kim");
        AbstractCustomer customer1 = CustomerFactory.getCustomer("Kim1");
        AbstractCustomer customer2 = CustomerFactory.getCustomer("Tom2");
        AbstractCustomer customer3 = CustomerFactory.getCustomer("Linker");

        System.out.println("Customers");
        System.out.println(customer0.getName());
        System.out.println(customer1.getName());
        System.out.println(customer2.getName());
        System.out.println(customer3.getName());
    }
}
