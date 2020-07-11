package com.xlccc.filter;

/**
 * @author Linker
 * @date 2020/7/11 17:34
 * @Description:标准实体类
 */
public class Animal {
    private String name;
    private String type;
    private String death;

    public Animal(String name, String type, String death) {
        this.name = name;
        this.type = type;
        this.death = death;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDeath() {
        return death;
    }

    public void setDeath(String death) {
        this.death = death;
    }
}
