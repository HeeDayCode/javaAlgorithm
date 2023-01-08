class Solution {
    public int solution(int[] orders, int n) {
        int missCount = 0;
        int num = 0;
        int i = 0;

        while (missCount != n) {
            num++;
            if (i < orders.length && orders[i] == num) {
                i++;
            } else {
                missCount++;
            }
        }
        return num;
    }
}