class Solution {
    public int solution(int n) {
        int result = 0;

        for (int i = 1; i < n + 1; i++) {
            if (n < i*i) {
                break;
            }

            if (n == i*i) {
                result = i;
                break;
            }
        }
        
        return result;
    }
}