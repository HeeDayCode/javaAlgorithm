
package zerobaseWithJava.weekOne.answer;

import java.util.*;

public class Mini07 {



	public static void main(String[] args) {
		System.out.print("\n\n");
		System.out.print("[로또 당첨 프로그램]");
		System.out.print("\n\n");

		Scanner scanner = new Scanner(System.in);

		System.out.print("로또 개수를 입력해 주세요.(숫자 1 ~ 10):");
		int lotteCount = scanner.nextInt();

		int LOTTE_COUNT = 6;

		int[][] userLotte = new int[lotteCount][LOTTE_COUNT];
		int[] userLotteCount = new int[lotteCount];
		int[] winLotte = {0, 0, 0, 0, 0, 0};

		Integer[] arrNo = {
			1, 2, 3, 4, 5, 6, 7, 8, 9, 10
			, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20
			, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30
			, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40
			, 41, 42, 43, 44, 45
		};

		//1, 45, 3, 2, 10

		Random random = new Random();

		for (int i = 0; i < lotteCount; i++) {
			ArrayList<Integer> noList = new ArrayList<>(Arrays.asList(arrNo));

			for (int j = 0; j < LOTTE_COUNT; j++) {
				int min = 0;
				int max = noList.size();
				int index = random.nextInt(max) + min;

				int no = noList.get(index);
				userLotte[i][j] = no;

				noList.remove(index);
			}
		}

		//정렬
		for (int i = 0; i < lotteCount; i++) {
			Arrays.sort(userLotte[i]);
		}

		//구매 로또 출력
		for (int i = 0; i < lotteCount; i++) {
			System.out.printf("%c\t", (i + 65));
			for (int j = 0; j < LOTTE_COUNT; j++) {
				if (j > 0) {
					System.out.print(",");
				}
				System.out.print(String.format("%02d", userLotte[i][j]));
			}
			System.out.print("\n");
		}

		//로또 발표 구하는 부분
		System.out.println("");
		System.out.println("[로또 발표]");
		{
			ArrayList<Integer> noList = new ArrayList<>(Arrays.asList(arrNo));

			for (int j = 0; j < LOTTE_COUNT; j++) {
				int min = 0;
				int max = noList.size();
				int index = random.nextInt(max) + min;

				int no = noList.get(index);
				winLotte[j] = no;

				noList.remove(index);
			}
		}

		//정렬(로또 발표)
		for (int i = 0; i < lotteCount; i++) {
			Arrays.sort(winLotte);
		}

		for (int j = 0; j < LOTTE_COUNT; j++) {
			if (j == 0) {
				System.out.print("\t");
			} else {
				System.out.print(",");
			}
			System.out.print(String.format("%02d", winLotte[j]));
		}

		//내 로또 당첨 확인
		for (int i = 0; i < lotteCount; i++) {
			int winCount = 0;

			for (int j = 0; j < LOTTE_COUNT; j++) {
				int lotteNo = userLotte[i][j];

				for (int index = 0; index < LOTTE_COUNT; index++) {
					int winNo = winLotte[index];
					if (winNo == lotteNo) {
						winCount++;
						break;
					}
				}
			}

			userLotteCount[i] = winCount;
		}

		System.out.print("\n");


		//결과출력
		System.out.println("");
		System.out.println("[내 로또 결과]");
		for (int i = 0; i < lotteCount; i++) {
			System.out.printf("%c\t", (i + 65));
			for (int j = 0; j < LOTTE_COUNT; j++) {
				if (j > 0) {
					System.out.print(",");
				}
				System.out.print(String.format("%02d", userLotte[i][j]));
			}
			System.out.printf(" => %d개 일치", userLotteCount[i]);
			System.out.print("\n");
		}


		System.out.print("\n\n");
	}

}
