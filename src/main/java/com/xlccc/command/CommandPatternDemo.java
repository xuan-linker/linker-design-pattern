package com.xlccc.command;

/**
 * @author Linker
 * @date 2020/7/13 15:19
 * @Description:命令模式（Command Pattern）是一种数据驱动的设计模式。
 * 行为型模式。
 * 请求以命令的形式包裹在对象中，并传给调用对象。调用对象寻找可以处理该命令的合适的对象，并把该命令传给相应的对象，该对象执行命令。
 * <p>
 * 意图：将一个请求封装成一个对象，从而可以用不同请求对客户进行参数化。
 * 主要解决：软件系统中，行为请求者与行为实现者通常紧耦合，但部分场景，比如需要对行为进行记录、撤销或重做、事务等处理时，
 * 这种无法改变的紧耦合设计不合适。
 * <p>
 * 何时使用：部分场景，比如需要对行为进行记录、撤销或重做、事务等处理时，这种无法改变的紧耦合设计不合适。
 * 如何将“行为请求者”和“行为实现者”解耦？将一组行为抽象为对象，可以实现二者之间的送耦合。
 * 如何解决：通过调用者 调用 接收者执行命令，顺序：调用者->接收者->命令
 * 关键代码：定义三个角色：1.received真正的命令执行对象
 * 2.Command
 * 3.invoker使用命令对象的入口
 * <p>
 * 应用实例：struts 1 中的 action 核心控制器 ActionServlet 只有一个，相当于 Invoker，而模型层的类会随着不同的应用有不同的模型类，相当于具体的 Command。
 * <p>
 * 优点：1.降低了系统耦合度。2.新的命令可以很容易添加到系统中。
 * 缺点：使用命令模式可能会导致某些系统有过多的具体命令类。
 * <p>
 * 使用场景：认为时命令的地方都可以使用命令模式，比如1.GUI中每一个按钮都是一条命令。2.模拟CMD
 * 注意事项：系统需要支持命令的撤销（Undo）操作和恢复（Redo）操作，也可以考虑使用命令模式。
 */
public class CommandPatternDemo {

    public static void main(String[] args) {
        Stock aaaStock = new Stock();

        BuyStock buyStockOrder = new BuyStock(aaaStock);
        SellStock sellStockOrder = new SellStock(aaaStock);

        //使用Broker类来接受并执行命令
        Broker broker = new Broker();

        //预加载命令
        broker.takeOrder(buyStockOrder);
        broker.takeOrder(buyStockOrder);
        broker.takeOrder(buyStockOrder);
        broker.takeOrder(buyStockOrder);
        broker.takeOrder(buyStockOrder);
        broker.takeOrder(sellStockOrder);

        //执行
        broker.placeOrders();

    }
}
