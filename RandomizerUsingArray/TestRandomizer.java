import java.util.Scanner;
public class TestRandomizer
{
    public static void main(String args[])
    {  
         int size = 5;
        Randomizer r = new Randomizer(size);
        System.out.println("Enter positive integers:");
        Scanner s = new Scanner(System.in);
        for(int i = 1 ; i<=size ; i++)
        {
            int val = s.nextInt();
            r.input(val);
        }
        // randomizer is full not insert more values
        r.input(3); 
        // Delete value
        System.out.println("Deleted value:" +r.output());
        System.out.println("Deleted value:" +r.output());
        System.out.println("Deleted value:" +r.output());
        System.out.println("Deleted value:" +r.output());
        System.out.println("Deleted value:" +r.output());
        r.output();
    }

}    
