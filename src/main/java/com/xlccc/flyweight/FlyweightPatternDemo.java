package com.xlccc.flyweight;

/**
 * @author Linker
 * @date 2020/7/13 13:43
 * @Description:享元模式(Flyweight Pattern) 主要减少创建对象的数量，以减少内存占用和提高性能。
 * 结构型模式，提供了减少对象数量从而改善所需的对象结构的方法。
 * 享元模式尝试重用现有的同类对象，如果未找到匹配的对象则创建新对象。
 * <p>
 * 意图：运用共享技术有效地支持大量细粒度的对象。
 * 主要解决：在有大量对象时，可能造成内存溢出，我们把其中共同的部分抽象出来，如果有相同的业务请求，直接返回在内存中已有的对象，避免重复创建。
 * 何时使用：1.系统中有大量对象。2.这些对象消耗大量内存。3.这些对象的状态大部分可以外部化。
 * 4.这些对象按照内蕴状态分为很多组，当把外蕴对象从对象中剔除出来时，每一组对象都可以用一个对象来替代。
 * 5.系统不依赖于这些对象身份，这些对象是不可分辨的。
 * <p>
 * 如何解决：用唯一标识码判断，如果在内存中有，则返回这个唯一识别码所标识的对象。
 * 关键代码：用HashMap存储这些对象。
 * 应用实例：1.Java中的String，如果有则返回，如果没有则创建一个字符串保存在字符串缓存池中。
 * 2.数据库的数据池。
 * <p>
 * 优点：大大减少对象的创建，降低系统的内存，使效率提高。
 * 缺点：提高了系统的复杂度，需要分离出外部状态和内部状态，而且外部状态具有固化的性质，不应该随着内部状态的变化而变化，否则会造成系统的混乱。
 * <p>
 * 使用场景：1.系统有大量相似对象。2.需要缓冲池的场景。
 * 注意事项：1.注意划分外部状态和内部状态，否则可能引起线程安全问题。
 * 2.这些类必须有一个工厂对象加以控制。
 */
public class FlyweightPatternDemo {
    //使用该工厂，通过传递种类信息来获取实体类的对象
    private static final String types[] =
            {"Teddy", "Akita", "Huskie"};

    public static void main(String[] args) {
        for (int i = 0; i < 20; i++) {
            Dog dog = (Dog) AnimalFactory.getDog(getRandomType());

            dog.setAge(getRandomAge());
            dog.setName(getRandomName());
            dog.say();
        }
    }

    private static String getRandomType() {
        return types[(int) (Math.random() * types.length)];
    }

    private static String getRandomName() {
        return "Lily" + (int) (Math.random() * 100);
    }

    private static String getRandomAge() {
        return "" + (int) (Math.random() * 100);
    }
}
