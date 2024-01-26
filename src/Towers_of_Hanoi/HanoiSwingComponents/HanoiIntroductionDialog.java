package Towers_of_Hanoi.HanoiSwingComponents;

import Towers_of_Hanoi.HanoiMain;

import javax.swing.*;
import java.awt.*;

public class HanoiIntroductionDialog extends JDialog {

    private BoxLayout boxYLayout = new BoxLayout(this.getContentPane(), BoxLayout.Y_AXIS);

    private JLabel introduction = new JLabel();

    private JButton playGame = new JButton("play the game");

    private JPanel labelPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
    private JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));


    public HanoiIntroductionDialog() {
        super(HanoiMain.game, "This is HANOI", true);
        setSize(new Dimension(450, 300));
        setResizable(true);
        setLocationRelativeTo(HanoiMain.game);
        setLayout(boxYLayout);

        setupIntroductionLabel();
        setupButton();

        add(Box.createVerticalGlue());
        add(labelPanel);
        add(Box.createVerticalStrut(10));
        add(buttonPanel);
        add(Box.createVerticalGlue());
    }

    // Introduction to the game
    private void setupIntroductionLabel(){
        introduction.setText(
                "<html><div style='width:330px;'>" +
                        "<strong><font size=\"5\">Here are the rules of the game:</font></strong><br>" +
                        "<ol>" +
                        "<li>You can move only one disc at a time.</li>" +
                        "<li>Every move involves removing the top disc from one of the stacks and placing it on another stack or an empty rod.</li>" +
                        "<li>A disc cannot be placed on top of a smaller disc.</li>" +
                        "</ol>" +
                        "<p><strong>Commands:</strong></p>" +
                        "<ul>" +
                        "<li>\"&lt;\" moves the top disc to the next stack on the <strong>left<strong>.</li>" +
                        "<li>\"&lt;&lt;\" moves the top disc <strong>two</strong> stacks to the left.</li>" +
                        "<li>\"&gt;\" moves the top disc to the next stack on the <strong>right<strong>.</li>" +
                        "<li>\"&gt;&gt;\" moves the top disc <strong>two</strong> stacks to the right.</li>" +
                        "</ul>" +
                        "</html>"
        );
        labelPanel.add(introduction);
    }

    // Button to start the game
    private void setupButton(){
        playGame.addActionListener(e -> {
            dispose();
            HanoiMain.game.setVisible(true);
        });
        buttonPanel.add(playGame);
    }
}
