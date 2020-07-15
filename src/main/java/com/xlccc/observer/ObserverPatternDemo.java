package com.xlccc.observer;

/**
 * @author Linker
 * @date 2020/7/14 10:31
 * @Description: 观察者模式（Observer Pattern）当对象存在一对多关系时
 * 行为型模式，比如当一个对象被修改时，会自动通知依赖它的对象
 * <p>
 * 意图： 定义对象间的一种一对多的依赖关系，当一个对象的状态发送改变时，所有依赖于他的对象都得到通知并被自动更新。
 * 主要解决：一个对象状态改变给其他对象通知的问题，而且要考虑到易用和低耦合，保证高度的协作。
 * 何时使用：一个对象（目标对象）的状态发生改变，所有的依赖对象（观察者对象）都将得到通知，并进行广播通知。
 * 如何解决：使用面向对象技术，可以将这种依赖关系弱化。
 * 关键代码：在抽象类里有一个ArrayList存放观察者们。
 * 应用实例：拍卖，拍卖师观察最高价，通知其他竞价者。
 * <p>
 * 优点：1.观察者和被观察者时抽象耦合的。2.建立一套触发机制。
 * 缺点：1.如果一个被观察者对象有很多的直接和间接的观察者的话，将所有观察者都通知到会花费很多时间。
 * 2.如果在观察者和观察目标之间有循环依赖，则观察目标会触发他们之间的循环调用，可能导致系统崩溃。
 * 3.观察者模式没有相应的机制让观察者知道所观察的目标对象时怎么发生变化的，而仅仅知道观察目标发生了变化。
 * <p>
 * 使用场景：一个抽象模型有两个方面，其中一个方面依赖于另一个方面。将这些方面封装在独立的对象中使他们可以格子独立改变和服用。
 * 一个对象必须通知其他对象，而并不知道这些对象是谁。
 * <p>
 * 注意事项：1.Java中有对观察者模式的支持类。2.避免循环引用。3.如果顺序执行，某一观察者错误会导致系统卡壳，一般采用异步方式。
 */
public class ObserverPatternDemo {
    public static void main(String[] args) {
        Subject subject = new Subject();


        //初始化时添加进被观察者名单
        new BoringObserver(subject);
        new FunnyObserver(subject);
        new DullObserver(subject);
        // subject.add(boringObserver);
        // subject.add(funnyObserver);

        subject.setMessage("Hello World");

        System.out.println("------");

        subject.setMessage("DU DU DU");


    }
}
