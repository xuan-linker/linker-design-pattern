package com.xlccc.intercepting_filter;

/**
 * @author Linker
 * @date 2020/7/15 16:55
 * @Description：Target 请求处理程序。
 */
public class Target {
    public void execute(String request) {
        System.out.println("Target.execute request:" + request);
    }
}
