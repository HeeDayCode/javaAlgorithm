import java.util.Arrays;

class Solution {
    public int solution(int[] A) {
        int N = A.length;
        int[] stock = new int[N];

        for (int i = 1; i < N; i++) {
            for (int j = 0; j < i; j++) {
                int temp = A[i] - A[j];
                if (temp > 0 && stock[j] < temp) {
                    stock[j] = temp;
                }
            }
        }
        return Arrays.stream(stock).max().getAsInt();
    }
}