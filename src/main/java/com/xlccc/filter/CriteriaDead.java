package com.xlccc.filter;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Linker
 * @date 2020/7/11 17:59
 */
public class CriteriaDead implements Criteria{
    @Override
    public List<Animal> meetCriteria(List<Animal> animals) {
        List<Animal> deadAnimals  = new ArrayList<Animal>();
        for (Animal animal:animals
             ) {
            if (animal.getDeath().equalsIgnoreCase("DEAD")){
                deadAnimals.add(animal);
            }
        }
        return deadAnimals;
    }
}
