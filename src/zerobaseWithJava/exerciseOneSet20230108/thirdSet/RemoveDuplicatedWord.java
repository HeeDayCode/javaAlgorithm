import java.util.Stack;

class Solution {
    public String solution(String s) {
        Stack<Character> stack = new Stack<>();

        for (char c: s.toCharArray()) {
            if (stack.size() > 0 && stack.peek() == c) {
                stack.pop();
            } else {
                stack.push(c);
            }
        }

        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()) {
            sb.append(stack.pop());
        }
        return sb.reverse().toString();
    }
}