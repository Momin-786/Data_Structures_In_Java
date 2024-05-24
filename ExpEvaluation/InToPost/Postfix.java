import java.util.Stack;
public class Postfix
{
    public static double Evaluation(String str)
    {
        Stack<Double> stk = new Stack<>();
        String [] exp = str.split(" ");
        for(int i =0; i<exp.length ; i++)
        {
               if(exp[i].length() >1 && Character.isDigit(exp[i].charAt(1)))
            {
                stk.push(Double.parseDouble(exp[i]));
            }
            else if(Character.isDigit(exp[i].charAt(0)))
            {
                stk.push(Double.parseDouble(exp[i]));
            }
            else
            {
                double op2 = stk.pop();
                double op1 = stk.pop();
                switch (exp[i])
                 {
                    case "+":
                        stk.push(op1+op2); 
                        break;
                    case "*":
                        stk.push(op1*op2); 
                            break;
                     case "-":
                     stk.push(op1-op2);    
                    default:
                    System.out.println("Invalidoperator");
                        break;
                }
                
            }
        }
        return stk.pop();
    }
    public static void main(String[] args) 
    {
        System.out.println(Evaluation("12.5 23 + 2 *"));
    }
}