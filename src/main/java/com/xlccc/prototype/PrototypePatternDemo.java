package com.xlccc.prototype;

/**
 * @author Linker
 * @date 2020/7/10 0:51
 * @Description：使用ShapeCache类来获取存储在HashTable中的Animal的克隆 原型模式（Prototype Pattern）
 * 用于创建重复的对象，同时又能保证性能。
 * 创建型模式，提供一种创建对象的最佳方式。
 * <p>
 * 实现一个原型接口，该接口用于创建当前对象的克隆。
 * 当直接创建对象代价比较大，采用该模式。
 * 例如：一个对象需要高代价的数据库操作才能被创建。我们可以缓存对象，在下一个请求的时候返回他的克隆，需要的时候更新数据库，以此减少数据库调用。
 * <p>
 * 意图：用原型实例，指定床架你对象的种类，并通过拷贝这些原型创建新的对象。
 * 主要解决：在运行期间建立和删除原型。
 * 何时使用：1.当一个类的实例只能有几个不同状态组合中的一种的时候，也许创建原型并克隆会比手工实例化方便。
 * 2.实例化的类运行时指定的，例如通过动态装载。
 * <p>
 * 如何解决：利用已有的一个原型对象，快速生成和原型对象一样的实例。
 * 关键代码：1.实现克隆操作，在Java继承Cloneable，重写clone()，
 * 在.NET中使用Object类的MemberwiseClone()方法来事项对象的浅拷贝或通过序列化的方式来实现深拷贝。
 * 2.原型模式同样用于隔离类对象的使用者和具体类型（易变类）之间的耦合关系，他同样要求这些易变类拥有稳定的接口。
 * <p>
 * 应用实例：1.细胞分裂。2.Java中的Object clone（）方法。
 * <p>
 * 优点：1.性能提高。2.逃避构造函数的约束。
 * 缺点：1.配备克隆方法需要对类的功能进行全局考虑，对于全新的类不是很难，对于已有的类不一定容易，
 * 尤其当一个类引用不支持串行化的间接对象，或者引用含有循环结构的时候。
 * 2.必须实现Cloneable接口。
 * <p>
 * 使用场景：1.资源优化。
 * 2.类初始化需要消耗非常多的资源。包括数据、硬件资源等
 * 3.性能和安全要求的场景。
 * 4.通过new一个对象需要非常繁琐的数据准备或者访问权限。
 * 5.一个对象多个修改者场景。
 * 6.一个对象需要给多人使用，并各个调用者都要修改对应值时。
 * 7.实际使用中，原型模式很少单独出现，一般和工厂方法模式一起出现，通过clone的方法创建一个对象，由工厂方法提供给调用者。
 * <p>
 * 注意事项：与通过一个类实例化来构造新对象不同的是。原型模式通过拷贝一个现有对象生成新对象。
 * 浅拷贝实现cloneable，重写，深拷贝是通过实现Serializable读取二进制流。
 */
public class PrototypePatternDemo {
    public static void main(String[] args) {
        AnimalCache.loadCache();

        Animal cloneAnimal = (Animal) AnimalCache.getAnimal("1");
        System.out.println("Animal:" + cloneAnimal.getType());

        Animal cloneAnimal2 = (Animal) AnimalCache.getAnimal("2");
        System.out.println("Animal:" + cloneAnimal.getType());

        Animal cloneAnimal3 = (Animal) AnimalCache.getAnimal("3");
        System.out.println("Animal: " + cloneAnimal3.getType());
    }
}
