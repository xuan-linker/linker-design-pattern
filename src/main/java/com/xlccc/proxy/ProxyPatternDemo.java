package com.xlccc.proxy;

/**
 * @author Linker
 * @date 2020/7/13 14:37
 * @Description:代理模式（Proxy Pattern）一个类代表另一个类的功能
 * 结构型模式
 * 创建具有现有对象的对象，以便向外界提供功能接口。
 * <p>
 * 意图：为其他对象提供一种代理以控制对这个对象的访问。
 * 主要解决：在直接访问对象时带来的问题。比如要访问对象在远程的机器上。在面向对象系统中，有些对象由于部分原因（比如对象创建开销很大，
 * 或者某些操作需要安全控制，或者需要进程外的访问），直接访问会给使用者或者系统结构带来很多麻烦，
 * 我们可以在访问此对象时加上一个对此对象的访问层。
 * 何时使用：想在访问一个类时做一些控制。
 * 如何解决：增加中间层。
 * 关键代码：实现与被代理类组合。
 * 应用实例：1.买车票不仅只有火车站，也可以去代售点。2.Spring AOP
 * <p>
 * 优点：1.职责清晰。2.高扩展性。3.智能化。
 * 缺点：1.由于在客户端和真实主题之间增加代理对象，因此有些类型的代理模式可能会造成请求处理速度变慢。
 * 2.实现代理模式需要额外工作，有些代理模式实现很复杂。
 * <p>
 * 使用场景：按照职责划分：1.远程代理。2.虚拟代理。3：Copy-on-Write代理。4.保护（Protect or Access）代理。
 * 5.Cache代理。6.防火墙（Firewall）代理。7.同步化（Synchronization）代理。8.智能引用（Smart Reference）代理
 * <p>
 * 注意事项：1.和适配器模式的区别：适配器模式主要改变所考虑对象的接口，而代理模式不能改变所代理类的接口。
 * 2.和装饰器模式的区别：装饰器模式是为了增强功能，而代理模式是为了加以控制。
 */
public class ProxyPatternDemo {
    public static void main(String[] args) {
        //当被请求时，使用ProxyAnimal来获取Monkey类的对象
        Animal animal = new ProxyAnimal("Lily");

        System.out.println("Program Run...");
        //第一次对象从远程加载
        animal.say();
        System.out.println();
        //后续不需要从远程加载
        animal.say();
        animal.say();
        animal.say();
        animal.say();
        animal.say();
        animal.say();
    }
}
