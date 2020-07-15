package com.xlccc.transfer_object;

import com.xlccc.filter.Animal;

/**
 * @author Linker
 * @date 2020/7/15 17:26
 * @Description:传输对象模式（TransferObjectPattern） 从客户端向服务器一次性传递带有多个属性的数据。传输对象为数据的值。
 * 传输对象是一个具有getter/setter方法的简单的POJO类，可序列化，因此可以通过网络传输。没有任何行为。
 * 服务器端的业务类通常从数据库读取数据，然后填充POJO，并把他发送到客户端或按值传递它。对于客户端，传输对象是可读的。客户端可以创建自己的传输对象，并把它传递给服务器，以便一次性更新数据库中的数值
 * <p>
 * 业务对象（Business Object） - 为传输对象填充数据的业务服务
 * 传输对象（Transfer Object） - 简单的POJO，只有设置/获取属性的方法。
 * 客户端（Client） - 客户端可以发送请求或者发送传输对象到业务对象
 */
public class TransferObjectPatternDemo {
    public static void main(String[] args) {
        AnimalBO animalBO = new AnimalBO();

        for (AnimalVO a : animalBO.getAllAnimals()
        ) {
            System.out.println(a.toString());
        }
        System.out.println("------");
        animalBO.deleteAnimal(1);
        for (AnimalVO a : animalBO.getAllAnimals()
        ) {
            System.out.println(a.toString());
        }
    }

}
