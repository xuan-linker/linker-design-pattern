package com.xlccc.chain;

/**
 * @author Linker
 * @date 2020/7/13 16:12
 * @Description:责任链模式(Chain of Responsibility Pattern) 为请求创建了一个接收者对象的链。
 * 行为型模式。给予请求的类型，对请求的发送者和接收者进行解耦
 * 通常每个接收者都包含对另一个接收者的引用。如果一个对象不能处理该请求，那么他会把相同的请求传给下一个接收者，依此类推。
 * <p>
 * 意图：避免请求发送者与接收者耦合在一起，让多个对象都有可能接收请求，将这些对象连接成一条链，
 * 并沿着这条链传递请求，直到有对象处理他为止。
 * 主要解决：职责链上的处理者负责处理请求，客户只需要将请求发送到职责链上即可，无需关心请求的处理细节和请求的传递，
 * 所以职责链将请求的发送者和请求的处理者解耦了。
 * 何时使用：在处理消息的时候以过滤很多道？？
 * 如何解决：拦截的类都实现统一接口。
 * 关键代码：Handler里面聚合他自己，在HandlerRequest里判断是否合适，如果没有达到条件则向下传递，向谁传递之前set进去。
 * 应用实例：1.击鼓传花。2.JS中事件冒泡。3.Struts2的拦截器，jsp servlet的Filter
 * <p>
 * 优点：1.降低耦合度。将请求的发送者和接收者解耦。
 * 2.简化了对象，使得对象不需要知道链的结构。
 * 3.增强给对象指派职责的灵活性，通过改变链内的成员或者调用他们的次序，允许动态新增或删除责任。
 * 4.增加新的请求处理类很方便
 * 缺点：1.不能保证请求一定被接收。
 * 2.系统性能将受到一定影响，而且在进行代码调试时不方便，可能造成循环调用。
 * 3.可能不容易观察运行时的特征，不易排查错误
 * <p>
 * 使用场景：1.多个对象可以处理同一个请求，具体哪个对象处理该请求由运行时刻自动确定。
 * 2.在不明确指定接收者的情况下，向多个对象中的一个提交一个请求。
 * 3.可动态指定一组对象处理请求。
 * <p>
 * 注意事项：JAVA WEB 中有很多应用
 */
public class ChainPatternDemo {
    private static AbstractLogger getChainOfLoggers() {
        //创建不同类型的记录器，赋予不同的错误级别，并在每个记录器中设置下一个记录器。每个记录器中的下一个记录器代表的是链的一部分。
        AbstractLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR);
        AbstractLogger fileLogger = new FileLogger(AbstractLogger.DEBUG);
        AbstractLogger commonLogger = new CommonLogger(AbstractLogger.INFO);

        errorLogger.setNextLogger(fileLogger);
        fileLogger.setNextLogger(commonLogger);

        return errorLogger;
    }

    public static void main(String[] args) {
        AbstractLogger loggerChain = getChainOfLoggers();

        loggerChain.logMessage(AbstractLogger.INFO, "This is an information.");

        System.out.println("------");
        loggerChain.logMessage(AbstractLogger.DEBUG, "This is a debug level information");
        System.out.println("------");

        loggerChain.logMessage(AbstractLogger.ERROR, "This is a Error information");
    }

}
