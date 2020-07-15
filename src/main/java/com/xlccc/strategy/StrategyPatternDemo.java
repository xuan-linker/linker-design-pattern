package com.xlccc.strategy;

/**
 * @author Linker
 * @date 2020/7/15 11:43
 * @Description:策略模式（Strategy Pattern），一个类的行为或算法可以在运行时更改
 * 行为型模式，创建表示各种策略对象和一个行为随着策略对象改变而改变的context，策略对象改变context对象的执行算法
 * <p>
 * 意图：定义一系列的算法，把他们封装i起来后，可以互相替换
 * 主要解决：有多种算法相似的情况下，使用if...else会导致复杂和难以维护
 * 何时使用：一个系统又许多类，区分他们的只是他们直接的行为。
 * 如何解决：将这些算法封装成类，任意替换。
 * 关键代码：实现同一个接口
 * 应用实例：1.出行方式选择车、船、飞机为不同策略。
 * <p>
 * 优点：1.算法可以自由切换。2.避免使用多重条件判断。3.拓展性良好
 * 缺点：1.策略类会增多。2.所有策略类都需要对外暴露
 * <p>
 * 使用场景：1.一个系统需要动态从几种算法中选择一种。
 * 2.系统中有很多相似的类，区别仅在行为。
 * <p>
 * 注意事项：一个系统的策略多余四个，需要考虑使用混合模式，解决策略类膨胀的问题。
 */
public class StrategyPatternDemo {
    public static void main(String[] args) {

        //具体选择某种策略，并执行
        Strategy plus = new OperationPlus();
        Context context1 = new Context(plus);
        System.out.println("10+5=" + context1.executeStrategy(10, 5));

        Strategy multiply = new OperationMultiply();
        Context context2 = new Context(multiply);
        System.out.println("10*5=" + context2.executeStrategy(10, 5));

        Strategy subtract = new OperationSubtract();
        Context context3 = new Context(subtract);
        System.out.println("10-5=" + context3.executeStrategy(10, 5));
    }
}
