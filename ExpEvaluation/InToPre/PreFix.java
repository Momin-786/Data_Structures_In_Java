import java.util.*;
public class P{

    public static  double PreEvl(String str)
    {
        Stack<Double> stk = new Stack<>();
        String[] exp = str.split(" ");
        for(int i = exp.length-1 ; i>=0;i--)
        {
            if(Character.isDigit(exp[i].charAt(0)))
            {
                stk.push(Double.parseDouble(exp[i]));
            }
            else if(exp[i].equals("+"))
            {
                double op1 = stk.pop();
                double op2 = stk.pop();
                stk.push(op1+op2);
            }
            else if(exp[i].equals("*"))
            {
                double op1 = stk.pop();
                double op2 = stk.pop();
                stk.push(op1*op2);
            }

        }
       return stk.pop();
    }
    public static void main(String[] args) {
        System.out.println(PreEvl("+ 9 * 6 3.9"));
    }
}