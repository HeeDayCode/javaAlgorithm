class Solution {
    public int solution(String s) {
        int[] numsCount = new int[10];

        for (int i = 0; i < s.length(); i++) {
            int num = Integer.parseInt(s.substring(i, i+1));
            numsCount[num]++;
        }

        int result = -1;
        int maxCount = 0;
        for (int i = 0; i < numsCount.length; i++) {
            if (maxCount < numsCount[i]) {
                result = i;
                maxCount = numsCount[i];
            }
        }
        return result;
    }
}