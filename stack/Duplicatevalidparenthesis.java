import java.util.Stack;

public class Duplicatevalidparenthesis  {

    public static boolean isContainsDuplicates(String expression) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < expression.length(); i++) {
            char ch = expression.charAt(i);

            // Push everything except closing parenthesis
            if (ch != ')') {
                stack.push(ch);
            } else {
                int count = 0;

                // Count elements between '(' and ')'
                while ( stack.peek() != '(') {
                    stack.pop();
                    count++;
                }

                if (!stack.isEmpty()) {
                    stack.pop(); // Pop the opening '('
                }

                // If no elements were inside the parentheses, it's duplicate
                if (count == 0) {
                    return true;
                }
            }
        }

        return false;
    }

    public static void main(String[] args) {
        String expression = "((a+b)+((c+d)))";
        boolean isDuplicate = isContainsDuplicates(expression);
        System.out.println("Contains duplicate parentheses? " + isDuplicate);
    }
}
