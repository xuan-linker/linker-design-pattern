package com.xlccc.bridge;

/**
 * @author Linker
 * @date 2020/7/10 22:35
 * @Description：创建实现People接口的实体类
 * 4-1
 */
public class BoysAndGirls extends People {

    private String object, word;

    public BoysAndGirls(String object , String word , SayAPI sayAPI) {
        super(sayAPI);
        this.object = object ;
        this.word = word;
    }

    @Override
    public void say() {
        sayAPI.say(object,word);
    }
}
