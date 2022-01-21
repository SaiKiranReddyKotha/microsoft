package easy;

import java.util.Stack;

public class stackReversal {

    public static void reverseStack(Stack stack) {
        if(stack.isEmpty())
            return;
        String temp = (String) stack.pop();
        reverseStack(stack);
        insertAtBottom(stack, temp);
    }

    private static void insertAtBottom(Stack stack, String data) {
        if(stack.isEmpty()) {
            stack.push(data);
            return;
        }
        String temp = (String) stack.pop();
        insertAtBottom(stack, data);
        stack.push(temp);
    }
}
