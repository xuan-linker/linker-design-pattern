package com.xlccc.business_delegate;

/**
 * @author Linker
 * @date 2020/7/15 14:22
 * @Description：实体服务类
 */
public class JMSService implements BusinessService {
    @Override
    public void doProcessing() {
        System.out.println("JMS Service");
    }
}
