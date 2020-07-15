package com.xlccc.transfer_object;


import java.util.ArrayList;
import java.util.List;

/**
 * @author Linker
 * @date 2020/7/15 17:54
 */
public class AnimalBO {
    List<AnimalVO> animals;

    public AnimalBO() {
        animals = new ArrayList<>();
        AnimalVO animal1 = new AnimalVO(1, "Lily");
        AnimalVO animal2 = new AnimalVO(2, "Dog");
        animals.add(animal1);
        animals.add(animal2);
    }

    public void deleteAnimal(int id) {
        for (AnimalVO a : animals
        ) {
            if (a.getId() == id) {
                animals.remove(a);
            }
        }
    }

    public List<AnimalVO> getAllAnimals() {
        return animals;
    }


}
