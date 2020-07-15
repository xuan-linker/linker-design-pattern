package com.xlccc.business_delegate;

/**
 * @author Linker
 * @date 2020/7/15 14:30
 * @Description：创建业务代表
 */
public class BusinessDelegate {
    private BusinessLookUp lookUpService = new BusinessLookUp();
    private BusinessService businessService;
    private String serviceType;

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }

    public void doTask() {
        businessService = lookUpService.getBusinessService(serviceType);
        businessService.doProcessing();

    }
}
