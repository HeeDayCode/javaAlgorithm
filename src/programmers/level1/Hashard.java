package programmers.level1;

import java.util.Arrays;
import java.util.stream.Stream;

public class Hashard {

	// 자리수 숫자 합 구하는 함수
	public int intSum(int num) {
		int[] digits = Stream.of(String.valueOf(num).split("")).mapToInt(Integer::parseInt).toArray();
		int result = Arrays.stream(digits).sum();
		return result;
	}

	// 새로운 방식
	public boolean newIntSum(int num) {
		String[] temp = String.valueOf(num).split("");

		int sum = 0;
		for (String s : temp) {
			sum += Integer.parseInt(s);
		}

		if (num % sum == 0) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hashard sum = new Hashard();
		int x = 18;
		boolean answer = false;
		if (x % sum.intSum(x) == 0) {
			answer = true;
		}
		System.out.println("result: "+sum.newIntSum(x));
	}
}
