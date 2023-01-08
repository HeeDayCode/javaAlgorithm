class Solution {
    public String solution(String s) {
        StringBuilder sb = new StringBuilder();
        for (char c: s.toCharArray()) {
            if ('a' <= c && c <= 'z') {
                c = (char)(c - 'a' + 'A');
            } else {
                c = (char)(c - 'A' + 'a');
            }
            sb.append(c);
        }
        return sb.toString();
    }
}