package com.xlccc.intercepting_filter;

/**
 * @author Linker
 * @date 2020/7/15 16:32
 * @Description:拦截过滤器模式（InterceptingFilterPattern）用于对应用程序的请求或响应做一些预处理/后处理 定义过滤器，在请求传给实际目标应用程序之前应用在请求上。
 * 过滤器可以做认证/授权/记录日志，或者跟踪请求，然后把请求传给相应的处理程序。
 * <p>
 * 过滤器（Filter） - 过滤器在请求处理程序执行请求之前或之后，执行某些任务。
 * 过滤器链（Filter Chain） - 过滤器链带有多个过滤器，并在Target上按照定义的顺序执行这些过滤器
 * Target - Target对象是请求处理程序。
 * 过滤管理器（Filter Manager） - 过滤管理器管理过滤器和过滤器链
 * 客户端（Client） - Client是向Target对象发送请求的对象
 */
public class InterceptingFilterPatternDemo {
    public static void main(String[] args) {

        /**
         * client 简单调用FilterManager
         * FilterManager中简单管理FilterChain链
         * FilterChain包含过滤列表和执行方法 （核心）
         *
         * Filter实现类为过滤实际执行方法
         */
        //创建过滤器
        FilterManager filterManager = new FilterManager(new Target());
        //添加需要过滤的策略
        filterManager.setFilter(new AuthenticationFilter());
        filterManager.setFilter(new DebugFilter());

        //创建客户端
        Client client = new Client();
        //设置过滤器
        client.setFilterManager(filterManager);
        //执行请求
        client.sendRequest("HOME");
    }
}
