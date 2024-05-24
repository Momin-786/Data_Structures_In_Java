public class SinglyLinkList<T>{

class Node{
    T data;
    Node next;
}
Node start = null;
int size = 0;

public Boolean isEmpty(){
    if(start==null)
    return true;
    return false;
}

public void insertAtEnd(T value){
    Node n = new Node();
    n.data=value;
    n.next=null;
    if(isEmpty())
    {
        start=n;
    }
    else
    {
        Node temp = start ;
        while(temp.next!=null){
            temp = temp.next;
        }
        temp.next = n;
    }
    size++;
}
public void insertAtStart(T value)
{
    Node n = new Node();
    n.data= value;
    n.next=start;
    start = n;
    size++;
}
public void Traverse(){

    if(isEmpty()){
        System.out.println("LIst is Empty");
    }
    else{
        Node temp = start;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("Null");
        
    }
}
public void dleteAtStart()
{
    if(isEmpty())
    {
        System.out.println("Empty");
    }
    else{
        start = start.next;
    }
    size--;
}
public void dleteAtEnd(){

    if(isEmpty()){
        System.out.println("Empty");

    }
    else{
        Node temp  = start;
        while(temp.next.next!=null){
            temp= temp.next;
        }
        temp.next=null;
    }
    size--;
}
public int size(){
return size;
}
public static void main(String[] args)
{
    SinglyLinkList<Integer> obj = new SinglyLinkList<>();
  
        obj.insertAtEnd(1);
        obj.insertAtEnd(2);
        obj.insertAtStart(5);
        obj.insertAtStart(7);
        obj.insertAtStart(9);
        obj.Traverse();
        obj.dleteAtStart();
        obj.dleteAtEnd();
        obj.Traverse();
        System.out.println("Size: " + obj.size());
    
}
}
