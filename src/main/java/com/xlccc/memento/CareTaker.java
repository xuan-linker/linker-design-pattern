package com.xlccc.memento;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Linker
 * @date 2020/7/14 9:59
 * @Description：二级缓存记录
 */
public class CareTaker {
    private List<Memento> mementoList = new ArrayList<Memento>();

    public void add(Memento state) {
        mementoList.add(state);
    }

    public Memento get(int index) {
        return mementoList.get(index);
    }
}
