class Solution {
    public int solution(int[] arr) {
        Integer result = null;

        for (int num: arr) {
            if (result == null || num < result) {
                result = num;
            }
        }
        return result;
    }
}