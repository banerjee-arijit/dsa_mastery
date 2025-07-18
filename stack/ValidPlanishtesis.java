import java.util.Stack;

public class ValidPlanishtesis {

    public static boolean isValidParentheses(String s){
        Stack<Character>stack=new Stack<>();

        for(int i=0;i<s.length();i++){
            switch(s.charAt(i)){
                case '(':
                case '{':
                case '[':
                stack.push(s.charAt(i));
                break;
                case ')':
                if(stack.isEmpty() || stack.pop()!='(')return false;
                break;
                case '}':
                if(stack.isEmpty() || stack.pop()!='{')return false;
                break;
                case ']':
                if(stack.isEmpty() || stack.pop()!='[')return false;
                break;
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String brackets = "([])";
       boolean isValid = isValidParentheses(brackets);
        System.out.println("Is valid: " + isValid);
    }
}