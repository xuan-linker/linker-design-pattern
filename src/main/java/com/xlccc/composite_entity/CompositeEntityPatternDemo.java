package com.xlccc.composite_entity;

/**
 * @author Linker
 * @date 2020/7/15 14:53
 * @Description:组合实体模式（Composite Entity Pattern）用在EJB持久化机制中。
 * 一个组合实体是一个EJB实体bean，代表了对象的图解。
 * 当更新一个组合实体时，内部依赖对象beans会自动更新，因为他们是由EJB实体bean管理的。
 * <p>
 * 组合实体（Composite Entity） - 主要的实体bean。可以是粗粒度的，或者可以包含一个粗粒度对象，用与持续生命周期。
 * 粗粒度对象（Coarse-Grained Object） - 该对象包含依赖对象。有自己的生命周期，能管理依赖对象的生命周期。
 * 依赖对象（Dependent Object） - 依赖对象是一个持续生命周期依赖于粗粒度对象的对象
 * 策略（Strategies） - 策略表示如何实现组合实体
 */
public class CompositeEntityPatternDemo {
    public static void main(String[] args) {
        /**
         *  在Client客户端中创建了默认的组合实体，
         *  组合实体默认创建粗粒度对象，
         *  粗粒度对象默认创建多依赖实体
         */
        Client client = new Client();
        client.setData("Test", "Data");
        client.printData();

        client.setData("demo1", "demo2");
        client.printData();
    }
}
