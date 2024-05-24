import java.util.Stack;
public class IntoPre {
    public static String reverse(String s) {

        String str2 = "";
        for (int i = s.length() -1; i >= 0; i--) {
            if (s.charAt(i) == '(') {
                s = str2 + ")";
            } else if (s.charAt(i) == ')') {
                s += "(";
            } else {
                str2 += s.charAt(i);
            }
        }
        return str2;
    }

    public static int precedence(char p) {
        if (p == '^') {
            return 3;
        }
        if (p == '*' || p == '/') {
            return 2;
        }
        if (p == '+' || p == '-') {
            return 1;
        }
        return -1;
    }

    public static String intoPre(String str) {
        Stack<Character> stk = new Stack<>();
        String strr = reverse(str);
        String res = "";
        for (int i = 0; i < strr.length(); i++) {
            char c = strr.charAt(i);
            if (Character.isDigit(c)) {
                res += c + " ";
            } else if (c == ')') {
                stk.push(')');
            } else if (c == '(') {
                while (!stk.isEmpty() && stk.peek() != ')') {
                    res += stk.pop() + " ";
                }
                if (!stk.isEmpty()) {
                    stk.pop();
                }
            } else {
                while (!stk.isEmpty() && precedence(stk.peek()) >= precedence(c)) {
                    res += stk.pop();
                }
                stk.push(c);
            }

        }
        while (!stk.isEmpty()) {
            res += stk.pop();
        }
        return reverse(res);
    }

    public static void main(String[] args) {
        String s = "momin";
        System.out.println(reverse(s));
        // String p = intoPre(s);
        // System.out.println(p);
    }
}
