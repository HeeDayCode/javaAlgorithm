package zerobaseWithJava.weekOne.codingtestAnswer.problem2;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

class Solution {
    public int solution(String[] names) {
        Set<String> set = new HashSet<>(Arrays.asList(names));
        int n = set.size();
        int m = 4;

        int numerator = 1;
        int denominator = 1;
        for (int i = 0; i < m; i++) {
            numerator *= n - i;
            denominator *= (i + 1);
        }

        return numerator / denominator;
    }
}
