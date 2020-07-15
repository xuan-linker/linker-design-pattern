package com.xlccc.visitor;

/**
 * @author Linker
 * @date 2020/7/15 9:41
 * @Description:访问者模式(Visitor Pattern)，使用一个访问者类，其改变了元素类的执行算法。
 * 行为型模式，元素对象已经接收访问者对象，访问者对象即可处理元素对象上的操作。
 * <p>
 * 意图：主要将数据结构与数据操作分离。
 * 主要解决：稳定的数据结构和易变的操作耦合问题。
 * 何时使用：需要对一个对象结构中的对象进行不同的独立操作，避免让操作污染对象的类，使用访问者模式将操作封装到类
 * 如何解决：在被访问的类中添加一个对外提供处理访问的接口
 * 关键代码：在数据基础类中有一个方法接收访问者，将自身引用传入访问者。
 * 应用实例：客人去主人家做客，主人接收客人的询问，通过主人的描述，客人对其描述做了一个判断。
 * <p>
 * 优点：1.符合单一职责原则。2.优秀的拓展性。3.灵活性。
 * 缺点：1.具体元素对访问者公开细节，违法迪米特原则。2.具体元素变更比较困难。3.违法了依赖倒置原则，依赖了具体类，没有依赖抽象。
 * <p>
 * 使用场景：1.对象结构中对象对应的类很少改变，但经常需要在此对象结构上定义新的操作。
 * 2.需要对一个对象结构进行很多不相关操作，避免操作污染对象，不希望增加新操作时修改类。
 * <p>
 * 注意事项：访问者可以对功能进行统一，可以制作报表、UI、拦截器与过滤器。
 */
public class VisitorPatternDemo {
    public static void main(String[] args) {
        /**
         * 创建一个接口操作的接口ForbiddenOnePart接口，
         * LeftArm、...RightLeg实现了ForbiddenOnePart接口的实体类。
         * 定义了另一个ForbiddenOnePartVisit，定义了访问者操作。
         * ForbiddenOne作为实体类，执行操作。
         *
         */

        //创建主人
        ForbiddenOnePart forbiddenOne = new ForbiddenOne();

        //主客关联
        forbiddenOne.action(new ForbiddenOneDisplayPartVisitor());
    }
}
