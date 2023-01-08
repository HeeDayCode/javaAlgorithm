import java.util.ArrayList;
import java.util.List;

class Solution {
    public int solution(String S) {
        List<Character> chars = new ArrayList<>();

        for (int i = 0; i < S.length(); i++) {
            if (!chars.isEmpty() && 
            chars.get(chars.size() - 1) == S.charAt(i)) {
                chars.remove(chars.size() - 1);
                continue;
            }

            chars.add(S.charAt(i));
        }

        if (chars.isEmpty()) {
            return 1;
        }

        return 0;
    }
}