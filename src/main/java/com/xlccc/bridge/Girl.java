package com.xlccc.bridge;

/**
 * @author Linker
 * @date 2020/7/10 22:26
 * @Description：创建实现了SayAPI接口的实体桥接实现类
 * 1-2
 */
public class Girl implements SayAPI {
    @Override
    public void say(String object, String word) {
        System.out.println("Hello:" + object +"   "+word);
    }
}
