package com.xlccc.intercepting_filter;

/**
 * @author Linker
 * @date 2020/7/15 17:04
 */
public class Client {
    FilterManager filterManager;

    public void setFilterManager(FilterManager filterManager) {
        this.filterManager = filterManager;
    }

    public void sendRequest(String request) {
        filterManager.filterRequest(request);
    }
}
