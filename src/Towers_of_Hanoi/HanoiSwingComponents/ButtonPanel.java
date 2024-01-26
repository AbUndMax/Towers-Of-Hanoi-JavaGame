package Towers_of_Hanoi.HanoiSwingComponents;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;


// simple buttonPanel with two buttons
public class ButtonPanel extends JPanel {

    private JButton buttonTop = new JButton();
    private JButton buttonBot = new JButton();

    ButtonPanel(){
        setLayout(new GridLayout(2, 1));

        add(buttonTop);
        add(buttonBot);

        setPreferredSize(new Dimension(this.getPreferredSize().width, 80));
    }

    public void addActionListener(ActionListener listener){
        buttonTop.addActionListener(listener);
        buttonBot.addActionListener(listener);
    }

    // set the Button Names
    public void setButtonTopName(String name) {
        buttonTop.setText(name);
    }

    public void setButtonBotName(String name) {
        buttonBot.setText(name);
    }

    // set the commands
    public void setButtonTopCommand(String command) {
        buttonTop.setActionCommand(command);
    }

    public void setButtonBotCommand(String command) {
        buttonBot.setActionCommand(command);
    }
}
