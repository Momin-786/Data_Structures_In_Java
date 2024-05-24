
public class ArrayStack <T> {
    private T[] stack;
    private int top;
    private int size;

    public ArrayStack(int size) {
        this.size = size;
        stack = (T[]) new Object[size];
        top = -1;
    }
    public boolean isEmpty()
    {
        return top == -1;
    }

    public boolean isFull()
    {
        return top == size - 1;
    }

    public void push(T data) {
        if (isFull()) 
        {
            System.out.println("Stack is full");
            return;
        }
        stack[++top] = data;
    }

    public T pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return null;
        }
        return stack[top--];
    }

    public T peek() {
        if (top == -1) {
            System.out.println("Stack is empty");
            return null;
        }
        return stack[top];
    }

   
    public void display() {
        if (top == -1) {
            System.out.println("Stack is empty");
            return;
        }
        for (int i = 0; i <= top; i++) {
            System.out.print(stack[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ArrayStack<Integer> stack = new ArrayStack<>(5);
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        stack.display();
        stack.push(60);
        stack.pop();
        stack.pop();
        stack.display();
        System.out.println(stack.peek());
        System.out.println(stack.isEmpty());
        System.out.println(stack.isFull());
    }


    
}