package Generic_stack;

import java.util.ArrayList;
import java.util.NoSuchElementException;

public class ExtendedGenericStack<T> extends GenericStack<T> {

    /*
    we need:
    - Which items are in the stack (aka Array with all current items in the stack)
    - return height of an asked object
    - Stack size
    - set stack maximum (aka setMaxSize())
     */

    private int stackSize;
    private int maxSize;
    private ArrayList<T> objectsInStack = new ArrayList<>();


    public ExtendedGenericStack(int maxSize){
        super();
        this.stackSize = 0;
        this.maxSize = maxSize;
    }

    public ExtendedGenericStack(){
        this(4);
    }

    @Override
    public void push(T object){
        if (getSize() >= maxSize) throw new StackCapacityReached("stack is full!");
        super.push(object);
        objectsInStack.add(object);
        stackSize++;
    }

    @Override
    public T pop(){
        T object = super.pop();
        objectsInStack.removeLast();
        stackSize--;
        return object;
    }

    public int getSize(){
        return stackSize;
    }

    // returns an array with all objects in the stack
    public ArrayList<T> getObjectsInStack(){
        return objectsInStack;
    }

    // returns the height of an object in the stack
    public int getHeightOfObject(T object){
        if (!objectsInStack.contains(object)) throw new NoSuchElementException("object not in this stack");
        else return objectsInStack.indexOf(object) + 1;
    }

    // returns the maximum size of the stack
    public void setMaxSize(int maxSize){
        this.maxSize = maxSize;
    }

    // returns true if the object is on top of the stack
    public Boolean isOnTop(T object) {
        // if object height is equal to stack size, the object is on top
        return getHeightOfObject(object) == stackSize;
    }

}