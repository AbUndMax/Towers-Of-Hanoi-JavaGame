package Towers_of_Hanoi.HanoiSwingComponents;

import Generic_stack.ExtendedGenericStack;
import Towers_of_Hanoi.HanoiObjects.Disc;

import javax.swing.*;
import java.awt.*;

public class TowerPanel extends JPanel {

    private ExtendedGenericStack<Disc> discStack;

    public TowerPanel(ExtendedGenericStack<Disc> discStack){
        this.discStack = discStack;

    }

    protected void paintComponent(Graphics g){
        //g.fillRect(10, 10, 10, 100);

        for (Disc disc : discStack.getObjectsInStack()) {
            if (disc != null) {
                g.fillRect(centerRectangle(disc.getWidth()),
                        calculateXPosition(discStack.getHeightOfObject(disc), disc.getHeight()),
                        disc.getWidth(),
                        disc.getHeight());
            }
        }
    }

    private int centerRectangle(int widthOfRectangle){
        return (this.getWidth() - widthOfRectangle) / 2;
    }

    private int calculateXPosition(int heightInStack, int discHeight){
        return this.getHeight() - 20 - heightInStack * (discHeight + 10);
    }

}
