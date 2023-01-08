import java.util.Arrays;

class Solution {
    public String[] solution(String s) {
        String[] strings = s.split("[.,!? ]");
        return Arrays.stream(strings)
            .filter(word -> !word.equals(""))
            .map(word -> new StringBuilder(word).reverse().toString())
            .toArray(String[]::new);
    }
}