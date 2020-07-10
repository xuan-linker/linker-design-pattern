package com.xlccc.adapter;

/**
 * @author Linker
 * @date 2020/7/10 15:41
 * @Description:调用了Adapter适配器，达到不同功能同一接口的目的。
 */
public class AutoComputerPlayer implements ComputerAir {
    ComputerAdapter computerAdapter;

    @Override
    public void play(String workType, String fileName) {
        if (workType.equalsIgnoreCase("YouTuBe")) {
            System.out.println("Play YouTuBe file. Name:" + fileName);
        } else if (workType.equalsIgnoreCase("ThreeAGame") ||
                workType.equalsIgnoreCase("MachineLearning")) {
            computerAdapter = new ComputerAdapter(workType);
            computerAdapter.play(workType, fileName);
        }else{
            System.out.print("Init Error." + workType + " can't do it for you.");
        }
    }
}
