package programmers.level1.teamNote;

public class Simplefor {

	public static void main(String[] args) {
		int num = 1234;
		String[] temp = String.valueOf(num).split("");

		int sum = 0;
		for (String s : temp) {
			sum += Integer.parseInt(s);
		}

		//System.out.println();
	}

}
