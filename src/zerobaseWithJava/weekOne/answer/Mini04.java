package zerobaseWithJava.weekOne.answer;

import java.util.Random;
import java.util.Scanner;

public class Mini04 {


	public static String createJuminNo(int year, int month, int day, String gender) {

		//yymmdd-gnnnnnn

		int min = 111111;
		int max = 999999;
		Random random = new Random();
		int seq = random.nextInt(max - min + 1) + min;

		int genderValue = "m".equalsIgnoreCase(gender) ? 3 : 4;

		//year -= 2000;
		//year %= 100;

		String 주민번호 = String.format("%02d%02d%02d-%d%06d"
			, year - 2000, month, day, genderValue, seq);

		return 주민번호;
	}


	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("\n\n");
		System.out.print("[주민번호 생성]");
		System.out.print("\n");

		System.out.println("년도를 입력");
		int year = scanner.nextInt();

		System.out.println("월 입력:");
		int month = scanner.nextInt();

		System.out.println("일 입력:");
		int day = scanner.nextInt();

		System.out.println("성별 입력(m/f):");
		String gender = scanner.next();


		String juminNo = createJuminNo(year, month, day, gender);
		System.out.println(juminNo);

	}

}
