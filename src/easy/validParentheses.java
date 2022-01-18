package easy;

import java.util.Map;
import java.util.Stack;

public class validParentheses {

    private static final Map<Character, Character> map = Map.of('(', ')',
                                                                    '{', '}',
                                                                        '[',']');

    public boolean isValidParentheses (String s) {

        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (map.containsKey(c)) {
                stack.push(c);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }
                char open = stack.pop();
                if (map.get(open) != c) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }
}
