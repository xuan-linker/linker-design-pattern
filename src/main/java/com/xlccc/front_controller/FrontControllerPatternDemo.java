package com.xlccc.front_controller;

/**
 * @author Linker
 * @date 2020/7/15 16:14
 * @Description:前端控制器模式（Front Controller Pattern）
 * 提供一个集中的请求处理机制，所有的请求都将由一个单一的处理程序处理。
 * 该处理程序可以做认证/授权/记录日志，或者跟踪请求，然后把请求传给相应的处理程序。
 * <p>
 * 前端控制器（Front Controller） - 处理应用程序所有类型请求的单个处理程序，应用程序可以是基于web的应用程序，也可以是基于桌面的应用程序
 * 调度器（Dispatcher） - 前端控制器可能使用一个调度器对象来调度请求到相应的具体处理程序。
 * 视图（View） - 视图是为请求而创建的对象
 */
public class FrontControllerPatternDemo {
    public static void main(String[] args) {
        FrontController frontController = new FrontController();

        frontController.dispatchRequest("ANIMAL");
        frontController.dispatchRequest("FLOWER");
    }
}
