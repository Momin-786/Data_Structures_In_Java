import java.util.Stack;

public class InToPost
 {

    public static int Presidence(char p)
    {
        if(p=='^')
        {
            return 3;
        }
        if(p=='*' || p=='/')
        {
            return 2;
        }
        if(p=='-'|| p=='+')
        {
            return 1;
        }
        return -1;
    }

    public static String intoPost(String str)
    {
        Stack<Character> stk = new Stack<>();
        String res = "";
        for(int i = 0 ; i<str.length(); i++)
        {
            char c = str.charAt(i);
            if(Character.isLetterOrDigit(c))
            {
               res+=c + " ";  
            } 
            else if(c=='(')
            {
                stk.push('(');
            }
            else if(c==')')
            {
                while(!stk.isEmpty() && stk.peek()!='(')
                {
                    res+=stk.pop()+" ";
                }
                if(!stk.isEmpty())
                {
                    stk.pop();
                }
            }
            else {
                while (!stk.isEmpty() && Presidence(stk.peek())>=Presidence(c))
                {
                    res+=stk.pop()+" ";
                }
                stk.push(c);
            }
  
        }
         while(!stk.isEmpty())
        {
                res+=stk.pop()+" ";
        }
         return res;
    }
    public static void main(String[] args) {
        String s = "A+B*C-D/E^F*G*H";
        String p = intoPost(s);
        System.out.println(p);
    }
}