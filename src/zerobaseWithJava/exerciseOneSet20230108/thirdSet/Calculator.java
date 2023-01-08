import java.util.ArrayList;
import java.util.List;

class Solution {
    List<Integer> nums;
    List<Character> ops;

    public int solution(String s) {
        nums = new ArrayList<>();
        ops = new ArrayList<>();
        save(s, nums, ops);
        return calc(nums, ops);
    
    }

    void save(String s, List<Integer> nums, List<Character> ops) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (Character.isDigit(c)) {
                sb.append(c);
            } else {
                if (i == 0) {
                    nums.add(0);
                    ops.add(c);
                } else {
                    nums.add(Integer.parseInt(sb.toString()));
                    ops.add(c);
                }
                sb = new StringBuilder();
            }
        }
        nums.add(Integer.parseInt(sb.toString()));
    }

    int calc(List<Integer> nums, List<Character> ops) {
        if (nums.size() == 1) {
            return nums.get(0);
        }

        int num1 = nums.remove(0);
        int num2 = nums.remove(0);
        int calcNum = (ops.remove(0) == '+') ? num1 + num2 : num1 - num2;
        nums.add(0, calcNum);
        return calc(nums, ops);
    }
}