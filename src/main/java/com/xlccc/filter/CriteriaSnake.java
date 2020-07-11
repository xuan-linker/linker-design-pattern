package com.xlccc.filter;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Linker
 * @date 2020/7/11 18:24
 */
public class CriteriaSnake implements Criteria {
    @Override
    public List<Animal> meetCriteria(List<Animal> animals) {

        List<Animal> dogAnimals = new ArrayList<Animal>();
        for (Animal animal : animals
        ) {
            if (animal.getType().equalsIgnoreCase("SNAKE")) {
                dogAnimals.add(animal);
            }
        }
        return dogAnimals;
    }
}
