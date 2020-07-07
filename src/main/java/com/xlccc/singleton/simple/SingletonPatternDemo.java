package com.xlccc.singleton.simple;

/**
 * @author Linker
 * @date 2020/7/7 20:44
 */
public class SingletonPatternDemo {
    public static void main(String[] args) {

        //不合法的构造函数
        //编译时错误，构造函数私有不可见
//        SingleObject object = new SingleObject();

        //获取唯一可用对象
        SingleObject object = SingleObject.getInstance();

        //输出校验
        object.showMessage();
    }
}
