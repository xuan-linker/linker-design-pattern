package com.xlccc.chain;

/**
 * @author Linker
 * @date 2020/7/13 16:52
 * @Description：创建扩展了记录器类的实体类
 */
public class FileLogger extends AbstractLogger {
    public FileLogger(int level) {
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("File :: Logger : " + message);
    }
}
