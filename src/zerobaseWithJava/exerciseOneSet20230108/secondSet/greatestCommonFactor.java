import java.util.Arrays;

class Solution {
    public int solution(int[] A) {
        Arrays.stream(A)
                .boxed()
                .sorted((x, y) -> y - x);
        int retVal = GCD(A[0], A[1]);

        for (int i = 2; i < A.length; i++) {
            retVal = GCD(retVal, A[i]);
        }

        return retVal;
    }

    int GCD(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return GCD(b, a % b);
        }
    }
}