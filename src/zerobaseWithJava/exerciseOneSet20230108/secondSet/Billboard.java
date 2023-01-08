class Solution {
    public String solution(int n, String s, int t) {
        int repeatDuration = n + s.length();
        int optimizeTime = t % repeatDuration;
        
        StringBuilder sb = new StringBuilder();
        sb.append(".".repeat(n));
        sb.append(s);
        sb.append(".".repeat(n - 1));
        return sb.toString()
                 .substring(optimizeTime, optimizeTime + n);
    }
}