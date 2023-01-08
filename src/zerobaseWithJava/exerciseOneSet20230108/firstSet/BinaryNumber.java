class Solution {
    public int solution(String S) {
        String s = S.replaceFirst("^0*", "");
        int n = 0;

        if (s.length() != 0) {
            n = 1;
            String ss = s.substring(1);
            int one = (int)ss.chars()
                            .filter(c -> c == '1')
                            .count();
            int zero = (int)ss.chars()
                            .filter(c -> c == '0')
                            .count();

            n += (one * 2);
            n += zero;
        }

        return n;
    }
}