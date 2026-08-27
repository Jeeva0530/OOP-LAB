// Abstract Data Type Interface
interface StackADT {
    void push(int element) throws Exception;
    void display();
}

// Array implementation of the Stack interface
class ArrayStack implements StackADT {
    private int[] stack;
    private int top;
    private int capacity;

    public ArrayStack(int size) {
        capacity = size;
        stack = new int[capacity];
        top = -1; // Stack is initially empty
    }

    // PUSH operation with exception handling for overflow
    @Override
    public void push(int element) throws Exception {
        if (top == capacity - 1) {
            throw new Exception("Stack overflow: cannot push " + element + ", stack is full.");
        }
        top++;
        stack[top] = element;
        System.out.println("Pushed: " + element);
    }

    // Display operation
    @Override
    public void display() {
        if (top == -1) {
            System.out.println("Stack is empty.");
            return;
        }

        System.out.println("Stack elements (top to bottom):");
        for (int i = top; i >= 0; i--) {
            System.out.println(stack[i]);
        }
    }
}

// Main class
public class Main5 {
    public static void main(String[] args) {
        // Create a stack with capacity of 3
        StackADT stack = new ArrayStack(3);

        try {
            // Pushing elements
            stack.push(10);
            stack.push(20);
            stack.push(30);

            stack.display();

            // This will cause stack overflow
            stack.push(40);

        } catch (Exception e) {
            System.out.println("Error caught: " + e.getMessage());
        }
    }
}



