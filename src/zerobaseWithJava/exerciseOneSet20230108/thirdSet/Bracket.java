import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Stack;

class Solution {
    public int solution(String S) {
        Stack<Character> stack = new Stack<>();
        Map<Character, Character> map = new HashMap<>();
        Set<Character> openerSet = Set.of('(', '{', '<', '[');
        Set<Character> closerSet = Set.of(')', '}', '>', ']');

        map.put(')', '(');
        map.put('}', '{');
        map.put('>', '<');
        map.put(']', '[');

        for (char c: S.toCharArray()) {
            if (openerSet.contains(c)) {
                stack.push(c);
            } else if (closerSet.contains(c)) {
                if (!stack.isEmpty()) {
                    char top = stack.pop();
                    if (map.get(c) != top) {
                        return 0;
                    }
                } else {
                    return 0;
                }
            }
        }

        if (stack.isEmpty()) {
            return 1;
        } else {
            return 0;
        }
    }
}