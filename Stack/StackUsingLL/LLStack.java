public class LLStack <T>
{
    class Node{
        T data;
        Node next;
    }
    Node top = null;
    int size = 0;
    public Boolean isEmpty()
    {
        return(top==null);
    }
    public void push(T value)
    {
        Node n =new Node();
        n.data = value;
        n.next=top;
        top=n;
        size++;
    }
    public T pop()
    {
        if(isEmpty())
        {
            System.out.println("STACK UNDERFLOW");
            return null;
        }
        else
        {
        T data = top.data;
        size--;
        top = top.next;
        return data;
           
        }
        
    }
    public T peek()
    {
        if(isEmpty())
        {

            return null;
        }
        else
         return top.data;
    }
    public void Taverse()
    {
        if(isEmpty())
        {
            System.out.println("STACK UNDERFLOW");
        }
        else
        {
            Node temp = top;
            while(temp!=null)
            {
                System.out.println("|\t "+temp.data+ "\t|");
                System.out.println("|_______________|");
                temp = temp.next;
            }
        }
        System.out.println("");
    }
    public int size()
    {
        return size;
    }
    public static void main(String [] args)
    {
        LLStack<Integer> i = new LLStack<>();
        i.Taverse();
        i.push(8);
        i.push(2);
        i.push(0);
        i.push(4);
        i.push(5);
        i.Taverse();
        System.out.println("Poped value is : "+i.pop());
        System.out.println("Peek is: "+i.peek());
        i.Taverse();
        System.out.println("Size = "+i.size());
    }
}