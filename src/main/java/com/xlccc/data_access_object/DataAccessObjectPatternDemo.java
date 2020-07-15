package com.xlccc.data_access_object;

/**
 * @author Linker
 * @date 2020/7/15 15:39
 * @Description:数据访问对象模式（Data Access Object pattern）或DAO模式
 * 把低级的数据访问API或操作从高级的业务服务中分离出来。
 * <p>
 * 数据访问对象接口（Data Access object Interface） - 该接口定义了模型对象上要执行的标准操作。
 * 数据访问对象实体类（Data Access Object concrete class） - 该类实现了上述的接口，该类负责从数据源获取经验，数据源
 * 可以是数据库，也可以其他存储机制
 * <p>
 * 模型对象/数值对象（Model Object / Value Object） - 该对象是简单的POJO，包含了get/set方法来存储通过使用DAO类检索到的数据
 */
public class DataAccessObjectPatternDemo {
    public static void main(String[] args) {
        AnimalDao animalDao = new AnimalDaoImpl();

        for (Animal a : animalDao.getAllAnimals()
        ) {
            System.out.println(a.toString());
        }

        System.out.println("------");

        Animal updateExample = new Animal(1, "Kk");
        animalDao.updateAnimal(updateExample);
        System.out.println(animalDao.getAnimal(updateExample.getId()).toString());
    }
}
