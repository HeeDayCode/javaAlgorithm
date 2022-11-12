package programmers.level1.nov.twoWeek.day1112;

import java.util.Arrays;

public class GCDAndLCM2 {
	public int[] gcdlcm(int a, int b) {
		int[] answer = new int[2];

		answer[0] = gcd(a, b);
		answer[1] = (a * b) / answer[0];
		return answer;
	}

	public static int gcd(int p, int q) {
		if (q == 0)
			return p;
		return gcd(q, p % q);
	}

	// 아래는 테스트로 출력해 보기 위한 코드입니다.
	public static void main(String[] args) {
		GCDAndLCM2 c = new GCDAndLCM2();
		System.out.println(Arrays.toString(c.gcdlcm(3, 12)));
	}
}
