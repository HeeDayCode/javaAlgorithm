package zerobaseWithJava.weekOne.miniPractice;

import java.util.Random;
import java.util.Scanner;

public class IdMaker {
//3번 문제
	public IdMaker(String year, String month, String day, String sex) {
		// TODO Auto-generated constructor stub
		String sexData = "";
		if(sex.equals("m")) {
			sexData = "3";
		}else {
			sexData = "4";
		}
		Random random = new Random();
		int randomData = random.nextInt(1000000);
		System.out.println(year.substring(0,2)+month+day+"-"+sexData+randomData);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("[주민등록번호 계산]");
		
		String year = "";
		String month = "";
		String day = "";
		String sex = "";
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("출생년도를 입력해 주세요.(yyyy):");
		year = scanner.next();
		System.out.print("출생월을 입력해 주세요.(mm):");
		month = scanner.next();
		System.out.print("출생일을 입력해 주세요.(dd):");
		day = scanner.next();
		System.out.print("성별을 입력해 주세요.(m/f):");
		sex = scanner.next().toLowerCase();

		IdMaker idMaker = new IdMaker(year,month,day,sex);
		scanner.close();
	}

}
