class Solution {
    public String solution(int[] arr) {
        StringBuilder sb = new StringBuilder();

        for (int n: arr) {
            sb.append((char)n);
        }
        return sb.toString();
    }
}