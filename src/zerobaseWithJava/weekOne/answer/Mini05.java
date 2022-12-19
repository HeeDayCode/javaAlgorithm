package zerobaseWithJava.weekOne.answer;

import java.time.LocalDate;
import java.util.Scanner;

public class Mini05 {


	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		//System.out.print("달력의 년도를 입력해 주세요.(yyyy):");
		//int year = scanner.nextInt();

		//System.out.print("달력의 월을 입력해 주세요.(mm):");
		//int month = scanner.nextInt();
		int year = 2022, month = 4;

		StringBuilder sb = new StringBuilder();

		LocalDate localDate = LocalDate.of(year, month, 1);

		int prefixCount = localDate.getDayOfWeek().getValue();
		int lastDay = localDate.plusMonths(1).minusDays(1).getDayOfMonth();

		System.out.println(localDate);
		System.out.println(lastDay);

		String[] title = {"일", "월", "화", "수", "목", "금", "토"};

		int totalCount = 0;

		for (int i = 0; i < title.length; i++) {
			//System.out.print(title[i] + "\t");
			sb.append(title[i] + "\t");
		}

		//System.out.print("\n");
		sb.append("\n");

		for (int i = 0; i < prefixCount; i++) {
			//System.out.print(" " + "\t");
			sb.append(" " + "\t");
			totalCount++;
		}

		for (int i = 1; i <= lastDay; i++) {
			//System.out.print(i + "\t");
			sb.append(i + "\t");
			totalCount++;
			if (totalCount % 7 == 0) {
				//System.out.print("\n");
				sb.append("\n");
			}
		}

		System.out.println(sb.toString());


	}

}
