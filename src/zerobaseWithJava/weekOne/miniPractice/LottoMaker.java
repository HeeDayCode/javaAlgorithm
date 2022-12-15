package zerobaseWithJava.weekOne.miniPractice;

import java.util.Scanner;

public class LottoMaker {
//7번 문제 고은희
	public int[] LottoMakerRandom(int count) {
		int lotto[] = new int[6]; // 로또 번호를 입력받을 배열을 선언해준다.
		System.out.print((char)count+"	");
		for (int i = 0; i < lotto.length; i++) {
			int num = (int) (Math.random() * 45) + 1; // 1~46까지의 임의의 수를 받는다.
			lotto[i] = num;
			for (int j = 0; j < i; j++) { // 중복된 번호가 있으면 이전 포문으로 돌아가 다시 시행한다.
				if (lotto[i] == lotto[j]) {
					i--;
					break;
				}
			}
			System.out.print(lotto[i] + " "); // 로또번호를 출력한다.

		}
		System.out.println(""); 
		return lotto;
	}
	
	public LottoMaker(int j) {
		// TODO Auto-generated constructor stub
		LottoMakerRandom(j);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("[로또 당첨 프로그램]");
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("로또 개수를 입력해 주세요.(숫자 1 ~ 10):");
		int gameCount = scanner.nextInt();
		
		for(int i =0 ; i<gameCount ; i++) {
			int j = i+65;
			LottoMaker lottoMaker = new LottoMaker(j);
			
		}
		
		
		
	}

}
