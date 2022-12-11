package zerobaseWithJava.weekOne.miniPractice;

import java.util.Scanner;

public class Cashback {

	public Cashback(int price) {
		// TODO Auto-generated constructor stub
		int cashbackPrice = 0;
		cashbackPrice = price/10;
		if(cashbackPrice<300) {
			cashbackPrice = (int) (Math.floor(cashbackPrice / 100) * 100);
		}else {
			cashbackPrice = 300;
		}
		
		System.out.println("결제 금액은 "+price+"원이고, 캐시백은 "+cashbackPrice+"원 입니다.");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("[캐시백 계산]");
		System.out.print("결제 금액을 입력해 주세요.(금액):");

		Scanner scanner = new Scanner(System.in);
		int price = scanner.nextInt();
		
		Cashback cashbackCount = new Cashback(price);
		scanner.close();
		 
	}

}
