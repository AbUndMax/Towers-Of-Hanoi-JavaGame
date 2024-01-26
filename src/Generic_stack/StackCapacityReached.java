package Generic_stack;

public class StackCapacityReached extends RuntimeException{
    public StackCapacityReached(String message) {
        super(message);
    }
}