package com.xlccc.composite_entity;

/**
 * @author Linker
 * @date 2020/7/15 15:19
 * @Description：粗粒度对象2-1 有自己的生命周期，也能管理依赖对象的生命周期
 */
public class CoarseGrainedObject {
    DependentObject1 dp1 = new DependentObject1();
    DependentObject2 dp2 = new DependentObject2();

    public void setData(String data1, String data2) {
        dp1.setData(data1);
        dp2.setData(data2);
    }

    public String[] getData() {
        return new String[]{dp1.getData(), dp2.getData()};
    }

}
