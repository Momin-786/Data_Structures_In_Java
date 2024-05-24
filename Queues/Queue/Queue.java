public class Queue  <T>
 {

    T[] arr = (T[]) new Object[5];
    int head = 0;
    int tail = -1;
    public boolean isEmpty()
    {
        return (tail<=-1);
    }
    public boolean isFull()
    {
        return (tail==arr.length-1);
    }
    public void enqueue(T data)
    {
        if(isFull())
        {
            System.out.println("Queue is full");
            return;
        }
        arr[++tail] = data;
    }
    // public T dequeue()
    // {
    //     if(isEmpty())
    //     {
    //         System.out.println("Queue is empty");
    //         return null;
    //     }
    //     return arr[head++];
    // }
    public T dequeue()
    {
        if(isEmpty())
        {
            System.out.println("Queue is empty");
            return null;
        }
        else
        {
            T data = arr[head];
           moveForward();
           return data;
        }
    }
    public T Front()
    {
        if(isEmpty())
        {
            System.out.println("Queue is empty");
            return null;
        }
        return arr[head];
    }
    public void size()
    {
        System.out.println("Size of the queue is: "+(tail-head+1));
    }
    // size shrinks so we add move forward method andupdate dque
    public void moveForward()
    {
        for(int i = 1; i<=tail; i++)
        {
            arr[i-1] = arr[i];
        }
        tail--;
    }
   
    public static void main(String[] args) {
        Queue<Integer> q = new Queue<>();
        q.dequeue();
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.enqueue(4);
        q.enqueue(5);
        q.size();
        q.dequeue();
        q.enqueue(6);
        q.size();
        q.dequeue();
        System.out.println("Front element is: "+q.Front());
        q.size();
    }
}
// O(n)