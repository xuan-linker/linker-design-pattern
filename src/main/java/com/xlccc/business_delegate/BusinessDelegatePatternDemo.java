package com.xlccc.business_delegate;

/**
 * @author Linker
 * @date 2020/7/15 14:11
 * @Description：业务代表模式（Business Delegate pattern），用于对表示层和业务层解耦。
 * 减少通信或对表示层代码中业务层代码的远程查询功能。
 * <p>
 * 客户端（Client） - 表示层代码可以是JSP、servlet或UI java 代码。
 * 业务代表（Business Delegate） - 一个为客户端实体提供的入口类，他提供了对业务方法的访问。
 * 查询服务（LookUp Service） - 查找服务对象负责获取相关的业务实现，并提供业务对象对业务代表对象的访问。
 * 业务服务（Business Service） - 业务服务接口。实现了该物业务服务的实体类，提供了实际的业务实现逻辑。
 */
public class BusinessDelegatePatternDemo {
    public static void main(String[] args) {
        /**
         * Author:方法数量不多，不建议采用。凭空增加二次选择的成本。
         */
        BusinessDelegate businessDelegate = new BusinessDelegate();
        businessDelegate.setServiceType("EJB");

        Client client = new Client(businessDelegate);
        client.doTask();

        businessDelegate.setServiceType("JMS");
        client.doTask();
    }
}
