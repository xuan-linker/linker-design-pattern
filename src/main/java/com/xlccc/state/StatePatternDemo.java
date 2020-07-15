package com.xlccc.state;

/**
 * @author Linker
 * @date 2020/7/15 10:53
 * @Description:状态模式(State Pattern)，类的行为基于其状态改变。
 * 行为型模式，创建表示各种状态的对象和一个行为随着状态对象改变而改变的Context对象
 * <p>
 * 意图：允许对象在内部状态发生改变时改变它的行为，对象看起来好像修改了他的类。
 * 主要解决：对象的行为依赖与他的状态（属性），并且可以根据状态改变而改变相关行为。
 * 何时使用：代码中包含大量与对象状态有关的条件语句
 * 如何解决：将各种具体的状态类抽象出来。
 * 关键代码：通常命令模式的接口只有一个方法。而状态模式接口有一个或多个方法。而且，状态模式实现类通常有返回值，或改变实例变量的值。
 * 实现类的方法有不同功能，覆盖接口中的方法。
 * 状态模式和命令模式都可以用于消除If...Else等条件选择语句。
 * <p>
 * 应用实例:1.电脑显卡有超频、游戏、静音状态
 * <p>
 * 优点：1.封装了转换规则。
 * 2.枚举可能的状态，在枚举状态之前需要确定状态种类。
 * 3.将所有与某个状态相关的行为放到一个类中，并方便增加新的状态，只需要改变对象状态即可改变对象行为。
 * 4.允许状态转换逻辑与状态对象合并，而非一个巨大的条件语句块。
 * 5.可以让多个环境对象共享一个状态，从而减少系统中对象个数。
 * <p>
 * 缺点：1.状态模式必然增加系统类和对象个数。
 * 2.状态模式的结构和实现比较复杂，如果使用不当导致程序结构和代码混乱。
 * 3.状态模式对“开闭原则”支持不好，对于可以切换状态的状态模式增加新的状态要修改那些负责状态转化的代码，
 * 修改某个状态类的行为也需要修改对应类源代码。
 * <p>
 * 使用场景：1.行为随状态改变而改变。
 * 2.条件、分支语句替代。
 * <p>
 * 注意事项：在行为受状态约束的时候使用状态模式，而且状态不超过5个。
 */
public class StatePatternDemo {
    public static void main(String[] args) {
        // Context 为 带有状态的 类
        Context context = new Context();

        // Start状态 -> 实体状态类
        StartState startState = new StartState();
        startState.doAction(context);

        System.out.println(startState.toString());

        // End状态 -> 实体状态类
        EndState endState = new EndState();
        endState.doAction(context);

        System.out.println(endState.toString());

    }
}
