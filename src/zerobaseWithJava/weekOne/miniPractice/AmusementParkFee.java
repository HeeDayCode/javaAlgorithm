package zerobaseWithJava.weekOne.miniPractice;

import java.util.Scanner;

public class AmusementParkFee {
//3번 문제
	public AmusementParkFee(int age, int time, String nationalChk, String welfareCardChk) {
		// TODO Auto-generated constructor stub
		int totalFee = 0;
		if (age >= 3) {
			if (nationalChk.equals("y") || welfareCardChk.equals("y")) {
				totalFee = 8000;
			}
			if (age < 13 || time > 17) {
				totalFee = 4000;
			}
		}
		System.out.println("입장료: "+totalFee);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("[입장권 계산]");

		int age = 0;
		int time = 0;
		String nationalChk = "";
		String welfareCardChk = "";

		Scanner scanner = new Scanner(System.in);
		System.out.print("나이를 입력해 주세요.(숫자):");
		age = scanner.nextInt();
		System.out.print("입자시간을 입력해 주세요.(숫자입력):");
		time = scanner.nextInt();
		System.out.print("국가유공자 여부를 입력해 주세요.(y/n):");
		nationalChk = scanner.next().toLowerCase();
		System.out.print("복지카드 여부를 입력해 주세요.(y/n):");
		welfareCardChk = scanner.next().toLowerCase();

		AmusementParkFee amusememtParkFee = new AmusementParkFee(age, time, nationalChk, welfareCardChk);
		scanner.close();// 리소스를 닫아주는 코드

	}

}
