package com.xlccc.front_controller;

/**
 * @author Linker
 * @date 2020/7/15 16:25
 * @Description:调度器Dispatcher
 */
public class Dispatcher {
    private AnimalView animalView;
    private FlowerView flowerView;

    public Dispatcher() {
        animalView = new AnimalView();
        flowerView = new FlowerView();
    }

    public void dispatch(String request) {
        if (request.equalsIgnoreCase("ANIMAL")) {
            animalView.show();
        } else {
            flowerView.show();
        }
    }
}
