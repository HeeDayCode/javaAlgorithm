package zerobaseWithJava.weekOne.miniPractice;

import java.util.Calendar;
import java.util.Scanner;

public class CalendarMaker {
	private static final String YEAR = null;
// 5번 문제 고은희
	public CalendarMaker(int year, int month) {
		// TODO Auto-generated constructor stub
		System.out.println("["+year+"년 "+String.format("%02d", month)+"월]");
        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month - 1, 1);
 
        int lastDay = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);

        int startDay = calendar.get(Calendar.DAY_OF_WEEK);
 
        System.out.println("일\t월\t화\t수\t목\t금\t토");
        int currentDay = 1;
 
        for (int i = 1; i <= 42; i++) {
        	
            if (i < startDay) {
                System.out.print("\t");
            } else {
                System.out.printf("%02d\t", currentDay);
                currentDay++;
            }
 
            if (i % 7 == 0) {
               System.out.println();
            }
 
            if (currentDay > lastDay) {
                break;
            }
        }

		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("[달력 출력 프로그램]");
		int year = 0;
		int month = 0;

		Scanner scanner = new Scanner(System.in);
		System.out.print("출생년도를 입력해 주세요.(yyyy):");
		year = scanner.nextInt();
		System.out.print("출생월을 입력해 주세요.(mm):");
		month = scanner.nextInt();
		
		CalendarMaker calendar = new CalendarMaker(year,month);

	}

}
