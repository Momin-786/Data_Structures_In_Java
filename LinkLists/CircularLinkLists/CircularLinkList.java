class CircularLinkList <T>
{
class Node{
    T data;
    Node next;
    Node prev;
}
Node start = null;
 
public Boolean isEmpty()
{
    return (start==null);
    
}
public void insertAtStart (T value)
{
    Node n = new Node();
    n.data=value;
    if (isEmpty())
    {
        n.next=n;
        n.prev=n;
        start=n;

    }
    else 
    {
        n.next = start;
        n.prev=start.prev;
        n.prev.next = n;
        start.prev = n;
        start = n;
    }
}

public void insertAtEnd (T value)
{
    Node n = new Node();
    n.data=value;
    if (isEmpty())
    {
        n.next=n;
        n.prev=n;
        start=n;

    }
    else 
    {
        n.next = start;
        n.prev=start.prev;
        n.prev.next = n;               
        start.prev = n;
    
    }
}

public T deleteAtStart()
{
    if(isEmpty())
    {
        System.out.println("List Is Empty");
        return null;
    }
    else if(start.next==start)
    {
        T value = start.data;
        start=null;
        return value;
    }
    else
    {
        T value = start.data;
        start.next.prev = start.prev;
        start .prev.next  = start.next;
        start=start.next;
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
    else if(start.next==start)
    {
        T value = start.data;
        start=null;
        return value;
    }
    else
    {
        Node temp = start.prev;
        T value = temp.data;
        temp.next.prev = temp.prev;
        temp .prev.next  = temp.next;
       
       return value;
    }
}
public void Traverse()
{   
    
    Node t = start;
    do{  
         System.out.print(t.data+" <-> ");
        t=t.next;
    }
    while(t!=start);
    
}

public Boolean Search(T key)
{   if(isEmpty())
    return false;
    Node t = start;
    do
    {   if(t.data==key)
        {
            return true;
        }
        t=t.next;
    }
    while(t!=start);
    return false;
}

public Node Searchnode(T key)
{   if(isEmpty())
    return null;
    Node t = start;
    do
    {   if(t.data==key)
        {
            return t;
        }
        t=t.next;
    }
    while(t!=start);
    return null;
}
public static void main(String[] args) {
    CircularLinkList<Integer> circularList = new CircularLinkList<>();

    // Inserting elements at the start
    circularList.insertAtStart(5);
    circularList.insertAtStart(10);
    circularList.insertAtStart(15);

    // Inserting elements at the end
    circularList.insertAtEnd(20);
    circularList.insertAtEnd(25);

    // Traversing the list
    System.out.println("Circular Linked List:");
    circularList.Traverse();
    System.out.println(); // Just for formatting

    // Deleting an element from the start
    Integer deletedStart = circularList.deleteAtStart();
    System.out.println("Deleted from start: " + deletedStart);

    // Deleting an element from the end
    Integer deletedEnd = circularList.deleteAtEnd();
    System.out.println("Deleted from end: " + deletedEnd);

    // Traversing the list after deletion
    System.out.println("Circular Linked List after deletion:");
    circularList.Traverse();
    System.out.println(); // Just for formatting

    // Searching for an element
    int searchKey = 10;
    boolean isFound = circularList.Search(searchKey);
    System.out.println(searchKey + " is present in the list: " + isFound);

    // Searching for a node
    CircularLinkList.Node searchedNode = circularList.Searchnode(15);
    System.out.println("Node containing 15: " + searchedNode.data);
}
}
