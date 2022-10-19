package programmers.level1.twoWeek.day1016;

import java.util.Arrays;

public class XAndNPlus {

	public static void main(String[] args) {
		int x= 5;
		int n = 4;
		 long[] answer = new long[n];
	        answer[0] = x;

	        for (int i = 1; i < n; i++) {
	            answer[i] = answer[i - 1] + x;
	        }

	        System.out.println(Arrays.toString(answer));

	}

}
