package com.xlccc.service_locator;

/**
 * @author Linker
 * @date 2020/7/15 18:25
 * @Description:服务器定位模式(ServiceLocatorPattern) 在我们想使用JNDI查询定位各种服务的时候。
 * 为某个服务查询JNDI的代价很高，服务定位器模式充分利用了缓存技术。
 * 在首次请求某个服务时，服务定位器在JNDI中查找服务，并缓存该服务对象。
 * 当再请求相同服务时，服务定位器会在它的缓存中查找，其能很大程度上提高应用程序的性能。
 * <p>
 * 服务（Service） - 实际处理请求的服务，对这种服务的引用可以在JNDI服务器中查找到。
 * Context/初始的Context - JNDI Context 带有对要查找的服务的引用
 * 服务定位器（Service Location） - 服务定位器是通过JNDI查找和缓存服务来获取服务的单点接触。
 * 缓存（Cache） - 缓存存储服务的引用，以便复用
 * 客户端（Client） - Client是通过ServiceLocator调用服务的对象
 */
public class ServiceLocatorPatternDemo {
    public static void main(String[] args) {

        /**
         *  getService() ->
         *      1.getFromCache()
         *      2.getFromNewService -> addServiceToCache
         *          InitialContext -> if (true) return new Service();
         *
         */
        Service service = ServiceLocator.getService("Service1");
        service.execute();

        service = ServiceLocator.getService("Service2");
        service.execute();
        service = ServiceLocator.getService("Service1");
        service.execute();
        service = ServiceLocator.getService("Service2");
        service.execute();
    }
}
