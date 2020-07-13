package com.xlccc.decorator;

/**
 * @author Linker
 * @date 2020/7/13 11:08
 * @Description:装饰器模式 (Decorator Pattern) 允许向一个现有的对象添加新的功能，同时又不改变其结构。
 * 结构型模式，作为现有类的一个包装。
 * 创建一个装饰类，用以包装原有的类，并在保持类方法签名完整前提下，提供了额外的功能。
 * <p>
 * 意图：动态地给对象添加额外职责。从增加功能角度出发，装饰器模式比生成子类更加灵活。
 * 主要解决：通常，拓展一个类经常使用继承方式。由于继承为类引入静态特征，并随着扩展功能的增加，子类会很膨胀。
 * 何时使用：在不想增加很多子类的情况下扩展类。
 * 如何解决：将具体功能职责划分，同时继承装饰者模式。
 * 关键代码：1.Component类充当抽象角色，不应该具体实现。2.装饰类引用和继承Component类，具体扩展类重写父类方法。
 * <p>
 * 应用实例：人+荣誉 -> 厉害的人
 * <p>
 * 优点：装饰类和被装饰类可以独立发展，不会相互耦合，装饰模式是继承的一个替代，装饰模式可以动态扩展一个实现类的功能。
 * 缺点：多层装饰比较复杂。
 * <p>
 * 使用场景：1.扩展一个类的功能。2.动态增加，动态撤销。
 * 注意事项：可代替继承。
 */
public class DecoratorPatternDemo {
    public static void main(String[] args) {
        Animal cat = new Cat();
        AnimalDecorator actionCat = new ActionAnimalDecorator(new Cat());
        AnimalDecorator actionCow = new ActionAnimalDecorator(new Cow());
        AnimalDecorator actionDog = new ActionAnimalDecorator(new Dog());

        cat.say();

        System.out.println("----------");
        actionCat.say();
        actionCow.say();
        actionDog.say();
    }
}
