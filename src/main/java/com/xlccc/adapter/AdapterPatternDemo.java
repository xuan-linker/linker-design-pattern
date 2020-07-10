package com.xlccc.adapter;

/**
 * @author Linker
 * @date 2020/7/10 15:50
 * @Description：使用AutoComputerPlayer来调用Computer的不同功能 适配器模式（Adapter Pattern）
 * 作为两个不兼容接口之间的桥梁
 * 结构型模式，结合了两个独立接口的功能。
 * 涉及到一个单一的类，其负责加入独立的或不兼容的接口功能。
 * <p>
 * 意图：将一个类的接口转化为客户希望的另外一个接口。适配器模式使得原本由于接口不兼容而不能一起工作的那些类可以一起工作。
 * 主要解决：软件系统中，将一些“现存对象”放到新的环境中，而新环境要求的接口是现对象不能满足的。
 * 何时使用：1.系统需要使用现有的类，而此类的接口不符合系统的需要。
 * 2.想要建立一个可以重复使用的类，用于一些彼此之间没有太大关联的一些类，包括一些可能在将来引进的类一起工作，这些源类不一定有一致的接口。
 * 3.通过接口转换，将一个类插入另一个类系中。
 * <p>
 * 如何解决：继承或依赖（推荐）
 * <p>
 * 关键代码：适配器继承或依赖已有对象，实现想要的目标接口。
 * <p>
 * 应用实例：Java中JDBC。
 * 2.Java在JDK1.1中提供Enumeration接口，而在1.2中提供Iterator接口，想要使用1.2的JDK，要将以前系统的Enumeration接口转为为Iterator接口，采用适配器模式。
 * 3.在Linux上运行WINDOWS程序。
 * <p>
 * 优点：可以让任何两个没有关联的类一起运行。2.提高了类的复用。3.增加了类的透明度。4.灵活性好。
 * <p>
 * 缺点：1.过度使用，导致系统零乱，不易整体进行把握。比如：明明调用的是A接口，内容却被适配为B接口的实现。因此如果不是很有必要，直接对系统进行重构会更好。
 * 2.Java至多继承一个类，所以至多只能适配一个适配者类，且目标必须是抽象对象。
 * <p>
 * 使用场景：有动机地修改一个正常运行的系统的接口，此时考虑适配器模式。
 * 注意事项：适配器不是在详细设计时使用！！而是解决正在服役的项目的问题。
 */
public class AdapterPatternDemo {
    public static void main(String[] args) {
        AutoComputerPlayer computerPlayer = new AutoComputerPlayer();

        computerPlayer.play("YouTuBe", "Where E.T. ");
        computerPlayer.play("ThreeAGame", "4399");
        computerPlayer.play("MachineLearning", "play go-bang");
        computerPlayer.play("1", "2");
    }
}
