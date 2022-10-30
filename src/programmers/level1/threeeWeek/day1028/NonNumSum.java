package programmers.level1.threeeWeek.day1028;

import java.util.Arrays;

public class NonNumSum {

	public static int solution(int[] numbers) {
		// 1 ~ 9 까지의 합인 45에서 numbers의 합을 빼주도록 한다.
        int answer = 45;

        for(int number : numbers) {
            answer -= number;
        }    

        return answer;
	}

	public static void main(String[] args) {
		int[] numbers = { 1, 2, 3, 4, 6, 7, 8, 0 };
		System.out.println(solution(numbers)); 
	}

}
