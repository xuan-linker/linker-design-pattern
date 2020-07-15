package com.xlccc.data_access_object;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Linker
 * @date 2020/7/15 15:48
 * @Description：接口的实体类
 */
public class AnimalDaoImpl implements AnimalDao {
    List<Animal> animals;

    public AnimalDaoImpl() {
        animals = new ArrayList<Animal>();
        Animal animal1 = new Animal(0, "Lily");
        Animal animal2 = new Animal(1, "Boy");
        animals.add(animal1);
        animals.add(animal2);
    }

    @Override
    public List<Animal> getAllAnimals() {
        return animals;
    }

    @Override
    public Animal getAnimal(int id) {
        for (Animal a : animals
        ) {
            if (a.getId().equals(id)) {
                return a;
            }
        }
        return null;
    }

    @Override
    public void updateAnimal(Animal animal) {
        for (Animal a : animals
        ) {
            if (a.getId().equals(animal.getId())) {
                //随意
                animals.remove(a);
                animals.add(animal);
            }
        }
    }

    @Override
    public void deleteAnimal(Animal animal) {
        for (Animal a : animals
        ) {
            if (a.getId().equals(animal.getId())) {
                animals.remove(a);
            }
        }
    }
}
