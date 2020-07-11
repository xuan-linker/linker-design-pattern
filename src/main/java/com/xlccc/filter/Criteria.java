package com.xlccc.filter;

import java.util.List;

/**
 * @author Linker
 * @date 2020/7/11 17:38
 * @Description:标准(Criteria)创建一个接口
 */
public interface Criteria {
    //满足标准
    public List<Animal> meetCriteria(List<Animal> animals);
}
