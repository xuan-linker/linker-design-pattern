package com.xlccc.decorator;

/**
 * @author Linker
 * @date 2020/7/13 11:30
 * @Description:创建扩展AnimalDescorator类的实体装饰类
 */
public class ActionAnimalDecorator extends AnimalDecorator {

    public ActionAnimalDecorator(Animal decoratorAnimal) {
        super(decoratorAnimal);
    }

    @Override
    public void say() {
        decoratorAnimal.say();
        setAction(decoratorAnimal);
    }

    //此处可以更丰富
    private void setAction(Animal decoratorAnimal) {
        System.out.println("Animal Action: Jump");
    }
}
