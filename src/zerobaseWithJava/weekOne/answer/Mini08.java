package zerobaseWithJava.weekOne.answer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Mini08 {



	public static long[] getAmount(long value) {

		long[] amount = {0, 0, 0, 0, 0, 0, 0, 0};

		if (value <= 12_000_000) {
			amount[0] = value;

		} else if (value <= 46_000_000) {
			amount[0] = 12_000_000;
			amount[1] = value - amount[0];

		} else if (value <= 88_000_000) {
			amount[0] = 12_000_000;
			amount[1] = 34_000_000;
			amount[2] = value - amount[0] - amount[1];

		} else if (value <= 150_000_000) {
			amount[0] = 12_000_000;
			amount[1] = 34_000_000;
			amount[2] = 42_000_000;
			amount[3] = value - amount[0] - amount[1] - amount[2];

		} else if (value <= 300_000_000) {
			amount[0] = 12_000_000;
			amount[1] = 34_000_000;
			amount[2] = 42_000_000;
			amount[3] = 62_000_000;
			amount[4] = value - amount[0] - amount[1] - amount[2] - amount[3];

		} else if (value <= 500_000_000) {
			amount[0] = 12_000_000;
			amount[1] = 34_000_000;
			amount[2] = 42_000_000;
			amount[3] = 62_000_000;
			amount[4] = 150_000_000;
			amount[5] = value - amount[0] - amount[1] - amount[2] - amount[3] - amount[4];

		} else if (value <= 1_000_000_000) {
			amount[0] = 12_000_000;
			amount[1] = 34_000_000;
			amount[2] = 42_000_000;
			amount[3] = 62_000_000;
			amount[4] = 150_000_000;
			amount[5] = 200_000_000;
			amount[6] = value - amount[0] - amount[1] - amount[2] - amount[3] - amount[4] - amount[5];

		} else {
			amount[0] = 12_000_000;
			amount[1] = 34_000_000;
			amount[2] = 42_000_000;
			amount[3] = 62_000_000;
			amount[4] = 150_000_000;
			amount[5] = 200_000_000;
			amount[6] = 500_000_000;
			amount[7] = value - amount[0] - amount[1] - amount[2] - amount[3] - amount[4] - amount[5] - amount[6];
		}

		return amount;
	}

	public static long[] getRate() {
		long[] rate = {6, 15, 24, 35, 38, 40, 42, 45};
		return rate;
	}

	public static int getRate(long value) {

		if (value <= 12_000_000) {
			return 6;
		} else if (value <= 46_000_000) {
			return 15;
		} else if (value <= 88_000_000) {
			return 24;
		} else if (value <= 150_000_000) {
			return 35;
		} else if (value <= 300_000_000) {
			return 38;
		} else if (value <= 500_000_000) {
			return 40;
		} else if (value <= 1_000_000_000) {
			return 42;
		} else {
			return 45;
		}

	}

	public static long getProgressiveTax(long value) {

		if (value <= 12_000_000) {
			return 0;
		} else if (value <= 46_000_000) {
			return 1_080_000;
		} else if (value <= 88_000_000) {
			return 5_220_000;
		} else if (value <= 150_000_000) {
			return 14_900_000;
		} else if (value <= 300_000_000) {
			return 19_400_000;
		} else if (value <= 500_000_000) {
			return 25_400_000;
		} else if (value <= 1_000_000_000) {
			return 25_400_000;
		} else {
			return 65_400_000;
		}

	}

	public static void main(String[] args) {
		System.out.print("\n\n");
		System.out.print("[과세금액 계산 프로그램]");
		System.out.print("\n");

		Scanner scanner = new Scanner(System.in);

		long input = 128_000_000;
		input = 48_000_000;

		System.out.print("연소득을 입력해 주세요.:");
		input = scanner.nextInt();

		long[] arrAmount = getAmount(input);
		long[] arrRate = getRate();

		long tax = 0;
		for (int i = 0; i < arrAmount.length; i++) {
			if (arrAmount[i] > 0) {
				System.out.printf("%10d * %2d%% = %10d"
					, arrAmount[i]
					, arrRate[i]
					, arrAmount[i] * arrRate[i] / 100
				);
				tax += (arrAmount[i] * arrRate[i] / 100);
				System.out.println("");
			}
		}

		System.out.println("");
		System.out.printf("[세율에 의한 세금]:\t\t\t%10d", tax);

		long simpleRate = getRate(input);
		long simpleTax = input * simpleRate / 100 - getProgressiveTax(input);

		System.out.println("");
		System.out.printf("[누진공제 계산에 의한 세금]:\t%10d", simpleTax);


		System.out.print("\n\n");
	}



}
