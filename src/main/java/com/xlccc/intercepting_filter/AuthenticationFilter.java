package com.xlccc.intercepting_filter;

/**
 * @author Linker
 * @date 2020/7/15 16:54
 * @Description：实体过滤器
 */
public class AuthenticationFilter implements Filter {

    @Override
    public void execute(String request) {
        System.out.println("AuthenticationFilter.execute request:" + request);
    }
}
