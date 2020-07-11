package com.xlccc.bridge;

/**
 * @author Linker
 * @date 2020/7/10 22:33
 * @Description：使用SayAPI接口创建抽象类People
 * 3-1
 */
public abstract class People {
    protected SayAPI sayAPI;

    public People(SayAPI sayAPI) {
        this.sayAPI = sayAPI;
    }

    public abstract void say();
}
