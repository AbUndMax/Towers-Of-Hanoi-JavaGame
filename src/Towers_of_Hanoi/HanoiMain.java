package Towers_of_Hanoi;

import Towers_of_Hanoi.HanoiSwingComponents.HanoiFrame;
import Towers_of_Hanoi.HanoiSwingComponents.HanoiIntroductionDialog;

public class HanoiMain {

    public static final HanoiFrame game = new HanoiFrame();

    public static final HanoiIntroductionDialog introductionDialog = new HanoiIntroductionDialog();

    public static void main(String[] args){

        introductionDialog.setVisible(true);
    }
}
