package com.xlccc.iterator;

/**
 * @author Linker
 * @date 2020/7/13 17:11
 * @Description:迭代器模式(Iterator Pattern) 是Java和.NET编程环境中非常常用的设计模式。
 * 行为型模式，顺序访问集合对象的元素，不需要知道集合对象的底层表示。
 * <p>
 * 意图：提供一个方法顺序访问一个聚合对象中的各个元素，无需暴露该对象内部表示。
 * 主要解决：不同的方法来遍历整个整合对象。
 * 何时使用：遍历一个聚合对象。
 * 如何解决：把在元素之间游走的责任交给迭代器，而不是聚合对象
 * 关键代码：定义接口，hasNext，next
 * 应用实例：Java中的iterator
 * <p>
 * 优点：1.支持以不同的方式便利一个聚合对象。
 * 2.迭代器简化了聚合类。
 * 3.在同一个聚合上可以有多个遍历。
 * 4.迭代器模式中，增加新的聚合类和迭代器类都很方便，无需修改原有代码。
 * 缺点：由于迭代器模式将存储数据和便利数据的职责分离，增加新的聚合类需要对应增加新的迭代器类，类的个数成对增加，在一定程度上增加了系统的复杂性。
 * <p>
 * 使用场景：1.访问一个聚合对象的内容而无需暴露它的内部表示。
 * 2.需要为聚合对象提供多种遍历方式。
 * 3.为遍历不同的聚合结构提供一个同一的接口。
 * <p>
 * 注意事项：迭代器模式就是分离了集合对象的遍历行为，抽象出一个迭代器类来负责，
 * 这样既可以不暴露集合的内部结构，又可以让外部代码透明地访问集合内部地数据结构。
 */
public class IteratorPattern {
    public static void main(String[] args) {
        AnimalsRepository animalsRepository = new AnimalsRepository();

        for (Iterator iter = animalsRepository.getIterator(); iter.hasNext(); ) {
            String animal = (String) iter.next();
            System.out.println("Animal : " + animal);
        }
    }
}
