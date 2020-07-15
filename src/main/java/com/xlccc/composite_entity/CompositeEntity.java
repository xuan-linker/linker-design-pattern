package com.xlccc.composite_entity;

/**
 * @author Linker
 * @date 2020/7/15 15:22
 * @Description：组合实体3-1 用于持续生命周期的管理
 */
public class CompositeEntity {
    private CoarseGrainedObject cgo = new CoarseGrainedObject();

    public void setData(String data1, String data2) {
        cgo.setData(data1, data2);
    }

    public String[] getData() {
        return cgo.getData();
    }
}
