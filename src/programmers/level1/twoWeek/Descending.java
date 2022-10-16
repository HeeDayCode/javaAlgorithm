package programmers.level1.twoWeek;

import java.util.Arrays;
import java.util.Collections;

public class Descending { // 정수 내림차순으로 배치하기 문제풀이

	public static void main(String[] args) {
		long answer = 0;
		long n = 2343525;

		String[] temp = String.valueOf(n).split("");

		int[] values = Arrays.stream(temp).mapToInt(Integer::parseInt).toArray();

		Integer[] descendingValues = Arrays.stream(values).boxed().toArray(Integer[]::new);
		Arrays.sort(descendingValues, Collections.reverseOrder());

		// System.out.println(Arrays.toString(descendingValues));

		String result = "";
		for (int i = 0; i < descendingValues.length; i++) {
			result += descendingValues[i];
		}

	}

}
