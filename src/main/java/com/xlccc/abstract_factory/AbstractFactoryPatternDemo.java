package com.xlccc.abstract_factory;

/**
 * @author Linker
 * @date 2020/7/9 22:57
 * @Description:通过抽象工厂类来获取工厂，再通过传递信息获取实体类对象
 *
 * 抽象工厂模式（Abstract Factory Pattern）
 * 通过超级工厂（工厂的工厂）创建其他工厂。
 * 创建型模式
 * 接口负责创建一个相关对象的工厂，不需要显示指定类，每个生成的工厂都能按照工厂模式提供对象。
 *
 *
 * 意图：提供一个创建系列相关或相互依赖对象的接口，无需指定他们具体的类。
 * 主要解决：接口选择问题。
 * 何时使用：系统产品中有多于一个的产品族，而系统只消费其中某一产品。
 * 如何解决：一个产品族中，定义多个产品。
 * 关键代码：在一个工厂中，聚合多个同类产品。
 *
 * 优点：一个产品族中多个对象被设计成一起工作，保证客户端始终只使用同一个产品族中的对象。
 * 缺点：产品族拓展困难，要增加一个系列的某一产品，既要在抽象的Creator里加代码，又要在具体的实现中加代码。
 *
 * 使用场景：生成不同操作系统的程序。
 * 注意事项：产品族男扩展，产品等级易扩展。
 *
 */
public class AbstractFactoryPatternDemo {
    public static void main(String[] args) {
        //获取Animal工厂
        AbstractFactory animalFactory = FactoryProducer.getFactory("ANIMAL");

        //获取Animal为Dog的对象
        Animal dog = animalFactory.getAnimal("DOG");
        dog.birth();

        Animal cat = animalFactory.getAnimal("CAT");
        cat.birth();

        //获取People工厂
        AbstractFactory peopleFactory = FactoryProducer.getFactory("PEOPLE");

        People black = peopleFactory.getPeople("BLACK");
        black.Say();

        People white = peopleFactory.getPeople("WHITE");
        white.Say();
    }
}
