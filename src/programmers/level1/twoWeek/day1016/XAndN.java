package programmers.level1.twoWeek.day1016;

import java.util.Arrays;

public class XAndN {

	public static void main(String[] args) {
		long[] answer = {};
		int x= 5;
		int n = 4;
		long startMultiple = Long.valueOf(x);
		int resultNum = n;
		answer = new long[resultNum];

		for (int i = 0; i < resultNum; i++) {
			answer[i] = Long.valueOf(startMultiple*(i + 1));
			
		}
		System.out.println(Arrays.toString(answer));
	}

}
