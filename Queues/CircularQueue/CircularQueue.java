public class CircularQueue<T>{

    private int head = 0;
    private int tail = 0;
    private int n;
    private T[] arr;

    public CircularQueue(int capacity){
        n = capacity;
        arr = (T[]) new Object[capacity];
    }
    public boolean isEmpty()
    {
        return head==tail;
    }
    public boolean isFull()
    {
        return (tail-head)== n;
    }

    public void size(){
        System.out.println("Size of the queue is: "+(tail-head));
    }
    public void enqueue(T data){
        if(isFull()){
            System.out.println("Queue is full");
            return;
        }
        arr[tail++%n] = data;
        
    }
    public T dequeue()
    {
        if(isEmpty()){
            System.out.println("Queue is empty");
            return null;
        }

         return arr[head++%n];
    }
    public T Front(){
        if(isEmpty()){
            System.out.println("Queue is empty");
            return null;
        }
        return arr[head%n];
    }
     
    public static void main(String[] args) {
        CircularQueue<Integer> q = new CircularQueue<>(6);
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.enqueue(4);
        q.enqueue(5);
        q.enqueue(6);
        q.size();
        q.dequeue();
        System.out.println("Front element is: "+q.Front());
        q.size();
}
}
// priority implementation and load balance is advantage
// O(1 )