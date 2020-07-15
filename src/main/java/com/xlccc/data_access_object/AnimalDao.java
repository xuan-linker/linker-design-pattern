package com.xlccc.data_access_object;

import java.util.List;

/**
 * @author Linker
 * @date 2020/7/15 15:45
 * @Description：数据访问对象接口
 */
public interface AnimalDao {
    public List<Animal> getAllAnimals();

    public Animal getAnimal(int id);

    public void updateAnimal(Animal animal);

    public void deleteAnimal(Animal animal);
}
