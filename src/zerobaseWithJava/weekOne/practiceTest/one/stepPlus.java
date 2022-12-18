package zerobaseWithJava.weekOne.practiceTest.one;

public class stepPlus {

	
	public static int fact(int n) {

		if (n <= 1)
			return n;

		else 
			return fact(n-1) + n;

	}

	public static void main(String[] args) {
		int n = 10;
		int answer = fact(n);
        System.out.println(answer);
	}

}
