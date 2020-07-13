package com.xlccc.proxy;

/**
 * @author Linker
 * @date 2020/7/13 15:02
 * @Description：实现接口的实体类
 */
public class ProxyAnimal implements Animal {
    private Monkey monkey;

    private String name;

    public ProxyAnimal(String name) {
        this.name = name;
    }

    @Override
    public void say() {
        //如果对象不存在，则生成对象并从远程加载
        if (monkey == null) {
            monkey = new Monkey(name);
        }
        monkey.say();
    }
}
