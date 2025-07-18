import java.util.Stack;

public class Implementation_stack {

    public static void insertAtBottom(Stack<Integer>stack,int data){
        if(stack.isEmpty()){
            stack.push(data);
            return;
        }
        int top=stack.pop();
        insertAtBottom(stack, data);
        stack.push(top);
    }

    public static void main(String[] args) {
        Stack<Integer>stack=new Stack<>();
        stack.push(23);
        stack.push(43);
        stack.push(53);
        stack.push(63);

        insertAtBottom(stack,4);

        while (!stack.isEmpty()) {
            System.out.println(stack.peek());
            stack.pop();
        }
    }
}