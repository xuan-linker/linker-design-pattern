package com.xlccc.composite;

/**
 * @author Linker
 * @date 2020/7/13 10:13
 * @Description:组合模式(Composite Pattern) 部分整体模式
 * 结构型模式，把一组相似对象当作一个单一对象。依据树形结构来组合对象，用来表示部分以及整体层次。
 * <p>
 * 创建了对象组的树形结构。
 * 创建了包含自己对象组的类，其提供修改相同对象组的方式。
 * <p>
 * 意图：将对象组合成树形结构表示“部分-整体”的层次结构。组合模式使得用户对单个对象和组合对象具的使用有一致性，
 * 主要解决：在树形结构问题中，模糊了简单元素与复杂元素，客户程序可以像处理简单元素一样处理复杂元素，从而使客户程序与复杂元素内部解耦。
 * 何时使用：1.想表示对象的部分-整体层次结构（树形结构）。2.希望用户忽略组合对象与单个对象的不同，用户将统一使用组合结构中的所有对象。
 * 如何解决：树枝和叶子实现统一接口，树枝内部组合该接口。
 * 关键代码：树枝内部组合该接口，并且含有内部属性List，里面放Component
 * 应用实例：
 * <p>
 * <p>
 * 优点：1.高层模块调用简单。2.节点自由增加。
 * 缺点：在使用组合模式，叶子和树枝的声明都是实现类，而不是接口，违反了依赖倒置原则。
 * <p>
 * 使用场景：部分、整体场景，如树形菜单，文件、文件夹的管理。
 * 注意事项：定义时为具体类。
 */
public class CompositePatternDemo {
    public static void main(String[] args) {
        // Init
        Employee boss = new Employee("L", "CEO", 100);

        Employee teacherLeader = new Employee("Kim", "Head Teacher", 50);
        Employee cleanLeader = new Employee("Tom", "Head Clean", 50);

        Employee teacher1 = new Employee("Lily1", "Teacher", 20);
        Employee teacher2 = new Employee("Lily2", "Teacher", 20);
        Employee teacher3 = new Employee("Lily3", "Teacher", 20);

        boss.add(teacherLeader);
        boss.add(cleanLeader);

        teacherLeader.add(teacher1);
        teacherLeader.add(teacher2);
        teacherLeader.add(teacher3);

        System.out.println(boss.toString());
        for (Employee e : boss.getSubordinates()
        ) {
            System.out.println(e.toString());
            for (Employee h : e.getSubordinates()
            ) {
                System.out.println(h);
            }
        }
    }
}
