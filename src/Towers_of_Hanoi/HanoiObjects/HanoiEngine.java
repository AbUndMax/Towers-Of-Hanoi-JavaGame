package Towers_of_Hanoi.HanoiObjects;

import Generic_stack.ExtendedGenericStack;
import Towers_of_Hanoi.HanoiObjects.Disc;


// This class is used for the game operations and the stack-handling
public class HanoiEngine {

    // four discs with different sizes
    private final Disc size1Disc = new Disc(25, 20);
    private final Disc size2Disc = new Disc(50, 20);
    private final Disc size3Disc = new Disc(75, 20);
    private final Disc size4Disc = new Disc(100, 20);

    // create 3 stacks for the 3 towers
    private final ExtendedGenericStack<Disc>[] towerStacks = new ExtendedGenericStack[3];

    public HanoiEngine(){
        for (int i = 0; i < 3; i++) {
            towerStacks[i] = new ExtendedGenericStack<>();
        }

        // add discs to first tower (start position)
        towerStacks[0].push(size4Disc);
        towerStacks[0].push(size3Disc);
        towerStacks[0].push(size2Disc);
        towerStacks[0].push(size1Disc);
    }

    // these are used to access the current status of each stack
    public ExtendedGenericStack<Disc> getFirstTowerStack(){
        return towerStacks[0];
    }

    public ExtendedGenericStack<Disc> getSecondTowerStack(){
        return towerStacks[1];
    }

    public ExtendedGenericStack<Disc> getThirdTowerStack(){
        return towerStacks[2];
    }

    // move operators
    public void moveFromTo(int from, int to) {


        ExtendedGenericStack<Disc> fromStack = towerStacks[from - 1];
        if (fromStack.peek() == null) return; // if tha "from" stack is empty, nothing will happen.

        ExtendedGenericStack<Disc> toStack = towerStacks[to - 1];

        // if "to" stack is empty or if the disc on top of the "from" stack is smaller than the disc on top of the "to" stack
        if (toStack.peek() == null || fromStack.peek().getWidth() < toStack.peek().getWidth()) {
            toStack.push(fromStack.pop());
        }
        // printOverview(); // for a quick debug overview :)
    }

    // print overview of the stacks (mostly for debugging)
    private void printOverview(){
        int stackPosition = 0;
        String spacer = "  ";
        System.out.println("\n############### Quick view ###############");
        System.out.println("Height:      #1      #2      #3      #4");
        for (ExtendedGenericStack<Disc> stack : towerStacks) {
            if (stackPosition > 9) spacer = " ";
            System.out.println("stack #"+ stackPosition++ + spacer + stack.getObjectsInStack());
        }
        System.out.println("##########################################");
    }
}
