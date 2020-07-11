package com.xlccc.filter;

import java.util.List;

/**
 * @author Linker
 * @date 2020/7/11 18:06
 */
public class OrCriteria implements Criteria {
    private Criteria criteria;
    private Criteria otherCriteria;

    public OrCriteria(Criteria criteria, Criteria otherCriteria) {
        this.criteria = criteria;
        this.otherCriteria = otherCriteria;
    }

    @Override
    public List<Animal> meetCriteria(List<Animal> animals) {
        List<Animal> firstCriteriaItems = criteria.meetCriteria(animals);
        List<Animal> otherCriteriaItems = otherCriteria.meetCriteria(animals);


        for (Animal animal : otherCriteriaItems
        ) {
            //如果满足条件一的结果集合中不包含满足条件二的数据，则添加进条件一对应的结果中
            if (!firstCriteriaItems.contains(animal)) {
                firstCriteriaItems.add(animal);
            }
        }
        return firstCriteriaItems;
    }
}
