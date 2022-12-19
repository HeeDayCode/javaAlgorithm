package zerobaseWithJava.weekOne.codingtestAnswer.problem3;

class Solution {

    public int solution (int N) {
        int a = 1, b = 2;

        if (N == 1) {
            return a;
        }

        for (int i = 3; i <= N; i++) {
            int temp = a + b;
            a = b;
            b = temp;
        }

        return b;
    }
}
