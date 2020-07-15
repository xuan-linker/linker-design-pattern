package com.xlccc.intercepting_filter;

/**
 * @author Linker
 * @date 2020/7/15 16:52
 * @Description：过滤器接口
 */
public interface Filter {
    public void execute(String request);
}
