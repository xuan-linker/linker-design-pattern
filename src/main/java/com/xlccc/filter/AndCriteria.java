package com.xlccc.filter;

import java.util.List;

/**
 * @author Linker
 * @date 2020/7/11 18:03
 */
public class AndCriteria implements Criteria {
    private Criteria criteria;
    private Criteria otherCriteria;

    public AndCriteria(Criteria criteria, Criteria otherCriteria) {
        this.criteria = criteria;
        this.otherCriteria = otherCriteria;
    }

    @Override
    public List<Animal> meetCriteria(List<Animal> animals) {
        //满足条件一的结果
        List<Animal> firstCriteriaAnimals = criteria.meetCriteria(animals);
        //对满足条件一的结果进行筛选和返回
        return otherCriteria.meetCriteria(firstCriteriaAnimals);
    }
}
