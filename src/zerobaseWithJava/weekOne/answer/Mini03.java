package zerobaseWithJava.weekOne.answer;

import java.util.Scanner;

public class Mini03 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("\n\n");
		System.out.print("[입장권 계산]");
		System.out.print("\n");

		System.out.println("나이를 입력해 주세요.(숫자):");
		int 나이 = scanner.nextInt();

		System.out.println("입장시간을 입력해 주세요.(숫자입력):");
		int 입장시간 = scanner.nextInt();

		System.out.println("국가유공자 여부를 입력해 주세요.(y/n):");
		String 국가유공자여부 = scanner.next();

		System.out.println("복지카드 여부를 입력해 주세요.(y/n):");
		String 복지카드여부 = scanner.next();

		/*
		System.out.println(나이 );
		System.out.println(입장시간 );
		System.out.println(국가유공자여부 );
		System.out.println(복지카드여부 );
		*/


		int 입장료 = 10000;

		if (나이 < 3) {
			//무료 입장
			입장료 = 0;

		} else if (나이 < 13 || 입장시간 > 17) {
			//특별 할인 조건
			입장료 = 4000;

		} else if ("y".equalsIgnoreCase(복지카드여부) || "y".equalsIgnoreCase(국가유공자여부)) {
			//일발 할인 조건
			입장료 = 8000;
		}

		System.out.println("입장료: " + 입장료);


	}

}
