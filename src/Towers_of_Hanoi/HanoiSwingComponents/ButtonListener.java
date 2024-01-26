package Towers_of_Hanoi.HanoiSwingComponents;

import Towers_of_Hanoi.HanoiObjects.HanoiEngine;
import Towers_of_Hanoi.HanoiSwingComponents.TowerPanel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonListener implements ActionListener {

    private HanoiEngine engine;
    private TowerPanel[] towerPanels;

    public ButtonListener(HanoiEngine engine, TowerPanel[] towerPanels){
        this.engine = engine;
        this.towerPanels = towerPanels;
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();

        switch(command){
            case "move1-2":
                engine.moveFromTo(1, 2);
                break;

            case "move1-3":
                engine.moveFromTo(1, 3);
                break;

            case "move2-1":
                engine.moveFromTo(2, 1);
                break;

            case "move2-3":
                engine.moveFromTo(2, 3);
                break;

            case "move3-1":
                engine.moveFromTo(3, 1);
                break;

            case "move3-2":
                engine.moveFromTo(3, 2);
                break;
        }

        for (TowerPanel towerPanel : towerPanels) {
            towerPanel.revalidate();
            towerPanel.repaint();
        }
    }
}
