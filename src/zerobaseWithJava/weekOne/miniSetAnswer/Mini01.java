package zerobaseWithJava.weekOne.miniSetAnswer;

public class Mini01 {

	public static void main(String[] args) {
		System.out.println("[구구단출력]");

		for (int j = 1; j <= 9; j++) {
			for (int i = 1; i <= 9; i++) {
				String msg = String.format("%02d * %02d = %02d\t", i, j, j * i);
				System.out.print(msg);
			}
			System.out.println("");
		}

	}

}
