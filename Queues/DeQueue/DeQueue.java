public class DeQueue  <T> {

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
    public void enqueueAtHead(T data)
    {
        if(isFull())
        {
            System.out.println("Queue is full");
            return;
        }
        moveBackward();
        arr[head] = data;

    }
    private void moveBackward()
    {
        for(int i = tail; i>=0; i--)
        {
            arr[i+1] = arr[i];
        }
        tail++;
    }
    public void enqueueAtTail(T data)
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
    public T dequeueAtHead()
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
    public T dequeueAtTail()
    {
        if(isEmpty())
        {
            System.out.println("Queue is empty");
            return null;
        }
        else
        {
           
           return arr[tail--];
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
        DeQueue<Integer> q = new DeQueue<>();
        q.isEmpty();
        q.enqueueAtHead(1);
        q.enqueueAtHead(2);
        q.enqueueAtHead(3);
        q.enqueueAtHead(4);
        q.enqueueAtHead(5);
        q.enqueueAtHead(6);
        q.size();
       System.out.println( q.dequeueAtHead());
        q.enqueueAtTail(7);
        System.out.println("Front element is: "+q.Front())  ;  
        q.size();
       System.out.println( q.dequeueAtTail());
        q.size();
        System.out.println("Front element is: "+q.Front())  ;  

    }
}
// O(n)