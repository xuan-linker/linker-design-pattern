package com.xlccc.business_delegate;

/**
 * @author Linker
 * @date 2020/7/15 14:27
 * @Description:业务查询服务
 */
public class BusinessLookUp {
    public BusinessService getBusinessService(String serviceType) {
        if (serviceType.equalsIgnoreCase("EJB")) {
            return new EJBService();
        } else {
            return new JMSService();
        }
    }
}
