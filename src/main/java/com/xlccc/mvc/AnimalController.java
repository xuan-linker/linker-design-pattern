package com.xlccc.mvc;

/**
 * @author Linker
 * @date 2020/7/14 11:45
 */
public class AnimalController {
   private  Animal model;
   private AnimalView view;

    public AnimalController(Animal model, AnimalView view) {
        this.model = model;
        this.view = view;
    }

    public void setAnimalName (String name){
        model.setName(name);
    }
    public String getAnimalName (){
        return model.getName();
    }
    public void setAnimalAction(String action){
        model.setAction(action);
    }
    public String getAnimalAction(){
        return model.getAction();
    }

    public void updateView(){
        view.toViewString(model.getName(),model.getAction());
    }
}
