package com.xlccc.adapter;

/**
 * @author Linker
 * @date 2020/7/10 15:25
 * @Description：一个实现了ComputerAir接口的适配器类，从而增加/拓展了Pro的功能
 */
public class ComputerAdapter implements ComputerAir {
    ComputerPro computerPro;

    public ComputerAdapter(String playType) {
        if (playType.equalsIgnoreCase("ThreeAGame")) {
            computerPro = new ThreeAGamePlayer();
        } else if (playType.equalsIgnoreCase("MachineLearning")) {
            computerPro = new MachineLearningPlayer();
        }
    }

    @Override
    public void play(String workType, String fileName) {
        if (workType.equalsIgnoreCase("ThreeAGame")) {
            computerPro.playThreeAGames(fileName);
        } else if (workType.equalsIgnoreCase("MachineLearning")) {
            computerPro.playMachineLearning(fileName);
        }
    }
}
