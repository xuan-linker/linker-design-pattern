package com.xlccc.filter;

import com.xlccc.prototype.Dog;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Linker
 * @date 2020/7/11 17:51
 * @Description:实现了Criteria接口的实体类
 */
public class CriteriaDog implements Criteria {
    @Override
    public List<Animal> meetCriteria(List<Animal> animals) {

        List<Animal> dogAnimals = new ArrayList<Animal>();
        for (Animal animal : animals
        ) {
            if (animal.getType().equalsIgnoreCase("DOG")) {
                dogAnimals.add(animal);
            }
        }
        return dogAnimals;
    }
}
