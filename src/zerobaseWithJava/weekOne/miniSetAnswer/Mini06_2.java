package zerobaseWithJava.weekOne.miniSetAnswer;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Mini06_2 {



	public static void main(String[] args) {
		System.out.print("\n\n");
		System.out.print("[투표 시뮬레이션 프로그램]");
		System.out.print("\n");

		Random random = new Random();

		long voteCount = 100000L;

		String[] rName = {
			"이재명", "윤석열", "심상정", "안철수"
		};
		double[] rRate = {
			0, 0, 0, 0
		};
		int[] r = {
			0, 0, 0, 0
		};

		int min = 0;
		int max = 4;

		for (int i = 1; i <= voteCount; i++) {
			int vote = random.nextInt(min + max) + min;
			r[vote]++;

			System.out.println("");
			String info = String.format("[투표진행율]: %04.2f%%, %d명 투표 => %s", (double) i* 100 / voteCount , i, rName[vote]);
			System.out.println(info);
			for (int j = 0; j < rRate.length; j++) {
				rRate[j] = (double) r[j] * 100 / voteCount;

				if (rName[j] != null && rName[j].length() > 0) {
					String message = String.format("[기호:%d] %s: %05.2f%%, (투표수: %d) ", j + 1, rName[j], rRate[j], r[j]);
					System.out.println(message);
				}
			}
		}

		int maxIndex = 0;
		int maxValue = r[0];
		for (int i = 0; i < r.length - 1; i++) {
			if (r[i] > r[i + 1]) {
				maxIndex = i;
				maxValue = r[i];
			}
		}

		System.out.println("[투표결과] 당선인: " + rName[maxIndex]);

		System.out.print("\n\n");
	}

}
