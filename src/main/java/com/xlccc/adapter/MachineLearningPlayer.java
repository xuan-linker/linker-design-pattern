package com.xlccc.adapter;

/**
 * @author Linker
 * @date 2020/7/10 15:19
 * @Description:ComputerPro接口的实体类
 */
public class MachineLearningPlayer implements ComputerPro {

    @Override
    public void playThreeAGames(String game) {
        //do nothing
    }

    @Override
    public void playMachineLearning(String learningWork) {
        System.out.println("Study MachineLearning work:" + learningWork);
    }


}
