package inputEx;

import java.util.Scanner;

public class 숫자입력받기 {

	public static void main(String[] args) {
		System.out.println("화면에 숫자를 입력해주세요.");
		// 사용자로부터 코드를 입력받는다.

		Scanner s = new Scanner(System.in);
		// 입력 받기 위해 스캐너 코드를 작성한 후 스캐너 모듈을 가져온다.

		double userInputNumber = s.nextInt();
		// 입력 받은 숫자를 정수값 변수 userInputNumber에 저장한다.

		System.out.println("당신이 입력한 숫자는 " + userInputNumber + " 입니다.");

	}

}
