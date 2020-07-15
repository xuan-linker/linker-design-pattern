package com.xlccc.data_access_object;

/**
 * @author Linker
 * @date 2020/7/15 15:43
 * @Description:实体类
 */
public class Animal {
    private Integer id;
    private String name;

    public Animal(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
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
        return "Animal{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
