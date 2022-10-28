package programmers.level1.threeeWeek.day1028;

import java.util.Arrays;

public class NonNumSum {

	public static int solution(int[] numbers) {
		int answer = 0;
		boolean[] existNum = new boolean[10];
		int checkNum = 0;
		Arrays.sort(numbers);

		for (int i = 0; i < numbers.length; i++) {
			// System.out.print(numbers[i]+" ");
			if (numbers[checkNum] == checkNum) {
				System.out.println("존재: "+numbers[checkNum]);
			} else {
				answer += numbers[checkNum];
                System.out.println("미존재: "+numbers[checkNum]);
				
			}
            checkNum++;
		}

		return answer;
	}

	public static void main(String[] args) {
		int[] numbers = { 1, 2, 3, 4, 5 };
		System.out.println(solution(numbers)); 
	}

}
