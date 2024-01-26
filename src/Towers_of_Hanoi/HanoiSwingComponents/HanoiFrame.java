package Towers_of_Hanoi.HanoiSwingComponents;

/*
Funktionen:
- user input sagt welcher wohin

drei Stacks á vier Höhen
 */

import Towers_of_Hanoi.HanoiObjects.HanoiEngine;

import javax.swing.*;
import java.awt.*;

public class HanoiFrame extends JFrame {

    private final HanoiEngine engine = new HanoiEngine();

    private final ButtonPanel stack1Buttons = new ButtonPanel();
    private final ButtonPanel stack2Buttons = new ButtonPanel();
    private final ButtonPanel stack3Buttons = new ButtonPanel();

    private final TowerPanel tower1 = new TowerPanel(engine.getFirstTowerStack());
    private final TowerPanel tower2 = new TowerPanel(engine.getSecondTowerStack());
    private final TowerPanel tower3 = new TowerPanel(engine.getThirdTowerStack());

    private final TowerPanel[] towerPanels = {tower1, tower2, tower3};

    private final ButtonListener buttonListener = new ButtonListener(engine, towerPanels);

    private final JPanel pane1 = new JPanel(new BorderLayout());
    private final JPanel pane2 = new JPanel(new BorderLayout());
    private final JPanel pane3 = new JPanel(new BorderLayout());


    public HanoiFrame(){
        setTitle("Towers of Hanoi");
        setLayout(new GridLayout(1, 3));
        setSize(500, 300);
        setResizable(false);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        setupButtonPanes();
        setupFullPanes();

        add(pane1);
        add(pane2);
        add(pane3);
    }

    private void setupButtonPanes(){
        stack1Buttons.setButtonTopName(">");
        stack1Buttons.setButtonTopCommand("move1-2");
        stack1Buttons.setButtonBotName(">>");
        stack1Buttons.setButtonBotCommand("move1-3");
        stack1Buttons.addActionListener(buttonListener);

        stack2Buttons.setButtonTopName("<");
        stack2Buttons.setButtonTopCommand("move2-1");
        stack2Buttons.setButtonBotName(">");
        stack2Buttons.setButtonBotCommand("move2-3");
        stack2Buttons.addActionListener(buttonListener);

        stack3Buttons.setButtonTopName("<");
        stack3Buttons.setButtonTopCommand("move3-2");
        stack3Buttons.setButtonBotName("<<");
        stack3Buttons.setButtonBotCommand("move3-1");
        stack3Buttons.addActionListener(buttonListener);
    }

    private void setupFullPanes(){
        pane1.add(tower1, BorderLayout.CENTER);
        pane1.add(stack1Buttons, BorderLayout.SOUTH);

        pane2.add(tower2, BorderLayout.CENTER);
        pane2.add(stack2Buttons, BorderLayout.SOUTH);

        pane3.add(tower3, BorderLayout.CENTER);
        pane3.add(stack3Buttons, BorderLayout.SOUTH);
    }


}
