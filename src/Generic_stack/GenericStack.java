package Generic_stack;

import java.util.NoSuchElementException;

public class GenericStack<T> implements Stack<T> {

    private Node<T> first;

    private static class Node<T>{
        private T object;
        private Node<T> nextNode;

        private Node(T object, Node<T> nextNode){
            this.object = object;
            this.nextNode = nextNode;
        }
    }

    public GenericStack() {
        first = null;
    }

    @Override
    public void push(T object){
        // new Node
        Node<T> newNode = new Node<>(object, first);
        // set current Node to new Node
        first = newNode;
    }

    @Override
    public T pop(){
        if (first == null) throw new NoSuchElementException("Stack is empty!");
        // get object of current Node
        T returnObject = first.object;
        // set current Node to next Node (current node is removed from stack)
        first = first.nextNode;
        // return the object
        return returnObject;
    }

    public T peek(){
        if (this.first != null)
            return this.first.object;
        else
            return null;
    }
}
