package com.xlccc.service_locator;

/**
 * @author Linker
 * @date 2020/7/15 19:18
 * @Description：实体服务
 */
public class Service1 implements Service {
    @Override
    public String getName() {
        return "Service1";
    }

    @Override
    public void execute() {
        System.out.println("Service1.execute");
    }
}
