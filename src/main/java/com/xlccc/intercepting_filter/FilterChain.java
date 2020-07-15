package com.xlccc.intercepting_filter;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Linker
 * @date 2020/7/15 16:56
 * @Description:过滤器链
 */
public class FilterChain {
    private List<Filter> filters = new ArrayList<Filter>();
    private Target target;

    public void addFilter(Filter filter) {
        filters.add(filter);
    }

    public void execute(String request) {
        for (Filter f : filters
        ) {
            f.execute(request);
        }
        target.execute(request);
    }

    public void setTarget(Target target) {
        this.target = target;
    }
}
