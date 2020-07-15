package com.xlccc.business_delegate;

/**
 * @author Linker
 * @date 2020/7/15 14:34
 * @Description:创建客户端
 */
public class Client {
    BusinessDelegate businessService;

    public Client(BusinessDelegate businessService) {
        this.businessService = businessService;
    }

    public void doTask() {
        businessService.doTask();
    }
}
