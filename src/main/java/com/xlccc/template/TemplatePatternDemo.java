package com.xlccc.template;

/**
 * @author Linker
 * @date 2020/7/14 18:21
 * @Description:模板模式（Template Pattern），一个抽象类公开定义执行他的方法的方式/模板。
 * 行为型模式，子类可以按需要重写方法实现，但调用将以抽象类中定义的方式进行。
 * <p>
 * 意图：定义一个操作中的算法的骨架，将一些步骤延迟到子类中。模板方法使得子类可以不改变一个算法的结构即可重定义该算法的某些特定步骤。
 * 主要解决：一些方法通用，却在每一个子类都重新写了这一方法。
 * 何时使用：一些通用的方法。
 * 如何解决：将这些通用算法抽象出来。
 * 应用实例：spring对Hibernate的支持，将一些已经定义好的方法封装起来，比如开启事务、获取Session、关闭Session等。
 * 程序员不重复写已经规范好的代码，直接丢一个实体即可保存。
 * <p>
 * 优点：1.封装不变部分，扩展可变部分。
 * 2.提取公共代码，便于维护。
 * 3.行为由父类控制，子类实现。
 * 缺点：每一个不同的实现都需要一个子类来实现，导致类的个数增加，使得系统更加庞大。
 * <p>
 * 使用场景：1.有多个子类共有的方法，且逻辑相同。
 * 2.重要的、复杂的方法，可以考虑模板方法。
 * 注意事项：为防止恶意操作，一般模板方法都加上final关键词。
 */
public class TemplatePatternDemo {
    public static void main(String[] args) {
        Idea idea = new Idea();
        idea.Run();

        System.out.println("------");

        Telegram telegram = new Telegram();
        telegram.Run();
    }
}
