import java.util.Random;
public class Randomizer
{
    private int[] integer;
    private int size;
    private Random randNum;

    public Randomizer(int range)
    {
        integer = new int[range];
        for(int i =0 ; i < range ; i++ )
        {
            integer[i]=-1;
        }
        size=0;
        randNum = new Random();
    }

    public Boolean isEmpty()
    {
        return size==0;
    }
    public Boolean isFull()
    {
        return size == integer.length;
    }
    public void input(int value)
    {
        if(isFull())
        {
            System.out.println("Randomizer is Full");
            return;
        }
        if(value<0)
        {
            System.out.println("Enter Positive Integers Only");
            return;
        }
        // Place integer in random index
        int index = randNum.nextInt(integer.length);
        while(integer[index]!=-1)
        {
            index = randNum.nextInt(integer.length);
        }
        integer[index] = value;
        size++;
    }
    public int output()
    {
       if(isEmpty())
       {
        System.out.println("Randomizer is empty");
        return -1;
       }
        int index = randNum.nextInt(integer.length);
        while(integer[index]==-1)
        {
            index = randNum.nextInt(integer.length);
        }
        // Delete integer from randomindex
        int var = integer[index];
        integer[index] = -1;
        size--;
        return var;
    }
}