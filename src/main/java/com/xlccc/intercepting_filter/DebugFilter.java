package com.xlccc.intercepting_filter;

/**
 * @author Linker
 * @date 2020/7/15 16:55
 * @Description：实体过滤器
 */
public class DebugFilter implements Filter {
    @Override
    public void execute(String request) {
        System.out.println("DebugFilter.execute request:" + request);
    }
}
