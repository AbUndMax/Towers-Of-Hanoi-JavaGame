package Towers_of_Hanoi.HanoiSwingComponents;

import Generic_stack.ExtendedGenericStack;
import Towers_of_Hanoi.HanoiObjects.Disc;

import javax.swing.*;
import java.awt.*;

public class TowerPanel extends JPanel {

    // the stack of discs that this panel represents
    private ExtendedGenericStack<Disc> discStack;

    public TowerPanel(ExtendedGenericStack<Disc> discStack){
        this.discStack = discStack;
    }

    @Override
    protected void paintComponent(Graphics g){

        // for each disc in the stack, draw a rectangle (representing the disc)
        for (Disc disc : discStack.getObjectsInStack()) {
            if (disc != null) { // if disc is null, just skip it
                g.fillRect(centerRectangle(disc.getWidth()),
                        calculateXPosition(discStack.getHeightOfObject(disc), disc.getHeight()),
                        disc.getWidth(),
                        disc.getHeight());
            }
        }
    }

    // center the rectangle in the panel
    private int centerRectangle(int widthOfRectangle){
        return (this.getWidth() - widthOfRectangle) / 2;
    }

    // calculate the x position of the rectangle
    private int calculateXPosition(int heightInStack, int discHeight){
        return this.getHeight() - 20 - heightInStack * (discHeight + 10);
    }

}
