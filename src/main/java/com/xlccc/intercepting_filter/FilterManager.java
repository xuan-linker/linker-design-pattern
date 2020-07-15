package com.xlccc.intercepting_filter;

/**
 * @author Linker
 * @date 2020/7/15 16:59
 * @Description:过滤管理器 管理过滤器和过滤器链。
 */
public class FilterManager {
    //过滤链
    FilterChain filterChain;

    public FilterManager(Target target) {
        filterChain = new FilterChain();
        filterChain.setTarget(target);
    }

    public void setFilter(Filter filter) {
        filterChain.addFilter(filter);
    }

    public void filterRequest(String request) {
        filterChain.execute(request);
    }
}
