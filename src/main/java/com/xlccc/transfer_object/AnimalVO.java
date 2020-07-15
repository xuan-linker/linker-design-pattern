package com.xlccc.transfer_object;

/**
 * @author Linker
 * @date 2020/7/15 17:53
 * @Description:传输对象
 */
public class AnimalVO {
    private int id;
    private String name;

    public AnimalVO(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "AnimalVO{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
