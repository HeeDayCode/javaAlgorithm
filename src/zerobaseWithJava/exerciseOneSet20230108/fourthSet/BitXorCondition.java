import java.util.Arrays;

class Solution {
    public int solution(String[] arr) {
        if (arr.length == 0) {
            return 0;
        }

        return Arrays.stream(arr)
            .mapToInt(s->Integer.parseInt(s, 2))
            .reduce((x, y) -> x ^ y)
            .getAsInt();
    }
}