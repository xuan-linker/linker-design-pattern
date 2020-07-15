package com.xlccc.front_controller;

/**
 * @author Linker
 * @date 2020/7/15 16:27
 * @Description:前端控制器
 */
public class FrontController {
    private Dispatcher dispatcher;

    public FrontController() {
        this.dispatcher = new Dispatcher();
    }

    private boolean isAuthenticUser() {
        System.out.println("User is authenticated successfully");
        return true;
    }

    private void trackRequest(String request) {
        System.out.println("Page requested: " + request);
    }

    public void dispatchRequest(String request) {
        //记录每个请求
        trackRequest(request);
        //对用户身份验证
        if (isAuthenticUser()) {
            dispatcher.dispatch(request);
        }
    }
}
