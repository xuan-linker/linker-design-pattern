package com.xlccc.template;

/**
 * @author Linker
 * @date 2020/7/14 18:44
 */
public abstract class Program {
    abstract void initialize();

    abstract void startRun();

    abstract void stopRun();

    //模板
    public final void Run() {
        //初始化
        initialize();
        //开始执行
        startRun();
        //停止执行
        stopRun();
    }
}
