package com.xlccc.Observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Linker
 * @date 2020/7/14 11:14
 */
public class Subject {
    private List<Observer> observerList = new ArrayList<>();

    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
        notifyAllObservers();
    }

    public void add(Observer observer) {
        observerList.add(observer);
    }

//    public void remove(Observer observer) {
//        observerList.remove(observer);
//    }

    public void notifyAllObservers() {
        for (Observer o : observerList
        ) {
            o.update();
        }
    }
}
