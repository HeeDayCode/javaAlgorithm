import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Solution {
    public String solution(String s) {
        Map<Character, Integer> map = new HashMap<>();

        for (char c: s.toCharArray()) {
            if (!map.containsKey(c)) {
                map.put(c, 0);
            }
            map.put(c, map.get(c) + 1);
        }
        
        Character mostAppearChar = null;
        int appearCount = 0;
        
        List<Character> chars = map.keySet()
                                   .stream()
                                   .collect(Collectors.toList());
        chars.sort(Comparator.naturalOrder());

        for (char c: chars) {
            int count = map.get(c);
            if (appearCount < count) {
                mostAppearChar = c;
                appearCount = count;
            }
        }
        return String.valueOf(mostAppearChar);
    }
}