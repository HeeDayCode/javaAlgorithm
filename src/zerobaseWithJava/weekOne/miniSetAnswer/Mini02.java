package zerobaseWithJava.weekOne.miniSetAnswer;

import java.util.Scanner;

public class Mini02 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.printf("[캐시백 계산]");
		System.out.println("결제금액을 입력해 주세요.");
		int money = scanner.nextInt();

		int point = (int)((double)money * 0.1);

		point = point - point % 100;

		if (point > 300) {
			point = 300;
		}

		//String msg = String.format();
		System.out.printf("결제 금액은 %d원이고, 캐시백은 %d원 입니다.", money, point);

	}

}
