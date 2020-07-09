package com.xlccc.prototype;

/**
 * @author Linker
 * @date 2020/7/10 0:33
 * @Description:创建一个实现了Cloneable接口的抽象类
 */
public abstract class Animal implements Cloneable {

    private String id;
    protected String type;

    abstract void birth();

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    @Override
    protected Object clone() {
        Object clone = null;

        try {
            clone = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    }
}
