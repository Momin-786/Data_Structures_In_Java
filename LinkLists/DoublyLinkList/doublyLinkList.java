class doublyLinkList <T>
{
class Node{
    T data;
    Node next;
    Node prev;
}
Node start = null;
Node end = null;
 
public Boolean isEmpty()
{
    return (start==null);
    
}
public void insertAtStart (T value)
{
    Node n = new Node();
    n.data=value;
    n.prev = null;
    if (isEmpty())
    {
        n.next=null;
        start = end = n ;
    }
    else 
    {
        n.next = start;
        start.prev = n;
        start = n;
    }
}

public void insertAtEnd (T value)
{
    Node n = new Node();
    n.data=value;
    n.next = null;
    if (isEmpty())
    {
        n.prev=null;
        start = end = n ;
    }
    else 
    {
        n.prev = end;
        end.next = n;
        end = n;
    }
}

public T deleteAtStart()
{
    if(isEmpty())                              
    {
        System.out.println("List Is Empty");
        return null;
    }
    else if(start==end)
    {
        T value = start.data;
        start=end=null;
        return value;
    }
    else
    {
        T value = start.data;
        start = start.next;
        start .prev  = null;
        return value;
    }
}
public T deleteAtEnd()
{
    if(isEmpty())
    {
        System.out.println("List Is Empty");
        return null;
    }
    else if(start==end)
    {
        T value = start.data;
        start=end=null;
        return value;
    }
    else
    {
        T value = end.data;
        end = end.prev;
        end.next = null;
        return value;
    }
}
public void Traverse()
{
    Node t = start;
    while(t!=null)
    {   System.out.print(t.data+"<->");
        t=t.next;
    }
    System.out.println(" Null");
}

public Boolean Search(T key)
{
    Node t = start;
    while(t!=null)
    {   if(t.data==key)
        {
            return true;
        }
        t=t.next;
    }
    return false;
}

public Node SearchNode(T key)
{
    Node t = start;
    while(t!=null)
    {   if(t.data==key)
        {
            return t;
        }
        t=t.next;
    }
    return null;
}
}