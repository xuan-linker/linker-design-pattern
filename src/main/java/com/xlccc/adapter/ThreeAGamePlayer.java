package com.xlccc.adapter;

/**
 * @author Linker
 * @date 2020/7/10 15:18
 * @Description:ComputerPro接口的实体类
 */
public class ThreeAGamePlayer implements ComputerPro {
    @Override
    public void playThreeAGames(String game) {
        System.out.println("Playing three A games. Name:" + game);
    }

    @Override
    public void playMachineLearning(String learningWork) {
        //do nothing
    }


}
