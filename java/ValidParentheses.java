import java.util.Stack;

public class ValidParentheses {

    public static void main(String args[]) {
        System.out.println(new ValidParentheses().isValid("{[]}"));

    }

    public boolean isValid(String s) {
        Stack<String> stk = new Stack<>();
        recursive(s, stk);
        if (stk.empty()) {
            return true;
        } else
            return false;
    }

    public Stack<String> recursive(String s, Stack stk) {

        String character = "";
        if (s == null || s.equals("")) {
            return stk;
        } else {
            character = String.valueOf(s.charAt(0));
            s = s.substring(1, s.length());
        }

        if (!stk.empty() && inverse(stk.peek().toString(), character)) {
            stk.pop();
            return recursive(s, stk);
        }

        else {
            stk.push(character);
            recursive(s, stk);
        }

        return stk;

    }

    private boolean inverse(String peek, String s) {

        if (peek.equals("(") && s.equals(")"))
            return true;
        if (peek.equals("[") && s.equals("]"))
            return true;
        if (peek.equals("{") && s.equals("}"))
            return true;
        return false;
    }



}
