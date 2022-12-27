package zerobaseWithJava.weekThree.AnswerStudy.oneTest.problem1;

import java.util.Arrays;

class Solution {
    public int solution(int n) {
        int[] intArray = new int[n];

        for (int i = 2; i < n; i++) {
            intArray[i] = 1;
        }

        for (int i = 2; i < n; i++) {
            int num = i * 2;
            while (num < n) {
                intArray[num] = 0;
                num += i;
            }
        }

        return Arrays.stream(intArray).sum();
    }
}
