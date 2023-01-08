import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

class Solution {
    public String solution(String[] bj, String[] one, String[] two) {
        int reward = 150;
        int prize = (one.length * reward) + (two.length * reward * 2) + (reward * 3);
        Set<String> set = new HashSet<>();
        set.addAll(Arrays.asList(bj));
        set.removeAll(Arrays.asList(one));
        set.removeAll(Arrays.asList(two));

        StringBuilder sb = new StringBuilder();
        sb.append(prize);
        sb.append("만원(");
        sb.append((String)set.toArray()[0]);
        sb.append(")");
        return sb.toString();
    }
}