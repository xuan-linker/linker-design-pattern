package com.xlccc.chain;

/**
 * @author Linker
 * @date 2020/7/13 16:49
 * @Description：创建扩展了记录器类的实体类
 */
public class CommonLogger extends AbstractLogger {
    public CommonLogger(int level) {
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("Common :: Logger :" + message);
    }
}
