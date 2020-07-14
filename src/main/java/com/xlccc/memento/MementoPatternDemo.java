package com.xlccc.memento;

import com.sun.org.apache.xpath.internal.operations.Or;

/**
 * @author Linker
 * @date 2020/7/14 9:18
 * @Description:备忘录模式（ Memento Pattern），保存一个对象的某个状态，以便在适当的时候恢复对象。
 * 行为型模式
 * <p>
 * 意图：不破坏封装的前提下，捕获一个对象的内部状态，并在该对象之外保存该状态。
 * 主要解决：...可以在以后将对象恢复到原先保存的状态。
 * 何时使用：有时需要记录一个对象的内部状态，允许用户取消不确定或者错误的操作，能够恢复到他原先的状态，使得行为有后悔药。
 * 如何解决：通过一个备忘录类专门存储对象状态。
 * 关键代码：客户不与备忘录类耦合，与备忘录管理类耦合。
 * 应用实例：1.后悔药。2.数据库中的事务管理
 * <p>
 * 优点：1.给用户提供了一种可以恢复状态的机制，可以使用户比较方便回到某个历史状态。2.实现了信息的封装，用户不需要关心状态的保存细节。
 * 缺点：消耗资源。类成员变量过多，势必会占用比较大的资源，而且每一次保存都会消耗一定的内存。
 * <p>
 * 使用场景：1.需要保存/恢复数据的相关状态场景。2.提供一个可回滚的操作。
 * <p>
 * 注意事项：1.为了符合迪米特原则，还需要增加一个管理备忘录的类。2.为了节约内存，可使用原型模式+备忘录模式
 */
public class MementoPatternDemo {
    public static void main(String[] args) {
        //使用一级缓存和二级持久化缓存记录操作数据
        Originator originator = new Originator();
        CareTaker careTaker = new CareTaker();

        originator.setState("State #1");
        originator.setState("State #2");
        careTaker.add(originator.saveStateToMemento());
        originator.setState("State #3");
        careTaker.add(originator.saveStateToMemento());
        originator.setState("State #4");

        System.out.println("Current State: " + originator.getState());
        originator.getStateFromMemento(careTaker.get(0));
        System.out.println("First saved State: " + originator.getState());
        originator.getStateFromMemento(careTaker.get(1));
        System.out.println("Second saved State: " + originator.getState());
    }
}
