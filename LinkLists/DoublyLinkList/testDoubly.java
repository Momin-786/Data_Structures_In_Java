public class testDoubly {
    public static void main(String args[])
    {

    doublyLinkList<String> d = new doublyLinkList<>();
    d.deleteAtStart();
    d.insertAtStart("Hello"); 
    d.insertAtEnd("World");
    d.Traverse();
    System.out.println("Dleted = "+ d.deleteAtEnd());
    d.Traverse();
    d.insertAtEnd("World");
    System.out.println("Dleted is:"+d.deleteAtStart());
    d.Traverse();
    d.insertAtStart("Hello");
    d.Traverse();
    System.out.println("Search= "+d.Search("By"));
    System.out.println("Searched= "+d.Search("Hello"));
    System.out.println("Search = "+d.SearchNode("m"));
    
    }
    

}
