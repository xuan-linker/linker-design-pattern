package com.xlccc.normal_factory;

/**
 * @author Linker
 * @date 2020/7/9 1:24
 * <p>
 * 工厂模式（Factory Pattern），创建型模式，创建对象的最佳方式
 * 不对客户端暴露创建逻辑，使用同一接口指向新创建的对象
 * <p>
 * 定义一个创建接口，子类决定实例化哪一个工厂类，工厂模式使得创建过程延迟到子类进行。
 * <p>
 * 主要解决：接口选择问题
 * <p>
 * 何时使用：明确计划，不同条件下创建不同实例。
 * 如何解决：让其子类实现工厂接口，返回的也是一个抽象的产品
 * <p>
 * 关键代码：创建过程在其子类执行。
 * <p>
 * 例如：Hibernate换数据库只需要换方言、驱动
 * <p>
 * 优点：
 * 1.调用者创建对象，只知道名称即可。
 * 2.拓展性高：增加一个产品，只需要拓展一个工厂类即可。
 * 3.屏蔽产品的具体实现，调用者只关心产品的接口。
 * <p>
 * 缺点：
 * 每增加一个产品，都要增加一个具体类和对象实现工厂，使得系统中类的个数成倍增加
 * 一定程度上增加系统复杂度，同时也增加了系统具体类的依赖。
 * <p>
 * 使用场景：1.日志记录：记录可能到硬盘，系统事件、远程服务器等，用户可以选择记录位置。
 * 2、设计一个连接服务器的框架，需要三个协议，"POP3"、"IMAP"、"HTTP"，可以把这三个作为产品类，共同实现一个接口
 *
 * 注意：
 * 如果使用工厂模式，就需要引入一个工厂类，会增加系统的复杂度。
 * 简单对象，只需要通过 new 就可以完成创建，
 */
public class FactoryStartDemo {
    public static void main(String[] args) {
        AnimalFactory animalFactory = new AnimalFactory();

        Animal animal1 = animalFactory.getAnimal("CAT");
        animal1.birth();

        Animal animal2 = animalFactory.getAnimal("DOG");
        animal2.birth();

        Animal animal3 = animalFactory.getAnimal("RABBIT");
        animal3.birth();

    }
}
