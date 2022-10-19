package programmers.level1.teamNote;

import java.util.Arrays;
import java.util.Collections;

public class StringArrayToIntArray {

	public static void main(String[] args) {

		long n = 142352;

		// 숫자로 들어온 값을 잘라서 문자열로 바꿈
		String[] temp = String.valueOf(n).split("");

		// String[] -> int[]로 변경
		int[] values = Arrays.stream(temp).mapToInt(Integer::parseInt).toArray();

		/*
		 * 생각행봐야하는 부분 1. 하나씩 .split("")으로 자르려면 문자열 이어야 하나 2. String[]을 정렬을 할거면 한번에
		 * Integer[]로 변경을 할 것을 그랬나?
		 */

		// int 배열 내림차순으로 정렬하기
		// 이때 배열이 int가 아니라 Integer배열이어야함
		Integer[] descendingValues = Arrays.stream(values).boxed().toArray(Integer[]::new);
		Arrays.sort(descendingValues, Collections.reverseOrder());

		//String으로 연결
		String result = "";
		for (int i = 0; i < descendingValues.length; i++) {
			result += descendingValues[i];
		}

		//string -> long으로 바꾸기
		Long.parseLong(result);
		
		// Array 한번에 출력하기
		System.out.println(Arrays.toString(descendingValues));

	}

}
