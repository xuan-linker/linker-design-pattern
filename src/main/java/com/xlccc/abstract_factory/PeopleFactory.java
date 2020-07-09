package com.xlccc.abstract_factory;

/**
 * @author Linker
 * @date 2020/7/9 22:51
 * @Description：创建People的工厂类，基于给定信息生成实体类
 */
public class PeopleFactory extends AbstractFactory{
    @Override
    public People getPeople(String people) {
        if (people == null){
            return null;
        }

        if (people.equalsIgnoreCase("YELLOW")){
            return new YellowMan();
        }else if (people.equalsIgnoreCase("BLACK")){
            return new BlackMan();
        }else if (people.equalsIgnoreCase("WHITE")){
            return new WhiteWomen();
        }
        return null;
    }

    @Override
    public Animal getAnimal(String animal) {
        return null;
    }
}
